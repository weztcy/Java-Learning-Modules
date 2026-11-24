// Mendemonstrasikan kompresi berkas ke format arsip ZIP menggunakan java.util.zip.ZipOutputStream.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class ZipFileOperations {
    public static void main(String[] args) {
        System.out.println("=== Operasi Kompresi File ZIP ===");

        File fileSumber = new File("dokumen_penting.txt");
        File fileZip = new File("arsip_dokumen.zip");

        try {
            // Menyiapkan file sumber
            FileWriter fw = new FileWriter(fileSumber);
            fw.write("Teks dokumen yang akan dikompresi ke dalam berkas ZIP.");
            fw.close();

            // Membuat aliran kompresi ZIP
            try (FileOutputStream fos = new FileOutputStream(fileZip);
                 ZipOutputStream zos = new ZipOutputStream(fos);
                 FileInputStream fis = new FileInputStream(fileSumber)) {

                // Mendaftarkan entry berkas di dalam ZIP
                ZipEntry entry = new ZipEntry(fileSumber.getName());
                zos.putNextEntry(entry);

                // Mentransfer data byte ke dalam zip stream
                byte[] buffer = new byte[1024];
                int panjang;
                while ((panjang = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, panjang);
                }
                zos.closeEntry();
            }

            System.out.println("Berhasil mengompresi '" + fileSumber.getName() + "' ke dalam '" + fileZip.getName() + "'");
            System.out.println("Ukuran file ZIP: " + fileZip.length() + " bytes");

            fileSumber.deleteOnExit();
            fileZip.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error ZIP: " + e.getMessage());
        }
    }
}
