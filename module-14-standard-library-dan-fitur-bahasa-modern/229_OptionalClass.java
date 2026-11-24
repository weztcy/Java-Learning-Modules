// Mendemonstrasikan java.util.Optional untuk penanganan nilai yang berpotensi null secara aman dan elegan.
import java.util.Optional;

class OptionalClass {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan java.util.Optional<T> ===");

        // Menguji data yang ada nilainya
        Optional<String> adaNilai = cariEmailPengguna("user123");
        System.out.println("User123 Email : " + adaNilai.orElse("email.default@perusahaan.com"));

        // Menguji data yang mengembalikan null (Optional.empty)
        Optional<String> tidakAda = cariEmailPengguna("user_tidak_dikenal");
        System.out.println("User_X Email  : " + tidakAda.orElse("email.default@perusahaan.com"));

        // Eksekusi aksi kondisional jika nilai hadir dengan ifPresent()
        adaNilai.ifPresent(email -> System.out.println("Mengirim notifikasi langsung ke: " + email));
    }

    static Optional<String> cariEmailPengguna(String userId) {
        if ("user123".equals(userId)) {
            return Optional.of("budi.santoso@gmail.com");
        }
        return Optional.empty(); // Tidak mengembalikan null
    }
}
