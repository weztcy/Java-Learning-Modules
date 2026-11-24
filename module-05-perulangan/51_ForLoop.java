// Mendemonstrasikan perulangan for dengan inisialisasi, kondisi terminasi, dan step increment.
class ForLoop {
    public static void main(String[] args) {
        System.out.println("=== Perulangan for ===");

        // For loop mengulang kode sebanyak hitungan pasti (dari 1 sampai 5)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i + ": Belajar bahasa Java");
        }

        // Perulangan mundur (decrement)
        System.out.println("\nHitung Mundur Peluncuran:");
        for (int hitung = 3; hitung >= 1; hitung--) {
            System.out.println(hitung + "...");
        }
        System.out.println("Meluncur!");
    }
}
