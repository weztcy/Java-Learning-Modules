// Mendemonstrasikan penambahan baris record baru ke database dan mengambil auto-generated primary key.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCInsert {
    public static void main(String[] args) {
        System.out.println("=== 258. Operasi Penyisipan Data (SQL INSERT) ===");

        DriverInsertHelper.aktifkan();

        String url = "jdbc:simulasi-insert://localhost:3306/inventaris";
        String sql = "INSERT INTO barang (nama_barang, kategori, harga_satuan) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, "admin", "admin123");
             // Statement.RETURN_GENERATED_KEYS digunakan untuk mendapatkan ID otomatis dari kolom AUTO_INCREMENT
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // Menyiapkan data barang pertama
            pstmt.setString(1, "Keyboard Mekanikal TKL");
            pstmt.setString(2, "Aksesoris Komputer");
            pstmt.setDouble(3, 450000.0);

            int barisDitambahkan = pstmt.executeUpdate();
            System.out.println("Baris berhasil disimpan: " + barisDitambahkan);

            // Mengambil Primary Key yang dibuat oleh database
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    long idOtomatis = generatedKeys.getLong(1);
                    System.out.println("ID Primary Key yang baru di-generate: " + idOtomatis);
                }
            }

            System.out.println("Penyisipan record transaksi barang sukses tuntas.");
        } catch (SQLException e) {
            System.err.println("Gagal menyisipkan data: " + e.getMessage());
        }
    }
}

class DriverInsertHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverInsertHelper()); } catch (SQLException e) {}
    }
    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;

        ResultSet mockKeys = (ResultSet) java.lang.reflect.Proxy.newProxyInstance(
            ResultSet.class.getClassLoader(),
            new Class<?>[]{ResultSet.class},
            new java.lang.reflect.InvocationHandler() {
                boolean first = true;
                @Override
                public Object invoke(Object p, java.lang.reflect.Method m, Object[] args) {
                    if (m.getName().equals("next")) {
                        if (first) { first = false; return true; }
                        return false;
                    }
                    if (m.getName().equals("getLong")) return 501L;
                    return null;
                }
            }
        );

        PreparedStatement mock = (PreparedStatement) java.lang.reflect.Proxy.newProxyInstance(
            PreparedStatement.class.getClassLoader(),
            new Class<?>[]{PreparedStatement.class},
            (p, m, args) -> {
                if (m.getName().equals("executeUpdate")) return 1;
                if (m.getName().equals("getGeneratedKeys")) return mockKeys;
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
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-insert:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
