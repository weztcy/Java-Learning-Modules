// Program praktis validasi autentikasi login pengguna dengan simulasi username dan password.
class LoginValidation {
    public static void main(String[] args) {
        // Kredensial akun terdaftar di sistem
        String usernameTersimpan = "admin";
        String passwordTersimpan = "Rahasia123";

        // Percobaan login
        String inputUser = "admin";
        String inputPass = "Rahasia123";

        System.out.println("=== Sistem Validasi Login Sederhana ===");
        System.out.println("Mencoba login dengan username: " + inputUser);

        // Validasi input: memastikan nilai tidak kosong dan cocok dengan kredensial sistem
        if (inputUser == null || inputUser.trim().isEmpty() || inputPass == null || inputPass.isEmpty()) {
            System.out.println("GAGAL: Username dan password tidak boleh kosong!");
        } else if (inputUser.equals(usernameTersimpan) && inputPass.equals(passwordTersimpan)) {
            System.out.println("SUKSES: Login berhasil! Selamat datang di Dashboard Administrator.");
        } else if (inputUser.equals(usernameTersimpan) && !inputPass.equals(passwordTersimpan)) {
            System.out.println("GAGAL: Password yang Anda masukkan salah!");
        } else {
            System.out.println("GAGAL: Akun pengguna tidak ditemukan dalam sistem.");
        }
    }
}
