// Mendemonstrasikan utilitas java.nio.file.Files untuk operasi file satu baris (readString, writeString, exists).
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FilesClass {
    public static void main(String[] args) {
        System.out.println("=== Class java.nio.file.Files ===");

        Path target = Path.of("catatan_nio.txt");

        try {
            // Menulis string langsung dalam 1 baris
            String konten = "Belajar operasi file modern menggunakan java.nio.file.Files.";
            Files.writeString(target, konten);
            System.out.println("Berhasil menulis via Files.writeString()");

            // Memeriksa keberadaan file
            System.out.println("Apakah file ada? " + Files.exists(target));

            // Membaca seluruh isi file ke string dalam 1 baris
            String isiBaca = Files.readString(target);
            System.out.println("Isi yang dibaca: '" + isiBaca + "'");

            Files.deleteIfExists(target);
        } catch (IOException e) {
            System.out.println("Error NIO: " + e.getMessage());
        }
    }
}
