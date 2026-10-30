// Mendemonstrasikan Checked Exception: exception turunan Exception yang wajib ditangani atau dideklarasikan saat kompilasi.
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class CheckedExceptions {
    public static void main(String[] args) {
        System.out.println("=== Checked Exceptions (Wajib Ditangani) ===");

        // FileNotFoundException adalah Checked Exception (compiler mewajibkan blok try-catch)
        try {
            FileReader pembaca = new FileReader("konfigurasi_sistem_tidak_ada.json");
            pembaca.close();
        } catch (FileNotFoundException e) {
            System.out.println("-> Checked Exception tertangkap: Berkas tidak ditemukan di disk (" + e.getMessage() + ")");
        } catch (IOException e) {
            System.out.println("-> Error IO tertangkap: " + e.getMessage());
        }

        System.out.println("Program berhasil menangani checked exception dengan baik.");
    }
}
