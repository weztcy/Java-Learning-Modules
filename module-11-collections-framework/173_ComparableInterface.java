// Mendemonstrasikan antarmuka Comparable untuk menentukan urutan alami (natural ordering) objek.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparableInterface {
    public static void main(String[] args) {
        System.out.println("=== Interface Comparable (compareTo) ===");

        List<MahasiswaComp> daftar = new ArrayList<>();
        daftar.add(new MahasiswaComp("Dewi", 3.85));
        daftar.add(new MahasiswaComp("Andi", 3.45));
        daftar.add(new MahasiswaComp("Budi", 3.95));

        // Mengurutkan berdasarkan IPK tertinggi (sesuai logika compareTo di class MahasiswaComp)
        Collections.sort(daftar);

        System.out.println("Daftar Mahasiswa Terurut IPK Tertinggi:");
        for (MahasiswaComp m : daftar) {
            System.out.println(" - " + m);
        }
    }
}

class MahasiswaComp implements Comparable<MahasiswaComp> {
    String nama;
    double ipk;

    MahasiswaComp(String nama, double ipk) {
        this.nama = nama;
        this.ipk = ipk;
    }

    @Override
    public int compareTo(MahasiswaComp other) {
        // Urutan menurun (Descending): IPK tinggi di awal
        return Double.compare(other.ipk, this.ipk);
    }

    @Override
    public String toString() {
        return nama + " (IPK: " + ipk + ")";
    }
}
