// Mendemonstrasikan java.time.LocalTime untuk penanganan waktu jam, menit, detik, dan nanodetik tanpa zona.
import java.time.LocalTime;

class LocalTimeDemo {
    public static void main(String[] args) {
        System.out.println("=== java.time.LocalTime ===");

        LocalTime waktuSekarang = LocalTime.now();
        System.out.println("Waktu Saat Ini : " + waktuSekarang);

        // Menentukan jadwal waktu tertentu
        LocalTime jadwalMasuk = LocalTime.of(8, 0, 0);
        LocalTime jadwalPulang = jadwalMasuk.plusHours(9);

        System.out.println("Jam Masuk Kerja : " + jadwalMasuk);
        System.out.println("Jam Pulang Kerja: " + jadwalPulang);
        System.out.println("Apakah sekarang setelah jam masuk? " + waktuSekarang.isAfter(jadwalMasuk));
    }
}
