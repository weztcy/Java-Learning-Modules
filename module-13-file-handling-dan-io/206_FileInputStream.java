// Mendemonstrasikan pembacaan data biner mentah (raw bytes) menggunakan FileInputStream.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class FileInputStreamDemo {
    public static void main(String[] args) {
        System.out.println("=== Membaca Byte Biner dengan FileInputStream ===");

        File berkas = new File("biner_input.dat");

        try {
            // Menyiapkan data biner (byte array)
            byte[] byteAsal = {65, 66, 67, 68, 69}; // ASCII untuk 'ABCDE'
            FileOutputStream fos = new FileOutputStream(berkas);
            fos.write(byteAsal);
            fos.close();

            // Membaca aliran byte
            try (FileInputStream fis = new FileInputStream(berkas)) {
                System.out.print("Byte mentah yang dibaca : ");
                int dataByte;
                while ((dataByte = fis.read()) != -1) {
                    System.out.print(dataByte + " ");
                }
                System.out.println();
            }

            berkas.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
