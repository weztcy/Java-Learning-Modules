// Mendemonstrasikan eksekusi perintah DDL dan DML statis menggunakan interface java.sql.Statement.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class JDBCStatement {
    public static void main(String[] args) {
        System.out.println("=== 255. Eksekusi Perintah SQL dengan Statement ===");

        DriverStatementHelper.aktifkan();

        String url = "jdbc:simulasi-stmt://localhost:3306/akademik";
        try (Connection conn = DriverManager.getConnection(url, "user", "pass");
             Statement stmt = conn.createStatement()) {

            // 1. Eksekusi DDL: Membuat tabel baru menggunakan method execute()
            String sqlCreate = "CREATE TABLE mahasiswa (id INT PRIMARY KEY, nama VARCHAR(100), jurusan VARCHAR(50))";
            System.out.println("1. Menjalankan DDL: " + sqlCreate);
            stmt.execute(sqlCreate);

            // 2. Eksekusi DML: Menyisipkan baris menggunakan executeUpdate() yang mengembalikan jumlah baris terdampak
            String sqlInsert = "INSERT INTO mahasiswa VALUES (1, 'Rian Pratama', 'Teknik Informatika')";
            System.out.println("2. Menjalankan DML: " + sqlInsert);
            int barisTerdampak = stmt.executeUpdate(sqlInsert);
            System.out.println("   Jumlah baris berhasil ditambahkan: " + barisTerdampak);

            // Statement cocok untuk perintah statis tanpa variabel input dari pengguna luar
            System.out.println("Operasi Statement selesai dijalankan tanpa error.");
        } catch (SQLException e) {
            System.err.println("Kesalahan SQL: " + e.getMessage());
        }
    }
}

class DriverStatementHelper implements java.sql.Driver {
    public static void aktifkan() {
        try { DriverManager.registerDriver(new DriverStatementHelper()); } catch (SQLException e) {}
    }
    @Override
    public Connection connect(String url, java.util.Properties info) {
        if (!acceptsURL(url)) return null;
        Statement mockStmt = (Statement) java.lang.reflect.Proxy.newProxyInstance(
            Statement.class.getClassLoader(),
            new Class<?>[]{Statement.class},
            (p, m, args) -> {
                String name = m.getName();
                if (name.equals("execute")) {
                    System.out.println("   [Database Engine] DDL diproses: Tabel berhasil didefinisikan.");
                    return false;
                }
                if (name.equals("executeUpdate")) {
                    System.out.println("   [Database Engine] 1 baris record berhasil dimasukkan.");
                    return 1;
                }
                if (name.equals("close")) return null;
                return null;
            }
        );
        return (Connection) java.lang.reflect.Proxy.newProxyInstance(
            Connection.class.getClassLoader(),
            new Class<?>[]{Connection.class},
            (p, m, args) -> {
                if (m.getName().equals("createStatement")) return mockStmt;
                if (m.getName().equals("close")) return null;
                return null;
            }
        );
    }
    @Override public boolean acceptsURL(String url) { return url != null && url.startsWith("jdbc:simulasi-stmt:"); }
    @Override public java.sql.DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info) { return new java.sql.DriverPropertyInfo[0]; }
    @Override public int getMajorVersion() { return 1; }
    @Override public int getMinorVersion() { return 0; }
    @Override public boolean jdbcCompliant() { return true; }
    @Override public java.util.logging.Logger getParentLogger() { return null; }
}
