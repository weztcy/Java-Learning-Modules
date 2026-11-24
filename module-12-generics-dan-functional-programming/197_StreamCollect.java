// Mendemonstrasikan operasi terminal .collect() menggunakan java.util.stream.Collectors (toList, joining, toSet).
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class StreamCollect {
    public static void main(String[] args) {
        System.out.println("=== Operasi Stream .collect() ===");

        List<String> bahasa = List.of("Java", "Go", "Rust", "Java", "Python", "Go");

        // 1. Mengumpulkan ke himpunan unik (Set)
        Set<String> setUnik = bahasa.stream().collect(Collectors.toSet());
        System.out.println("Hasil toSet()  : " + setUnik);

        // 2. Menggabungkan string dengan delimiter (joining)
        String teksGabungan = bahasa.stream()
            .distinct()
            .collect(Collectors.joining(" -> ", "[AWAL] ", " [AKHIR]"));
        System.out.println("Hasil joining(): " + teksGabungan);
    }
}
