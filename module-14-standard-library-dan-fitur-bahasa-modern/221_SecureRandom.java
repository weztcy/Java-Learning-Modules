// Mendemonstrasikan SecureRandom: generator bilangan acak kuat untuk keperluan kriptografi dan keamanan token.
import java.security.SecureRandom;
import java.util.Base64;

class SecureRandomDemo {
    public static void main(String[] args) {
        System.out.println("=== java.security.SecureRandom (Kriptografis Aman) ===");

        SecureRandom secRandom = new SecureRandom();

        // Menghasilkan OTP 6 digit aman
        int kodeOtp = 100000 + secRandom.nextInt(900000);
        System.out.println("Kode OTP Keamanan: " + kodeOtp);

        // Menghasilkan token acak 16-byte berbasis Base64
        byte[] tokenBytes = new byte[16];
        secRandom.nextBytes(tokenBytes);
        String tokenBase64 = Base64.getUrlEncoder().withoutPadding().encodeToString(tokenBytes);

        System.out.println("Token Akses API  : " + tokenBase64);
        System.out.println("Catatan: SecureRandom tahan terhadap serangan tebakan entropi pseudorandom.");
    }
}
