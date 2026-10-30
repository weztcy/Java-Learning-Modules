// Program praktis menghitung jumlah deret bilangan asli dari 1 hingga N.
class SumNumbers {
    public static void main(String[] args) {
        int n = 100;
        int totalPenjumlahan = 0;

        // Akumulasi penjumlahan bilangan dari 1 hingga n
        for (int i = 1; i <= n; i++) {
            totalPenjumlahan += i;
        }

        // Rumus matematika Carl Friedrich Gauss: n * (n + 1) / 2 untuk validasi
        int rumusGauss = n * (n + 1) / 2;

        System.out.println("=== Penjumlahan Bilangan 1 sampai " + n + " ===");
        System.out.println("Hasil akumulasi loop : " + totalPenjumlahan);
        System.out.println("Hasil rumus Gauss    : " + rumusGauss);
        System.out.println("Validasi hasil       : " + (totalPenjumlahan == rumusGauss ? "COCOK" : "TIDAK COCOK"));
    }
}
