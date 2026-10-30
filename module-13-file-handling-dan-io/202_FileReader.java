// Mendemonstrasikan pembacaan data teks karakter demi karakter menggunakan FileReader.
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileReaderDemo {
    public static void main(String[] args) {
        System.out.println("=== Membaca Teks dengan FileReader ===");

        File berkas = new File("teks_fr_demo.txt");

        try {
            // Menyiapkan file sampel
            FileWriter writer = new FileWriter(berkas);
            writer.write("Java FileReader membaca karakter.");
            writer.close();

            // Membaca karakter satu per satu menggunakan FileReader
            FileReader reader = new FileReader(berkas);
            int karakter;
            System.out.print("Isi berkas yang dibaca: ");
            while ((karakter = reader.read()) != -1) {
                System.out.print((char) karakter);
            }
            System.out.println();
            reader.close();

            berkas.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error IO: " + e.getMessage());
        }
    }
}
