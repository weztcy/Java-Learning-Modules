// Mendemonstrasikan konsep dasar Generics untuk menjamin keamanan tipe data (Type Safety) saat kompilasi.
import java.util.ArrayList;
import java.util.List;

class GenericsBasic {
    public static void main(String[] args) {
        System.out.println("=== Konsep Dasar Generics (Type Safety) ===");

        // Koleksi dengan Generics: menentukan tipe data elemen secara eksplisit <String>
        List<String> daftarKota = new ArrayList<>();
        daftarKota.add("Bandung");
        daftarKota.add("Surabaya");
        // daftarKota.add(100); // COMPILE ERROR: compiler langsung mendeteksi ketidaksesuaian tipe

        // Tidak memerlukan casting manual karena tipe sudah dipastikan oleh compiler
        String kotaPertama = daftarKota.get(0);
        System.out.println("Kota pertama: " + kotaPertama);
        System.out.println("Keuntungan: Menghindari ClassCastException di waktu runtime.");
    }
}
