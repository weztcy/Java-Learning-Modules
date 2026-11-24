// Mendemonstrasikan penggunaan class java.io.File untuk manajemen metadata file dan direktori fisik.
import java.io.File;
import java.io.IOException;

class FileClass {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan java.io.File ===");

        File berkas = new File("contoh_catatan.txt");

        try {
            // Membuat berkas baru jika belum ada
            if (berkas.createNewFile()) {
                System.out.println("Berkas berhasil dibuat: " + berkas.getName());
            } else {
                System.out.println("Berkas sudah ada di direktori: " + berkas.getName());
            }

            // Membaca metadata berkas
            System.out.println("Path Absolut : " + berkas.getAbsolutePath());
            System.out.println("Dapat dibaca : " + berkas.canRead());
            System.out.println("Dapat ditulis: " + berkas.canWrite());
            System.out.println("Ukuran file  : " + berkas.length() + " bytes");

            // Membersihkan file uji setelah demonstrasi
            berkas.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan IO: " + e.getMessage());
        }
    }
}
