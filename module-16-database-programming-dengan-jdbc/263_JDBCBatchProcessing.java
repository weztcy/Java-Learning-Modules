// Mendemonstrasikan pengelompokan operasi SQL (Batch Processing) untuk efisiensi jaringan dan database.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

class JDBCBatchProcessing {
    public static void main(String[] args) {
        System.out.println("=== 263. Batch Processing pada JDBC ===");

        DriverBatchHelper.aktifkan();

        String url = "jdbc:simulasi-batch://localhost:3306/logistik";
        String sql = "INSERT INTO kiriman (kode_resi, kota_tujuan, berat_kg) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, "user", "pass");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Data transaksi pengiriman massal
            String[][] dataKiriman = {
                {"RESI-001", "Bandung", "2.5"},
                {"RESI-002", "Surabaya", "5.0"},
                {"RESI-003", "Yogyakarta", "1.2"},
                {"RESI-004", "Medan", "8.7"}
            };

            System.out.println("Menyiapkan antrean batch untuk 4 data kiriman...");

            // Memasukkan setiap baris ke dalam batch lokal di memory
            for (String[] k : dataKiriman) {
                pstmt.setString(1, k[0]);
                pstmt.setString(2, k[1]);
                pstmt.setDouble(3, Double.parseDouble(k[2]));
                pstmt.addBatch(); // Menambahkan instruksi ke antrean batch
                System.out.println("-> Ditambahkan ke batch: " + k[0] + " -> " + k[1]);
            }

            // Mengeksekusi seluruh batch sekaligus dalam satu kali perjalanan jaringan (round-trip)
            int[] hasilBatch = pstmt.executeBatch();

            System.out.println("Eksekusi batch selesai! Array hasil: " + Arrays.toString(hasilBatch));
            System.out.println("Total perintah batch berhasil dijalankan: " + hasilBatch.length);

            // Membersihkan antrean batch
            pstmt.clearBatch();
        } catch (SQLException e) {
            System.err.println("Gagal eksekusi batch: " + e.getMessage());
        }
    }
}

class DriverBatchHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverBatchHelper()); } catch (SQLException e) {}
    }
    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;

        PreparedStatement mock = (PreparedStatement) java.lang.reflect.Proxy.newProxyInstance(
            PreparedStatement.class.getClassLoader(),
            new Class<?>[]{PreparedStatement.class},
            (p, m, args) -> {
                String name = m.getName();
                if (name.equals("executeBatch")) return new int[]{1, 1, 1, 1};
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
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-batch:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
