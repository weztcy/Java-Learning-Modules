// Mendemonstrasikan penggunaan PreparedStatement untuk keamanan parameterisasi dan pencegahan SQL Injection.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class JDBCPreparedStatement {
    public static void main(String[] args) {
        System.out.println("=== 256. Penggunaan PreparedStatement & Pencegahan SQL Injection ===");

        DriverPrepHelper.aktifkan();

        String url = "jdbc:simulasi-prep://localhost:3306/toko";
        // Kueri dengan placeholder tanda tanya (?)
        String sql = "INSERT INTO produk (id, nama_produk, harga, stok) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, "user", "pass");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            System.out.println("SQL Template: " + sql);

            // Mengisi nilai parameter sesuai indeks (dimulai dari 1)
            pstmt.setInt(1, 101);                           // Parameter 1: id
            pstmt.setString(2, "Monitor Gaming 24 Inci");   // Parameter 2: nama_produk
            pstmt.setDouble(3, 1850000.0);                  // Parameter 3: harga
            pstmt.setInt(4, 15);                            // Parameter 4: stok

            System.out.println("-> Parameter 1 (ID)    : 101");
            System.out.println("-> Parameter 2 (Nama)  : Monitor Gaming 24 Inci");
            System.out.println("-> Parameter 3 (Harga) : Rp 1,850,000.00");
            System.out.println("-> Parameter 4 (Stok)  : 15 unit");

            int baris = pstmt.executeUpdate();
            System.out.println("Data berhasil disimpan via PreparedStatement. Baris terpengaruh: " + baris);

            // Keuntungan: Tipe data disanitasi otomatis, terhindar dari bahaya manipulasi string SQL Injection
            System.out.println("Keamanan: Karakter berbahaya seperti tanda kutip (') diescape otomatis oleh driver.");
        } catch (SQLException e) {
            System.err.println("Kesalahan: " + e.getMessage());
        }
    }
}

class DriverPrepHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverPrepHelper()); } catch (SQLException e) {}
    }
    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;
        PreparedStatement mock = (PreparedStatement) java.lang.reflect.Proxy.newProxyInstance(
            PreparedStatement.class.getClassLoader(),
            new Class<?>[]{PreparedStatement.class},
            (p, m, args) -> {
                if (m.getName().equals("executeUpdate")) return 1;
                return null;
            }
        );
        return (Connection) java.lang.reflect.Proxy.newProxyInstance(
            Connection.class.getClassLoader(),
            new Class<?>[]{Connection.class},
            (p, m, args) -> {
                if (m.getName().equals("prepareStatement")) return mock;
                return null;
            }
        );
    }
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-prep:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
