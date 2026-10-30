// Mendemonstrasikan pembuatan dan pemanggilan method dasar untuk modularisasi kode.
class MethodBasic {
    // Method statis tanpa parameter untuk menampilkan salam pembuka
    static void sapaPengguna() {
        System.out.println("Halo! Selamat datang di modul pembelajaran method Java.");
        System.out.println("Method membantu kita menulis kode yang modular dan dapat digunakan kembali.");
    }

    public static void main(String[] args) {
        System.out.println("=== Pemanggilan Method Dasar ===");
        
        // Memanggil method sapaPengguna
        sapaPengguna();

        System.out.println("Program utama selesai dieksekusi.");
    }
}
