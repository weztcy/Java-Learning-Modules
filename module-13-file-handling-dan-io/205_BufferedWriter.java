// Mendemonstrasikan penulisan teks berkinerja tinggi menggunakan BufferedWriter dan .newLine().
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class BufferedWriterDemo {
    public static void main(String[] args) {
        System.out.println("=== Menulis Berkas dengan BufferedWriter ===");

        File berkas = new File("buffer_tulis.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(berkas))) {
            writer.write("Data Laporan Penjualan Q1");
            writer.newLine(); // Membuat pemisah baris portabel
            writer.write("Total Transaksi: 1,450 unit");
            writer.newLine();
            writer.write("Status Laporan : VALIDATED");

            System.out.println("Laporan berhasil ditulis menggunakan buffer internal.");
            berkas.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error menulis buffer: " + e.getMessage());
        }
    }
}
