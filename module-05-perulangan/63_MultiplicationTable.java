// Program praktis membuat tabel perkalian matematika 1 sampai 5 menggunakan nested loop.
class MultiplicationTable {
    public static void main(String[] args) {
        int ukuranTabel = 5;

        System.out.println("=== Tabel Perkalian 1 s.d. " + ukuranTabel + " ===");
        System.out.print("  * |");
        for (int k = 1; k <= ukuranTabel; k++) {
            System.out.printf("%4d", k);
        }
        System.out.println("\n----+--------------------");

        // Membuat baris-baris perkalian
        for (int i = 1; i <= ukuranTabel; i++) {
            System.out.printf("%3d |", i);
            for (int j = 1; j <= ukuranTabel; j++) {
                System.out.printf("%4d", (i * j));
            }
            System.out.println();
        }
    }
}
