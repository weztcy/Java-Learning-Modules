// Mendemonstrasikan manajemen registrasi dan inspeksi driver basis data melalui DriverManager.
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

class JDBCDriverManager {
    public static void main(String[] args) {
        System.out.println("=== 254. Manajemen Driver Menggunakan DriverManager ===");

        // Mendaftarkan dua driver simulasi (misalnya simulasi MySQL dan PostgreSQL)
        SimulasiDriverPostgres.daftar();
        SimulasiDriverMySQL.daftar();

        System.out.println("-> Memeriksa daftar driver yang terdaftar di JVM:");
        Enumeration<Driver> daftarDriver = DriverManager.getDrivers();
        int nomor = 1;
        while (daftarDriver.hasMoreElements()) {
            Driver d = daftarDriver.nextElement();
            System.out.println("   " + nomor + ". Class Driver: " + d.getClass().getSimpleName()
                    + " | Versi: " + d.getMajorVersion() + "." + d.getMinorVersion());
            nomor++;
        }

        // Mengatur timeout login untuk membatasi durasi percobaan koneksi
        DriverManager.setLoginTimeout(10);
        System.out.println("Login Timeout disetel ke: " + DriverManager.getLoginTimeout() + " detik");

        // DriverManager akan memilih driver yang sesuai secara otomatis berdasarkan awalan URL
        String urlTarget = "jdbc:simulasi-pg://localhost:5432/finance_db";
        try {
            Driver driverCocok = DriverManager.getDriver(urlTarget);
            System.out.println("Driver yang cocok untuk [" + urlTarget + "]: " + driverCocok.getClass().getSimpleName());
        } catch (SQLException e) {
            System.err.println("Gagal menemukan driver: " + e.getMessage());
        }
    }
}

class SimulasiDriverPostgres implements Driver {
    public static void daftar() {
        try { DriverManager.registerDriver(new SimulasiDriverPostgres()); } catch (SQLException e) {}
    }
    @Override public java.sql.Connection connect(String url, java.util.Properties info) { return null; }
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-pg:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 42; }
    @Override public int getMinorVersion() { return 5; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}

class SimulasiDriverMySQL implements Driver {
    public static void daftar() {
        try { DriverManager.registerDriver(new SimulasiDriverMySQL()); } catch (SQLException e) {}
    }
    @Override public java.sql.Connection connect(String url, java.util.Properties info) { return null; }
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-mysql:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 8; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
