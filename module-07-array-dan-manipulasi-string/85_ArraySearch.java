// Mendemonstrasikan algoritma pencarian linier (linear search) pada elemen array.
class ArraySearch {
    public static void main(String[] args) {
        System.out.println("=== Pencarian Elemen Array (Linear Search) ===");

        String[] daftarProduk = {"Monitor", "Keyboard", "Mouse", "Speaker", "Webcam"};
        String targetCari = "Mouse";

        int indeksDitemukan = -1;

        // Memeriksa satu per satu elemen dari awal hingga akhir
        for (int i = 0; i < daftarProduk.length; i++) {
            if (daftarProduk[i].equalsIgnoreCase(targetCari)) {
                indeksDitemukan = i;
                break; // Keluar segera setelah ditemukan
            }
        }

        if (indeksDitemukan != -1) {
            System.out.println("Barang '" + targetCari + "' DITEMUKAN pada indeks ke-" + indeksDitemukan);
        } else {
            System.out.println("Barang '" + targetCari + "' TIDAK ditemukan dalam array.");
        }
    }
}
