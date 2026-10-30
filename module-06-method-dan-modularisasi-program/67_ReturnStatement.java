// Mendemonstrasikan penggunaan kata kunci return untuk mengembalikan nilai hasil komputasi.
class ReturnStatement {
    // Method mengembalikan nilai bertipe int hasil perkalian dua bilangan
    static int hitungLuasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar; // Mengembalikan hasil perkalian langsung ke pemanggil
    }

    // Method mengembalikan nilai bertipe double hasil rata-rata
    static double hitungRataRata(double nilai1, double nilai2, double nilai3) {
        double total = nilai1 + nilai2 + nilai3;
        return total / 3.0;
    }

    public static void main(String[] args) {
        System.out.println("=== Nilai Balik Method (Return Statement) ===");

        int luas = hitungLuasPersegiPanjang(8, 5);
        System.out.println("Luas Persegi Panjang (8x5) : " + luas + " satuan");

        double rataRata = hitungRataRata(80.0, 85.5, 90.0);
        System.out.printf("Rata-Rata Tiga Nilai       : %.2f%n", rataRata);
    }
}
