// Mendemonstrasikan validasi payload otomatis berbasis anotasi Bean Validation (Hibernate Validator / JSR-380).
import java.util.ArrayList;
import java.util.List;

class SpringValidation {
    public static void main(String[] args) {
        System.out.println("=== 293. Validasi Data dengan Bean Validation ===");

        ValidatorEngine validator = new ValidatorEngine();

        // 1. Uji Registrasi dengan Data Valid
        System.out.println("--- Skenario 1: Data Pengguna Valid ---");
        RegistrasiRequest reqValid = new RegistrasiRequest("anita_dewi", "anita@domain.com", 24, "PasswordKuat#123");
        List<String> errors1 = validator.validasi(reqValid);
        if (errors1.isEmpty()) {
            System.out.println("   [STATUS] 200 OK: Data lolos semua aturan validasi.");
        }

        // 2. Uji Registrasi dengan Data Tidak Valid
        System.out.println("\n--- Skenario 2: Data Pelanggar Aturan (@NotBlank, @Email, @Min, @Size) ---");
        RegistrasiRequest reqInvalid = new RegistrasiRequest("", "bukan-alamat-email", 14, "short");
        List<String> errors2 = validator.validasi(reqInvalid);
        System.out.println("   [STATUS] 400 Bad Request: Ditemukan " + errors2.size() + " pelanggaran validasi:");
        for (String err : errors2) {
            System.out.println("   * Field Error: " + err);
        }

        System.out.println("\nValidasi deklaratif mencegah data cacat masuk ke lapisan database.");
    }
}

class RegistrasiRequest {
    final String username;
    final String email;
    final int usia;
    final String password;

    public RegistrasiRequest(String u, String e, int a, String p) {
        this.username = u; this.email = e; this.usia = a; this.password = p;
    }
}

class ValidatorEngine {
    public List<String> validasi(RegistrasiRequest req) {
        List<String> errors = new ArrayList<>();
        if (req.username == null || req.username.trim().isEmpty()) {
            errors.add("username: Tidak boleh kosong (@NotBlank)");
        }
        if (!req.email.contains("@") || !req.email.contains(".")) {
            errors.add("email: Format alamat email tidak valid (@Email)");
        }
        if (req.usia < 18) {
            errors.add("usia: Usia minimal adalah 18 tahun (@Min(18))");
        }
        if (req.password.length() < 8) {
            errors.add("password: Kata sandi minimal 8 karakter (@Size(min = 8))");
        }
        return errors;
    }
}
