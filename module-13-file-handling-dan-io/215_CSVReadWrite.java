// Mendemonstrasikan pembacaan dan penulisan berkas format CSV (Comma-Separated Values).
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CSVReadWrite {
    public static void main(String[] args) {
        System.out.println("=== Membaca dan Menulis File CSV ===");

        File fileCsv = new File("inventaris_toko.csv");

        try {
            // 1. Menulis data CSV
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileCsv))) {
                writer.write("ID,NamaProduk,Kategori,Harga\n");
                writer.write("1,Laptop Asus,Elektronik,8500000\n");
                writer.write("2,Mouse Optik,Aksesoris,125000\n");
                writer.write("3,Meja Belajar,Furnitur,450000\n");
            }

            // 2. Membaca dan mem-parsing data CSV
            System.out.println("Data Berkas CSV Berhasil Dibaca:");
            try (BufferedReader reader = new BufferedReader(new FileReader(fileCsv))) {
                String baris;
                boolean isHeader = true;
                while ((baris = reader.readLine()) != null) {
                    if (isHeader) {
                        System.out.println("[HEADER]: " + baris);
                        isHeader = false;
                        continue;
                    }
                    String[] kolom = baris.split(",");
                    System.out.printf(" -> Produk: %-15s | Kat: %-10s | Rp %,.2f%n",
                                      kolom[1], kolom[2], Double.parseDouble(kolom[3]));
                }
            }

            fileCsv.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error CSV: " + e.getMessage());
        }
    }
}
