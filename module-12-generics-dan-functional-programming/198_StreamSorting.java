// Mendemonstrasikan pengurutan elemen stream menggunakan .sorted() secara alami maupun dengan Comparator.
import java.util.Comparator;
import java.util.List;

class StreamSorting {
    public static void main(String[] args) {
        System.out.println("=== Pengurutan Elemen Stream (.sorted()) ===");

        List<String> daftarKota = List.of("Semarang", "Bandung", "Aceh", "Denpasar", "Yogyakarta");

        // Urutan alami (abjad A-Z)
        List<String> terurutAbjad = daftarKota.stream()
            .sorted()
            .toList();

        // Urutan berdasarkan panjang karakter terbalik (terpanjang ke terpendek)
        List<String> terurutPanjang = daftarKota.stream()
            .sorted(Comparator.comparingInt(String::length).reversed())
            .toList();

        System.out.println("Daftar asal       : " + daftarKota);
        System.out.println("Terurut abjad A-Z : " + terurutAbjad);
        System.out.println("Terurut terpanjang: " + terurutPanjang);
    }
}
