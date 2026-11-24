// Mendemonstrasikan operasi file lanjutan dengan NIO (copy, move, delete, dan lines).
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

class NIOFileOperations {
    public static void main(String[] args) {
        System.out.println("=== Operasi File NIO (Copy, Move, Lines) ===");

        Path asal = Path.of("asal_data.txt");
        Path salinan = Path.of("salinan_data.txt");

        try {
            Files.writeString(asal, "Baris Data 1\nBaris Data 2\nBaris Data 3");

            // Menggandakan file (copy)
            Files.copy(asal, salinan, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File berhasil digandakan ke: " + salinan.getFileName());

            // Membaca baris-baris file secara fungsional menggunakan stream Files.lines()
            System.out.println("Membaca salinan via Files.lines():");
            Files.lines(salinan).forEach(line -> System.out.println(" * " + line));

            Files.deleteIfExists(asal);
            Files.deleteIfExists(salinan);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
