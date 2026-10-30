// Mendemonstrasikan dasar kriptografi Java: Hashing aman SHA-256 dan Enkripsi-Dekripsi Simetris AES.
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class CryptographyBasics {
    public static void main(String[] args) throws Exception {
        System.out.println("=== 287. Dasar Kriptografi Java (Hashing & Enkripsi AES) ===");

        String teksRahasia = "KunciRahasiaBank2024!";
        System.out.println("Teks Asli: " + teksRahasia);

        // 1. One-way Hashing menggunakan SHA-256
        System.out.println("\n1. Melakukan One-Way Hashing (SHA-256):");
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashByte = digest.digest(teksRahasia.getBytes(StandardCharsets.UTF_8));

        StringBuilder hexHash = new StringBuilder();
        for (byte b : hashByte) {
            hexHash.append(String.format("%02x", b));
        }
        System.out.println("   SHA-256 Hash: " + hexHash.toString());

        // 2. Enkripsi dan Dekripsi Dua Arah Simetris menggunakan AES-128
        System.out.println("\n2. Enkripsi Dua Arah (Symmetric AES-128):");
        // Kunci AES 16-byte (128-bit)
        byte[] kunciAes = "KunciRahasia16B!".getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKey = new SecretKeySpec(kunciAes, "AES");

        // Proses Enkripsi
        Cipher cipherEnkripsi = Cipher.getInstance("AES");
        cipherEnkripsi.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] cipherTeks = cipherEnkripsi.doFinal(teksRahasia.getBytes(StandardCharsets.UTF_8));
        String cipherTeksBase64 = Base64.getEncoder().encodeToString(cipherTeks);
        System.out.println("   Ciphertext (Base64) : " + cipherTeksBase64);

        // Proses Dekripsi
        Cipher cipherDekripsi = Cipher.getInstance("AES");
        cipherDekripsi.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] teksTerdekripsiByte = cipherDekripsi.doFinal(Base64.getDecoder().decode(cipherTeksBase64));
        String teksTerdekripsi = new String(teksTerdekripsiByte, StandardCharsets.UTF_8);
        System.out.println("   Teks Hasil Dekripsi : " + teksTerdekripsi);

        if (teksRahasia.equals(teksTerdekripsi)) {
            System.out.println("   [STATUS] Verifikasi integritas kriptografi sukses 100%.");
        }
    }
}
