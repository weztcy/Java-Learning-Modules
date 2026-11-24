// Mendemonstrasikan static methods pada interface sebagai metode utilitas yang langsung dipanggil melalui nama interface.
class StaticInterfaceMethods {
    public static void main(String[] args) {
        System.out.println("=== Static Methods pada Interface ===");

        // Memanggil method statis interface secara langsung tanpa instance class
        boolean cek1 = PemeriksaFormat.isValidEmail("user@domain.com");
        boolean cek2 = PemeriksaFormat.isValidEmail("alamat_palsu");

        System.out.println("Validasi 'user@domain.com' : " + cek1);
        System.out.println("Validasi 'alamat_palsu'   : " + cek2);
    }
}

interface PemeriksaFormat {
    static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
}
