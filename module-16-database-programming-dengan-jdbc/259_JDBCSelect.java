// Mendemonstrasikan pembacaan data kondisional dengan klausa WHERE dan pemformatan data tabel.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class JDBCSelect {
    public static void main(String[] args) {
        System.out.println("=== 259. Operasi Pengambilan Data (SQL SELECT) ===");

        DriverSelectHelper.aktifkan();

        String url = "jdbc:simulasi-select://localhost:3306/hrd";
        // Kueri seleksi dengan kriteria departemen dan batas minimum gaji
        String kueri = "SELECT id_karyawan, nama, jabatan, gaji FROM karyawan WHERE departemen = ? AND gaji >= ?";

        try (Connection conn = DriverManager.getConnection(url, "hr_user", "hr_pass");
             PreparedStatement pstmt = conn.prepareStatement(kueri)) {

            String targetDepartemen = "Engineering";
            double minGaji = 8000000.0;

            pstmt.setString(1, targetDepartemen);
            pstmt.setDouble(2, minGaji);

            System.out.println("Filter Pencarian : Departemen = " + targetDepartemen + ", Min Gaji = Rp " + minGaji);
            System.out.println("----------------------------------------------------------------------");
            System.out.printf("%-5s | %-18s | %-20s | %-12s%n", "ID", "NAMA KARYAWAN", "JABATAN", "GAJI BULANAN");
            System.out.println("----------------------------------------------------------------------");

            try (ResultSet rs = pstmt.executeQuery()) {
                int totalBaris = 0;
                while (rs.next()) {
                    int id = rs.getInt("id_karyawan");
                    String nama = rs.getString("nama");
                    String jabatan = rs.getString("jabatan");
                    double gaji = rs.getDouble("gaji");

                    System.out.printf("%-5d | %-18s | %-20s | Rp %,10.2f%n", id, nama, jabatan, gaji);
                    totalBaris++;
                }
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Total karyawan ditemukan: " + totalBaris + " orang.");
            }
        } catch (SQLException e) {
            System.err.println("Gagal mengeksekusi SELECT: " + e.getMessage());
        }
    }
}

class DriverSelectHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverSelectHelper()); } catch (SQLException e) {}
    }
    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;

        Object[][] baris = {
            {101, "Reza Gunawan", "Backend Engineer", 12500000.0},
            {104, "Kartika Sari", "Frontend Specialist", 11000000.0},
            {109, "Dimas Prabowo", "DevOps Engineer", 14000000.0}
        };

        ResultSet mockRs = (ResultSet) java.lang.reflect.Proxy.newProxyInstance(
            ResultSet.class.getClassLoader(),
            new Class<?>[]{ResultSet.class},
            new java.lang.reflect.InvocationHandler() {
                int idx = -1;
                @Override
                public Object invoke(Object p, java.lang.reflect.Method m, Object[] args) {
                    String name = m.getName();
                    if (name.equals("next")) { idx++; return idx < baris.length; }
                    if (name.equals("getInt")) return (Integer) baris[idx][0];
                    if (name.equals("getString")) {
                        String col = (String) args[0];
                        return col.equals("nama") ? baris[idx][1] : baris[idx][2];
                    }
                    if (name.equals("getDouble")) return (Double) baris[idx][3];
                    return null;
                }
            }
        );

        PreparedStatement mockPstmt = (PreparedStatement) java.lang.reflect.Proxy.newProxyInstance(
            PreparedStatement.class.getClassLoader(),
            new Class<?>[]{PreparedStatement.class},
            (p, m, args) -> {
                if (m.getName().equals("executeQuery")) return mockRs;
                return null;
            }
        );

        return (Connection) java.lang.reflect.Proxy.newProxyInstance(
            Connection.class.getClassLoader(),
            new Class<?>[]{Connection.class},
            (p, m, args) -> {
                if (m.getName().equals("prepareStatement")) return mockPstmt;
                return null;
            }
        );
    }
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-select:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
