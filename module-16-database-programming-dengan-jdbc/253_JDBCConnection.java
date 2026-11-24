// Mendemonstrasikan pembentukan koneksi dasar ke database relasional menggunakan JDBC API.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class JDBCConnection {
    public static void main(String[] args) {
        System.out.println("=== 253. Membuka Koneksi Database dengan JDBC ===");

        // Inisialisasi simulator driver JDBC edukasi
        SimulasiJdbcDriver.aktifkan();

        // Parameter koneksi basis data standar: Protokol, host, port, dan nama database
        String url = "jdbc:simulasi://localhost:3306/db_perusahaan";
        String username = "root";
        String password = "password_aman_123";

        System.out.println("URL Koneksi : " + url);
        System.out.println("Pengguna    : " + username);

        // Membuka koneksi menggunakan try-with-resources agar koneksi otomatis ditutup setelah selesai
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            // Memeriksa apakah status koneksi aktif
            if (conn != null && !conn.isClosed()) {
                System.out.println("Status      : BERHASIL TERHUBUNG!");
                System.out.println("Database    : " + conn.getCatalog());
                System.out.println("Mode Transaksi Auto-Commit: " + conn.getAutoCommit());
            }
        } catch (SQLException e) {
            System.err.println("Terjadi kesalahan saat menghubungkan ke database: " + e.getMessage());
        }

        System.out.println("Koneksi database telah ditutup secara aman.");
    }
}

// Simulasi driver JDBC ringan untuk keperluan edukasi tanpa memerlukan database eksternal terinstal
class SimulasiJdbcDriver implements java.sql.Driver {
    private static final SimulasiJdbcDriver INSTANCE = new SimulasiJdbcDriver();
    public static void aktifkan() {
        try {
            DriverManager.registerDriver(INSTANCE);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static { aktifkan(); }

    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;
        return (Connection) java.lang.reflect.Proxy.newProxyInstance(
            Connection.class.getClassLoader(),
            new Class<?>[]{Connection.class},
            (proxy, method, args) -> {
                String mName = method.getName();
                if (mName.equals("isClosed")) return false;
                if (mName.equals("getCatalog")) return "db_perusahaan";
                if (mName.equals("getAutoCommit")) return true;
                if (mName.equals("close")) return null;
                return null;
            }
        );
    }
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
