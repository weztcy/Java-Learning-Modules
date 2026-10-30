// Mendemonstrasikan penghentian paksa perulangan sebelum kondisi selesai menggunakan break.
class BreakStatement {
    public static void main(String[] args) {
        System.out.println("=== Pernyataan break ===");
        int targetCari = 7;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Memeriksa angka: " + i);

            // Jika target ditemukan, hentikan seluruh sisa perulangan
            if (i == targetCari) {
                System.out.println("-> Target " + targetCari + " DITEMUKAN! Keluar dari loop dengan break.");
                break;
            }
        }

        System.out.println("Proses pencarian selesai.");
    }
}
