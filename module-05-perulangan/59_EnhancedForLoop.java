// Mendemonstrasikan enhanced for loop (for-each) untuk membaca elemen koleksi/array dengan ringkas.
class EnhancedForLoop {
    public static void main(String[] args) {
        System.out.println("=== Enhanced for Loop (for-each) ===");

        String[] daftarBahasa = {"Java", "Python", "Go", "Rust", "Kotlin"};

        // For-each membaca setiap elemen secara berurutan tanpa memerlukan variabel indeks
        for (String bahasa : daftarBahasa) {
            System.out.println("Bahasa Pemrograman: " + bahasa);
        }

        int[] daftarNilai = {80, 95, 70, 85, 90};
        int total = 0;
        for (int nilai : daftarNilai) {
            total += nilai;
        }
        System.out.println("Total Penjumlahan Nilai: " + total);
    }
}
