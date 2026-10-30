// Mendemonstrasikan pemformatan dan parsing tanggal teks dengan java.time.format.DateTimeFormatter.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class DateTimeFormatterDemo {
    public static void main(String[] args) {
        System.out.println("=== java.time.format.DateTimeFormatter ===");

        LocalDate tanggal = LocalDate.of(2026, 10, 17);

        // Format pola Indonesia
        DateTimeFormatter polaID = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID"));
        String teksTanggal = tanggal.format(polaID);
        System.out.println("Format Tanggal Indonesia: " + teksTanggal);

        // Parsing dari teks kembali menjadi objek LocalDate
        String inputTeks = "25/12/2026";
        DateTimeFormatter polaParse = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hasilParse = LocalDate.parse(inputTeks, polaParse);
        System.out.println("Hasil Parsing String ke Objek: " + hasilParse);
    }
}
