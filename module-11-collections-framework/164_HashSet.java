// Mendemonstrasikan HashSet: himpunan elemen unik tanpa duplikasi berbasis tabel hash.
import java.util.HashSet;
import java.util.Set;

class HashSetDemo {
    public static void main(String[] args) {
        System.out.println("=== java.util.HashSet (Himpunan Unik) ===");

        Set<String> hobi = new HashSet<>();

        hobi.add("Membaca");
        hobi.add("Coding");
        hobi.add("Olahraga");
        // Menambahkan elemen yang sama tidak akan menambah ukuran (duplikasi diabaikan)
        boolean statusTambah = hobi.add("Coding");

        System.out.println("Apakah 'Coding' berhasil ditambah lagi? " + statusTambah);
        System.out.println("Jumlah hobi unik: " + hobi.size());
        System.out.println("Daftar hobi     : " + hobi);
    }
}
