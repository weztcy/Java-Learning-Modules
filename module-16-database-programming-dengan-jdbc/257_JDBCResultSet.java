// Mendemonstrasikan pembacaan data hasil kueri menggunakan kursor ResultSet.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCResultSet {
    public static void main(String[] args) {
        System.out.println("=== 257. Membaca Data Menggunakan ResultSet ===");

        DriverResultSetHelper.aktifkan();

        String url = "jdbc:simulasi-rs://localhost:3306/kampus";
        String kueri = "SELECT nim, nama, ipk, semester FROM mahasiswa ORDER BY nim ASC";

        try (Connection conn = DriverManager.getConnection(url, "user", "pass");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(kueri)) {

            System.out.println("Hasil Kueri: " + kueri);
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("%-10s | %-20s | %-6s | %-8s%n", "NIM", "NAMA MAHASISWA", "IPK", "SEMESTER");
            System.out.println("-----------------------------------------------------------------");

            // Method rs.next() memajukan kursor baris per baris; mengembalikan false jika data habis
            while (rs.next()) {
                // Mengambil nilai berdasarkan nama kolom atau tipe data kolom
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                double ipk = rs.getDouble("ipk");
                int semester = rs.getInt("semester");

                System.out.printf("%-10s | %-20s | %-6.2f | Sem %-4d%n", nim, nama, ipk, semester);
            }
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Pembacaan seluruh baris data selesai.");
        } catch (SQLException e) {
            System.err.println("Gagal membaca ResultSet: " + e.getMessage());
        }
    }
}

class DriverResultSetHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverResultSetHelper()); } catch (SQLException e) {}
    }
    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;

        String[][] data = {
            {"2024001", "Ahmad Fauzi", "3.85", "4"},
            {"2024002", "Siti Nurhaliza", "3.92", "4"},
            {"2024003", "Budi Santoso", "3.45", "6"},
            {"2024004", "Dewi Lestari", "3.78", "2"}
        };

        ResultSet mockRs = (ResultSet) java.lang.reflect.Proxy.newProxyInstance(
            ResultSet.class.getClassLoader(),
            new Class<?>[]{ResultSet.class},
            new java.lang.reflect.InvocationHandler() {
                int index = -1;
                @Override
                public Object invoke(Object proxy, java.lang.reflect.Method m, Object[] args) {
                    String name = m.getName();
                    if (name.equals("next")) {
                        index++;
                        return index < data.length;
                    }
                    if (name.equals("getString")) {
                        String col = (String) args[0];
                        if (col.equals("nim")) return data[index][0];
                        if (col.equals("nama")) return data[index][1];
                    }
                    if (name.equals("getDouble")) {
                        return Double.parseDouble(data[index][2]);
                    }
                    if (name.equals("getInt")) {
                        return Integer.parseInt(data[index][3]);
                    }
                    return null;
                }
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
                if (m.getName().equals("createStatement")) return mockStmt;
                return null;
            }
        );
    }
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-rs:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
