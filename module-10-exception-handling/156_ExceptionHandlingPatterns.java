// Mendemonstrasikan pola penanganan exception yang baik (Best Practices) versus pola yang keliru (Anti-patterns).
class ExceptionHandlingPatterns {
    public static void main(String[] args) {
        System.out.println("=== Best Practices vs Anti-Patterns ===");

        System.out.println("1. Anti-Pattern: Menelan exception tanpa logging (Empty Catch Block).");
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            // HINDARI: Membiarkan blok kosong menyembunyikan bug kritis!
        }

        System.out.println("2. Best Practice: Tangani atau bungkus exception dengan konteks bermakna.");
        try {
            simpanPengaturan(null);
        } catch (IllegalArgumentException e) {
            System.out.println("-> Berhasil menerapkan Best Practice: " + e.getMessage());
        }

        System.out.println("3. Best Practice: Jangan gunakan exception untuk kontrol alur normal (misal perulangan biasa).");
    }

    static void simpanPengaturan(String konfigurasi) {
        if (konfigurasi == null) {
            throw new IllegalArgumentException("Konfigurasi tidak boleh null!");
        }
    }
}
