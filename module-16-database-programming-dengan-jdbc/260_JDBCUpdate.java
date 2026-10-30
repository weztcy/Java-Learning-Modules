// Mendemonstrasikan pembaruan record yang ada di database dengan pernyataan SQL UPDATE.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class JDBCUpdate {
    public static void main(String[] args) {
        System.out.println("=== 260. Operasi Pembaruan Data (SQL UPDATE) ===");

        DriverUpdateHelper.aktifkan();

        String url = "jdbc:simulasi-update://localhost:3306/gudang";
        String sql = "UPDATE produk SET harga = ?, stok = stok + ? WHERE id_produk = ?";

        try (Connection conn = DriverManager.getConnection(url, "admin", "admin");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            double hargaBaru = 950000.0;
            int tambahanStok = 25;
            int idTarget = 301;

            System.out.println("Memperbarui produk ID: " + idTarget);
            System.out.println("-> Harga baru     : Rp " + hargaBaru);
            System.out.println("-> Tambahan stok  : +" + tambahanStok + " unit");

            pstmt.setDouble(1, hargaBaru);
            pstmt.setInt(2, tambahanStok);
            pstmt.setInt(3, idTarget);

            // executeUpdate() mengembalikan jumlah record yang berhasil diubah
            int affected = pstmt.executeUpdate();
            if (affected > 0) {
                System.out.println("Sukses: Data produk berhasil diperbarui! Baris terpengaruh: " + affected);
            } else {
                System.out.println("Peringatan: Tidak ada produk dengan ID " + idTarget);
            }
        } catch (SQLException e) {
            System.err.println("Gagal melakukan UPDATE: " + e.getMessage());
        }
    }
}

class DriverUpdateHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverUpdateHelper()); } catch (SQLException e) {}
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
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-update:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
