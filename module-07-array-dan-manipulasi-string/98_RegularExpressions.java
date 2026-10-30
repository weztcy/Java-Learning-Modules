// Mendemonstrasikan penggunaan Pattern dan Matcher untuk validasi format regex (email dan angka).
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegularExpressions {
    public static void main(String[] args) {
        System.out.println("=== Regular Expressions (Regex) ===");

        // Pola regex validasi format email sederhana
        String polaEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(polaEmail);

        String[] daftarEmail = {"user@gmail.com", "budi.santoso@kampus.ac.id", "email_salah@.com", "bukan-email"};

        for (String email : daftarEmail) {
            Matcher matcher = pattern.matcher(email);
            boolean isValid = matcher.matches();
            System.out.printf("Email '%-30s' : %s%n", email, (isValid ? "VALID" : "TIDAK VALID"));
        }
    }
}
