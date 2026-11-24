// Mendemonstrasikan pembacaan teks baris demi baris secara efisien menggunakan BufferedReader.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class BufferedReaderDemo {
    public static void main(String[] args) {
        System.out.println("=== Membaca Teks dengan BufferedReader ===");

        File berkas = new File("buffer_baca.txt");

        try {
            // Menyiapkan beberapa baris data
            FileWriter fw = new FileWriter(berkas);
            fw.write("Pancasila 1: Ketuhanan Yang Maha Esa\n");
            fw.write("Pancasila 2: Kemanusiaan Yang Adil dan Beradab\n");
            fw.close();

            // Membaca dengan buffer (jauh lebih cepat untuk file besar)
            try (BufferedReader reader = new BufferedReader(new FileReader(berkas))) {
                String baris;
                int no = 1;
                while ((baris = reader.readLine()) != null) {
                    System.out.println("Baris " + (no++) + " -> " + baris);
                }
            }

            berkas.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error IO: " + e.getMessage());
        }
    }
}
