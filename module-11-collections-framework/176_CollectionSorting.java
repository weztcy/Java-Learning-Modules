// Mendemonstrasikan teknik pengurutan koleksi modern dengan List.sort() dan lambda expression.
import java.util.ArrayList;
import java.util.List;

class CollectionSorting {
    public static void main(String[] args) {
        System.out.println("=== Pengurutan Koleksi Modern (List.sort) ===");

        List<String> bahasa = new ArrayList<>(List.of("Python", "Java", "C++", "JavaScript", "Rust"));

        // Mengurutkan berdasarkan panjang kata (length)
        bahasa.sort((b1, b2) -> Integer.compare(b1.length(), b2.length()));
        System.out.println("Terurut berdasarkan panjang karakter: " + bahasa);

        // Mengurutkan terbalik abjad
        bahasa.sort((b1, b2) -> b2.compareTo(b1));
        System.out.println("Terurut abjad terbalik (Z-A)         : " + bahasa);
    }
}
