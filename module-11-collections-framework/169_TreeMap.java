// Mendemonstrasikan TreeMap: implementasi Map berbasis pohon seimbang yang kuncinya selalu terurut.
import java.util.TreeMap;
import java.util.Map;

class TreeMapDemo {
    public static void main(String[] args) {
        System.out.println("=== java.util.TreeMap (Sorted Keys) ===");

        Map<String, Double> daftarIPK = new TreeMap<>();

        daftarIPK.put("Rian", 3.75);
        daftarIPK.put("Agus", 3.90);
        daftarIPK.put("Zulfa", 3.82);
        daftarIPK.put("Bambang", 3.60);

        System.out.println("Daftar mahasiswa terurut abjad secara otomatis:");
        for (String nama : daftarIPK.keySet()) {
            System.out.printf(" %-10s : %.2f%n", nama, daftarIPK.get(nama));
        }
    }
}
