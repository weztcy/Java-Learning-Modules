// Mendemonstrasikan perulangan bersarang (nested loop) untuk memproses struktur matriks/grid.
class NestedLoop {
    public static void main(String[] args) {
        System.out.println("=== Perulangan Bersarang (Nested Loop) ===");
        int baris = 3;
        int kolom = 4;

        // Loop luar mengontrol baris
        for (int i = 1; i <= baris; i++) {
            // Loop dalam mengontrol kolom pada baris saat ini
            for (int j = 1; j <= kolom; j++) {
                System.out.print("[" + i + "," + j + "] ");
            }
            // Pindah ke baris baru setelah semua kolom dalam baris selesai dicetak
            System.out.println();
        }
    }
}
