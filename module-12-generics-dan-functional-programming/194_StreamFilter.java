// Mendemonstrasikan operasi perantara .filter() untuk menyaring elemen stream berdasarkan kondisi logika.
import java.util.List;

class StreamFilter {
    public static void main(String[] args) {
        System.out.println("=== Operasi Stream .filter() ===");

        List<Integer> kumpulanAngka = List.of(15, 22, 8, 37, 40, 55, 62, 11);

        System.out.println("Daftar awal: " + kumpulanAngka);

        // Menyaring hanya bilangan genap yang lebih besar dari 20
        List<Integer> hasilSaring = kumpulanAngka.stream()
            .filter(n -> n % 2 == 0)
            .filter(n -> n > 20)
            .toList();

        System.out.println("Hasil filter (genap dan > 20): " + hasilSaring);
    }
}
