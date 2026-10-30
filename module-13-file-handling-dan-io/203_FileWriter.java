// Mendemonstrasikan penulisan teks ke dalam file fisik menggunakan FileWriter.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterDemo {
    public static void main(String[] args) {
        System.out.println("=== Menulis Berkas dengan FileWriter ===");

        File berkas = new File("output_writer.txt");

        try (FileWriter writer = new FileWriter(berkas)) {
            writer.write("Baris 1: Catatan Pembelajaran Java.\n");
            writer.write("Baris 2: FileWriter mudah digunakan untuk teks sederhana.\n");
            System.out.println("Berhasil menulis teks ke dalam: " + berkas.getName());
            System.out.println("Ukuran berkas saat ini: " + berkas.length() + " bytes");

            berkas.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error saat menulis: " + e.getMessage());
        }
    }
}
