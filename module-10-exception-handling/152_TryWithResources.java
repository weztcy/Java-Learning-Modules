// Mendemonstrasikan try-with-resources: penutupan sumber daya otomatis untuk class yang mengimplementasikan AutoCloseable.
class TryWithResources {
    public static void main(String[] args) {
        System.out.println("=== Try-With-Resources (AutoCloseable) ===");

        // Resource di dalam tanda kurung try (...) otomatis ditutup saat keluar blok
        try (KoneksiDatabaseSimulasi db = new KoneksiDatabaseSimulasi("jdbc:mysql://localhost:3306/db_kampus")) {
            db.eksekusiQuery("SELECT * FROM mahasiswa");
        } catch (Exception e) {
            System.out.println("Tertangkap: " + e.getMessage());
        }

        System.out.println("Blok try-with-resources selesai dieksekusi.");
    }
}

class KoneksiDatabaseSimulasi implements AutoCloseable {
    private String url;

    KoneksiDatabaseSimulasi(String url) {
        this.url = url;
        System.out.println("-> [Buka] Berhasil tersambung ke database: " + url);
    }

    void eksekusiQuery(String sql) {
        System.out.println("-> [Kueri] Menjalankan perintah SQL: " + sql);
    }

    @Override
    public void close() {
        System.out.println("-> [Tutup Otomatis] Method close() dipanggil secara otomatis oleh JVM!");
    }
}
