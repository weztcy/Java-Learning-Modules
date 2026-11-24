// Mendemonstrasikan pengenalan Stream API: aliran data fungsional dari sumber koleksi.
import java.util.List;
import java.util.stream.Stream;

class StreamBasic {
    public static void main(String[] args) {
        System.out.println("=== Pengenalan Java Stream API ===");

        List<String> daftarTeknologi = List.of("Docker", "Kubernetes", "Spring", "Kafka", "PostgreSQL");

        // Membuat stream dan melakukan iterasi fungsional
        System.out.println("Iterasi Stream:");
        daftarTeknologi.stream().forEach(item -> System.out.println(" - " + item));

        // Membuat stream dari nilai langsung
        long jumlahElemen = Stream.of(1, 2, 3, 4, 5).count();
        System.out.println("Jumlah elemen dalam Stream.of: " + jumlahElemen);
    }
}
