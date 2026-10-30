// Mendemonstrasikan pembagian token teks menggunakan utilitas java.util.StringTokenizer.
import java.util.StringTokenizer;

class StringTokenizerDemo {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan java.util.StringTokenizer ===");

        String kalimat = "Merah;Kuning;Hijau;Biru;Nila;Ungu";

        // Membagi teks berdasarkan delimiter titik koma (;)
        StringTokenizer tokenizer = new StringTokenizer(kalimat, ";");

        System.out.println("Jumlah token ditemukan: " + tokenizer.countTokens());
        int nomor = 1;
        while (tokenizer.hasMoreTokens()) {
            System.out.println("Token " + (nomor++) + " : " + tokenizer.nextToken());
        }
    }
}
