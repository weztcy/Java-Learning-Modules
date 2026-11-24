// Mendemonstrasikan java.time.LocalDateTime untuk penggabungan informasi tanggal dan waktu secara simultan.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class LocalDateTimeDemo {
    public static void main(String[] args) {
        System.out.println("=== java.time.LocalDateTime ===");

        LocalDateTime saatIni = LocalDateTime.now();
        System.out.println("Waktu Penuh Sistem : " + saatIni);

        // Menjadwalkan rapat 2 hari dan 3 jam dari sekarang
        LocalDateTime jadwalRapat = saatIni.plusDays(2).plusHours(3);

        DateTimeFormatter formatIndonesia = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
        System.out.println("Jadwal Konferensi  : " + jadwalRapat.format(formatIndonesia));
    }
}
