// Mendemonstrasikan pencarian elemen efisien menggunakan Collections.binarySearch (O(log n)).
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionSearching {
    public static void main(String[] args) {
        System.out.println("=== Pencarian Biner pada Koleksi (binarySearch) ===");

        List<String> daftarNama = new ArrayList<>(List.of("Budi", "Citra", "Dewi", "Eko", "Fajar"));
        // binarySearch mewajibkan list sudah terurut menaik
        Collections.sort(daftarNama);

        String target = "Dewi";
        int index = Collections.binarySearch(daftarNama, target);

        System.out.println("Daftar terurut : " + daftarNama);
        System.out.println("Mencari target : '" + target + "'");
        System.out.println("Ditemukan pada : Indeks ke-" + index);
    }
}
