// Mendemonstrasikan penghapusan baris record dari tabel secara aman berdasarkan kondisi tertentu.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class JDBCDelete {
    public static void main(String[] args) {
        System.out.println("=== 261. Operasi Penghapusan Data (SQL DELETE) ===");

        DriverDeleteHelper.aktifkan();

        String url = "jdbc:simulasi-delete://localhost:3306/ecommerce";
        // Menghapus item pesanan yang berstatus 'BATAL' dan dibuat sebelum tanggal tertentu
        String sql = "DELETE FROM transaksi WHERE status_pesanan = ? AND id_pelanggan = ?";

        try (Connection conn = DriverManager.getConnection(url, "user", "pass");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            String statusBatal = "BATAL";
            int idPelanggan = 8802;

            System.out.println("Kriteria Penghapusan:");
            System.out.println("-> Status Pesanan : " + statusBatal);
            System.out.println("-> ID Pelanggan   : " + idPelanggan);

            pstmt.setString(1, statusBatal);
            pstmt.setInt(2, idPelanggan);

            int jumlahTerhapus = pstmt.executeUpdate();
            System.out.println("Eksekusi query berhasil. Jumlah baris terhapus: " + jumlahTerhapus);
            System.out.println("Catatan: Selalu gunakan klausa WHERE pada DELETE untuk mencegah penghapusan seluruh isi tabel.");
        } catch (SQLException e) {
            System.err.println("Gagal menghapus data: " + e.getMessage());
        }
    }
}

class DriverDeleteHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverDeleteHelper()); } catch (SQLException e) {}
    }
    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;
        PreparedStatement mock = (PreparedStatement) java.lang.reflect.Proxy.newProxyInstance(
            PreparedStatement.class.getClassLoader(),
            new Class<?>[]{PreparedStatement.class},
            (p, m, args) -> {
                if (m.getName().equals("executeUpdate")) return 2;
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
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-delete:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
