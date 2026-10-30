// Mendemonstrasikan peloncatan sisa instruksi iterasi saat ini menggunakan continue.
class ContinueStatement {
    public static void main(String[] args) {
        System.out.println("=== Pernyataan continue ===");
        System.out.println("Mencetak angka ganjil antara 1 sampai 10:");

        for (int i = 1; i <= 10; i++) {
            // Jika angka genap, lewati (skip) iterasi saat ini dan lanjut ke iterasi berikutnya
            if (i % 2 == 0) {
                continue;
            }

            // Baris ini hanya dicapai jika bilangan tidak genap (ganjil)
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
