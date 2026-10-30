// Mendemonstrasikan manajemen transaksi basis data (ACID) dengan setAutoCommit(false), commit(), dan rollback().
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class JDBCTransactions {
    public static void main(String[] args) {
        System.out.println("=== 262. Manajemen Transaksi Basis Data (Commit & Rollback) ===");

        DriverTxHelper.aktifkan();

        String url = "jdbc:simulasi-tx://localhost:3306/perbankan";
        try (Connection conn = DriverManager.getConnection(url, "bank_sys", "secure_pin")) {

            // Menonaktifkan auto-commit untuk memulai transaksi manual
            conn.setAutoCommit(false);
            System.out.println("1. Auto-commit dimatikan. Transaksi dimulai secara atomik.");

            try (PreparedStatement potongSaldo = conn.prepareStatement("UPDATE rekening SET saldo = saldo - ? WHERE no_rek = ?");
                 PreparedStatement tambahSaldo = conn.prepareStatement("UPDATE rekening SET saldo = saldo + ? WHERE no_rek = ?")) {

                double jumlahTransfer = 500000.0;
                String rekPengirim = "REK-1001";
                String rekPenerima = "REK-2002";

                System.out.println("2. Menjalankan transfer Rp " + jumlahTransfer + " dari " + rekPengirim + " ke " + rekPenerima);

                // Langkah A: Kurangi saldo pengirim
                potongSaldo.setDouble(1, jumlahTransfer);
                potongSaldo.setString(2, rekPengirim);
                potongSaldo.executeUpdate();
                System.out.println("   [OK] Saldo pengirim didebet.");

                // Langkah B: Tambah saldo penerima
                tambahSaldo.setDouble(1, jumlahTransfer);
                tambahSaldo.setString(2, rekPenerima);
                tambahSaldo.executeUpdate();
                System.out.println("   [OK] Saldo penerima dikreditkan.");

                // Jika semua langkah berhasil tanpa exception, permanenkan perubahan dengan commit()
                conn.commit();
                System.out.println("3. Transaksi BERHASIL: conn.commit() dieksekusi.");
            } catch (Exception e) {
                // Jika terjadi kegagalan di tengah jalan, batalkan semua perubahan dengan rollback()
                System.err.println("Terjadi kesalahan! Membatalkan transaksi...");
                conn.rollback();
                System.err.println("4. Transaksi DIBATALKAN: conn.rollback() dieksekusi.");
            } finally {
                // Kembalikan ke mode normal
                conn.setAutoCommit(true);
            }

        } catch (SQLException e) {
            System.err.println("Kesalahan koneksi transaksi: " + e.getMessage());
        }
    }
}

class DriverTxHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverTxHelper()); } catch (SQLException e) {}
    }
    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;

        PreparedStatement mockPstmt = (PreparedStatement) java.lang.reflect.Proxy.newProxyInstance(
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
                String name = m.getName();
                if (name.equals("prepareStatement")) return mockPstmt;
                if (name.equals("setAutoCommit")) return null;
                if (name.equals("commit")) return null;
                if (name.equals("rollback")) return null;
                return null;
            }
        );
    }
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-tx:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
