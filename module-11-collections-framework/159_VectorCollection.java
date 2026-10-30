// Mendemonstrasikan Vector: koleksi list legacy yang seluruh method-nya disinkronisasi (thread-safe).
import java.util.Vector;

class VectorCollection {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan java.util.Vector (Legacy Thread-Safe) ===");

        Vector<Integer> angka = new Vector<>(3, 2); // Kapasitas awal 3, kenaikan kapasitas 2

        angka.add(10);
        angka.add(20);
        angka.add(30);
        System.out.println("Ukuran: " + angka.size() + " | Kapasitas: " + angka.capacity());

        // Menambahkan elemen ke-4 akan melipatgandakan kapasitas
        angka.add(40);
        System.out.println("Setelah elemen ke-4 -> Ukuran: " + angka.size() + " | Kapasitas: " + angka.capacity());
        System.out.println("Isi Vector: " + angka);
    }
}
