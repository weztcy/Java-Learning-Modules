// Mendemonstrasikan java.time.LocalDate untuk manipulasi kalender tanggal (tahun, bulan, hari) tanpa komponen jam.
import java.time.LocalDate;
import java.time.Month;

class LocalDateDemo {
    public static void main(String[] args) {
        System.out.println("=== java.time.LocalDate ===");

        // Tanggal hari ini
        LocalDate hariIni = LocalDate.now();
        System.out.println("Tanggal Hari Ini : " + hariIni);

        // Membuat tanggal spesifik (17 Agustus 1945)
        LocalDate proklamasi = LocalDate.of(1945, Month.AUGUST, 17);
        System.out.println("Hari Proklamasi  : " + proklamasi.getDayOfWeek() + ", " + proklamasi);

        // Operasi penambahan hari/bulan
        LocalDate tigaPuluhHariLagi = hariIni.plusDays(30);
        System.out.println("30 Hari Kedepan  : " + tigaPuluhHariLagi);
        System.out.println("Apakah tahun ini kabisat? " + hariIni.isLeapYear());
    }
}
