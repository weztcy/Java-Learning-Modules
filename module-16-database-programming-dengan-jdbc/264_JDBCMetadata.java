// Mendemonstrasikan inspeksi struktur database dan metadata kueri dengan DatabaseMetaData dan ResultSetMetaData.
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCMetadata {
    public static void main(String[] args) {
        System.out.println("=== 264. Inspeksi Metadata Database & ResultSet ===");

        DriverMetaHelper.aktifkan();

        String url = "jdbc:simulasi-meta://localhost:3306/enterprise";
        try (Connection conn = DriverManager.getConnection(url, "dba", "dba123")) {

            // 1. DatabaseMetaData: Informasi tentang RDBMS dan driver
            DatabaseMetaData dbMeta = conn.getMetaData();
            System.out.println("--- 1. Informasi Database (DatabaseMetaData) ---");
            System.out.println("Nama Produk DB    : " + dbMeta.getDatabaseProductName());
            System.out.println("Versi Produk DB   : " + dbMeta.getDatabaseProductVersion());
            System.out.println("Nama Driver JDBC  : " + dbMeta.getDriverName());
            System.out.println("Versi Driver JDBC : " + dbMeta.getDriverVersion());
            System.out.println("Mendukung Transaksi: " + dbMeta.supportsTransactions());

            // 2. ResultSetMetaData: Informasi tentang struktur kolom hasil kueri
            System.out.println("\n--- 2. Struktur Kolom (ResultSetMetaData) ---");
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM produk")) {

                ResultSetMetaData rsMeta = rs.getMetaData();
                int jumlahKolom = rsMeta.getColumnCount();
                System.out.println("Jumlah Kolom: " + jumlahKolom);
                System.out.println("-----------------------------------------------------------------");
                System.out.printf("%-4s | %-16s | %-15s | %-10s%n", "No", "Nama Kolom", "Tipe SQL", "Bisa Null?");
                System.out.println("-----------------------------------------------------------------");

                for (int i = 1; i <= jumlahKolom; i++) {
                    String namaKolom = rsMeta.getColumnName(i);
                    String tipeKolom = rsMeta.getColumnTypeName(i);
                    String nullable = (rsMeta.isNullable(i) == ResultSetMetaData.columnNullable) ? "YES" : "NO";
                    System.out.printf("%-4d | %-16s | %-15s | %-10s%n", i, namaKolom, tipeKolom, nullable);
                }
                System.out.println("-----------------------------------------------------------------");
            }

        } catch (SQLException e) {
            System.err.println("Kesalahan Metadata: " + e.getMessage());
        }
    }
}

class DriverMetaHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverMetaHelper()); } catch (SQLException e) {}
    }
    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;

        DatabaseMetaData mockDbMeta = (DatabaseMetaData) java.lang.reflect.Proxy.newProxyInstance(
            DatabaseMetaData.class.getClassLoader(),
            new Class<?>[]{DatabaseMetaData.class},
            (p, m, args) -> {
                String n = m.getName();
                if (n.equals("getDatabaseProductName")) return "MySQL Enterprise Engine";
                if (n.equals("getDatabaseProductVersion")) return "8.0.35-community";
                if (n.equals("getDriverName")) return "Simulasi MySQL JDBC Driver";
                if (n.equals("getDriverVersion")) return "8.0.35";
                if (n.equals("supportsTransactions")) return true;
                return null;
            }
        );

        String[][] kolomInfo = {
            {"id_produk", "INT", "0"},
            {"kode_sku", "VARCHAR", "0"},
            {"nama_produk", "VARCHAR", "0"},
            {"harga_jual", "DOUBLE", "1"}
        };

        ResultSetMetaData mockRsMeta = (ResultSetMetaData) java.lang.reflect.Proxy.newProxyInstance(
            ResultSetMetaData.class.getClassLoader(),
            new Class<?>[]{ResultSetMetaData.class},
            (p, m, args) -> {
                String n = m.getName();
                if (n.equals("getColumnCount")) return kolomInfo.length;
                if (n.equals("getColumnName")) return kolomInfo[(Integer) args[0] - 1][0];
                if (n.equals("getColumnTypeName")) return kolomInfo[(Integer) args[0] - 1][1];
                if (n.equals("isNullable")) return Integer.parseInt(kolomInfo[(Integer) args[0] - 1][2]);
                return null;
            }
        );

        ResultSet mockRs = (ResultSet) java.lang.reflect.Proxy.newProxyInstance(
            ResultSet.class.getClassLoader(),
            new Class<?>[]{ResultSet.class},
            (p, m, args) -> {
                if (m.getName().equals("getMetaData")) return mockRsMeta;
                return null;
            }
        );

        Statement mockStmt = (Statement) java.lang.reflect.Proxy.newProxyInstance(
            Statement.class.getClassLoader(),
            new Class<?>[]{Statement.class},
            (p, m, args) -> {
                if (m.getName().equals("executeQuery")) return mockRs;
                return null;
            }
        );

        return (Connection) java.lang.reflect.Proxy.newProxyInstance(
            Connection.class.getClassLoader(),
            new Class<?>[]{Connection.class},
            (p, m, args) -> {
                if (m.getName().equals("getMetaData")) return mockDbMeta;
                if (m.getName().equals("createStatement")) return mockStmt;
                return null;
            }
        );
    }
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-meta:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
