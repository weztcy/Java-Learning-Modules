// Mendemonstrasikan ArrayList: list berbasis array dinamis yang dapat membesar secara otomatis.
import java.util.ArrayList;
import java.util.List;

class ArrayListBasic {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan java.util.ArrayList ===");

        List<String> daftarSiswa = new ArrayList<>();

        // Menambahkan elemen dengan .add()
        daftarSiswa.add("Andi Pratama");
        daftarSiswa.add("Budi Santoso");
        daftarSiswa.add("Citra Dewi");

        System.out.println("Ukuran list     : " + daftarSiswa.size());
        System.out.println("Elemen indeks 1 : " + daftarSiswa.get(1));

        // Mengubah dan menghapus elemen
        daftarSiswa.set(1, "Budi Perkasa");
        daftarSiswa.remove(0); // Menghapus "Andi Pratama"

        System.out.println("Daftar siswa akhir: " + daftarSiswa);
    }
}
