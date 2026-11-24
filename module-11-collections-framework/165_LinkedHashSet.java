// Mendemonstrasikan LinkedHashSet: kombinasi tabel hash dan linked list yang mempertahankan urutan penyisipan (insertion-order).
import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHashSetDemo {
    public static void main(String[] args) {
        System.out.println("=== LinkedHashSet (Menjaga Insertion Order) ===");

        Set<String> urutanKota = new LinkedHashSet<>();

        urutanKota.add("Jakarta");
        urutanKota.add("Surabaya");
        urutanKota.add("Medan");
        urutanKota.add("Bandung");

        System.out.println("Urutan elemen persis sesuai urutan penambahan:");
        for (String kota : urutanKota) {
            System.out.println(" -> " + kota);
        }
    }
}
