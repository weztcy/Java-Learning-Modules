// Mendemonstrasikan penanganan file konfigurasi aplikasi menggunakan java.util.Properties.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

class PropertiesFile {
    public static void main(String[] args) {
        System.out.println("=== Manajemen File Konfigurasi Properties ===");

        File fileProp = new File("app_config.properties");
        Properties properti = new Properties();

        // 1. Menetapkan pasangan properti konfigurasi
        properti.setProperty("app.nama", "Sistem Enterprise Kampus");
        properti.setProperty("app.versi", "2.4.0");
        properti.setProperty("db.port", "3306");
        properti.setProperty("db.host", "localhost");

        try {
            // Menyimpan properti ke berkas
            FileOutputStream fos = new FileOutputStream(fileProp);
            properti.store(fos, "Konfigurasi Utama Aplikasi");
            fos.close();
            System.out.println("Konfigurasi tersimpan ke: " + fileProp.getName());

            // 2. Membaca kembali dari berkas
            Properties configLoaded = new Properties();
            FileInputStream fis = new FileInputStream(fileProp);
            configLoaded.load(fis);
            fis.close();

            System.out.println("Nama Aplikasi : " + configLoaded.getProperty("app.nama"));
            System.out.println("Versi         : " + configLoaded.getProperty("app.versi"));
            System.out.println("Database Host : " + configLoaded.getProperty("db.host") + ":" + configLoaded.getProperty("db.port"));

            fileProp.deleteOnExit();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
