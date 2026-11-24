// Mendemonstrasikan percabangan dua kondisi alternatif menggunakan if-else.
class IfElseStatement {
    public static void main(String[] args) {
        int totalBelanja = 45000;
        int batasGratisOngkir = 50000;

        System.out.println("=== Percabangan if-else ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);

        // Jika kondisi if bernilai false, alur program berpindah ke blok else
        if (totalBelanja >= batasGratisOngkir) {
            System.out.println("Selamat! Anda mendapatkan promo Gratis Ongkir.");
        } else {
            int kekurangan = batasGratisOngkir - totalBelanja;
            System.out.println("Belanja kurang Rp " + kekurangan + " lagi untuk mendapatkan Gratis Ongkir.");
        }
    }
}
