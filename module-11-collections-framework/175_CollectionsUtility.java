// Mendemonstrasikan class utilitas java.util.Collections (min, max, reverse, shuffle, binarySearch).
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionsUtility {
    public static void main(String[] args) {
        System.out.println("=== Class Utilitas java.util.Collections ===");

        List<Integer> angka = new ArrayList<>(List.of(34, 12, 89, 5, 67, 23));

        System.out.println("List Awal      : " + angka);
        System.out.println("Nilai Minimum  : " + Collections.min(angka));
        System.out.println("Nilai Maksimum : " + Collections.max(angka));

        Collections.sort(angka);
        System.out.println("Setelah sort   : " + angka);

        Collections.reverse(angka);
        System.out.println("Setelah reverse: " + angka);
    }
}
