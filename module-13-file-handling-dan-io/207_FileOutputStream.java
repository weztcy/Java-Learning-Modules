// Mendemonstrasikan penulisan data biner mentah menggunakan FileOutputStream.
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo {
    public static void main(String[] args) {
        System.out.println("=== Menulis Byte Biner dengan FileOutputStream ===");

        File berkas = new File("biner_output.dat");

        try (FileOutputStream fos = new FileOutputStream(berkas)) {
            String teks = "Binary Data Java";
            byte[] dataBytes = teks.getBytes(); // Mengonversi string ke byte[]

            fos.write(dataBytes);
            System.out.println("Berhasil menulis " + dataBytes.length + " bytes data biner.");

            berkas.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error IO: " + e.getMessage());
        }
    }
}
