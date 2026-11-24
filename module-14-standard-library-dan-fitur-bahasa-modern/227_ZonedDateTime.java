// Mendemonstrasikan java.time.ZonedDateTime untuk konversi waktu antar zona geografis dunia (WIB, UTC, Tokyo).
import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZonedDateTimeDemo {
    public static void main(String[] args) {
        System.out.println("=== java.time.ZonedDateTime (Manajemen Zona Waktu) ===");

        // Waktu di Jakarta (Asia/Jakarta - UTC+7)
        ZonedDateTime waktuJakarta = ZonedDateTime.now(ZoneId.of("Asia/Jakarta"));
        System.out.println("Waktu Jakarta (WIB) : " + waktuJakarta);

        // Konversi waktu yang sama ke zona Tokyo (Asia/Tokyo - UTC+9)
        ZonedDateTime waktuTokyo = waktuJakarta.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println("Waktu Tokyo (JST)   : " + waktuTokyo);

        // Konversi ke zona standar UTC
        ZonedDateTime waktuUtc = waktuJakarta.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("Waktu Universal UTC : " + waktuUtc);
    }
}
