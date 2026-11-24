// Mendemonstrasikan pembangkitan bilangan acak semu (pseudorandom) menggunakan java.util.Random.
import java.util.Random;

class RandomClass {
    public static void main(String[] args) {
        System.out.println("=== Pembangkit Bilangan Acak (java.util.Random) ===");

        Random rand = new Random(42); // Seed tetap agar demonstrasi menghasilkan nilai deterministik yang konsisten

        int dadu = rand.nextInt(6) + 1; // Menghasilkan integer 1 s.d. 6
        double persentase = rand.nextDouble(); // Menghasilkan pecahan 0.0 s.d. 1.0
        boolean koin = rand.nextBoolean(); // True/False acak

        System.out.println("Lemparan Dadu (1-6)    : " + dadu);
        System.out.printf("Nilai Peluang (0.0-1.0): %.4f%n", persentase);
        System.out.println("Lemparan Koin          : " + (koin ? "GAMBAR" : "ANGKA"));
    }
}
