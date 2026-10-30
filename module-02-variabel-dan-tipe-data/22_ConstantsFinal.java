// Mendemonstrasikan pembuatan nilai konstanta yang tidak dapat diubah menggunakan keyword final.
class ConstantsFinal {
    public static void main(String[] args) {
        // Kata kunci 'final' memastikan nilai variabel bernilai tetap setelah pertama kali diisi
        final double KECEPATAN_CAHAYA = 299792458.0; // m/s
        final String NAMA_APLIKASI = "Sistem Akademik Kampus";
        final int BATAS_MAKSIMAL_SKS = 24;

        System.out.println("=== Penggunaan Kata Kunci final ===");
        System.out.println("Aplikasi        : " + NAMA_APLIKASI);
        System.out.println("Batas SKS       : " + BATAS_MAKSIMAL_SKS);
        System.out.println("Kecepatan Cahaya: " + KECEPATAN_CAHAYA + " m/s");
        System.out.println("Catatan         : Variabel final tidak dapat diubah kembali setelah diberi nilai.");
    }
}
