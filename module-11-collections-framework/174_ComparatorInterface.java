// Mendemonstrasikan antarmuka Comparator untuk menyediakan berbagai strategi pengurutan fleksibel di luar class.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ComparatorInterface {
    public static void main(String[] args) {
        System.out.println("=== Interface Comparator ===");

        List<ProdukComp> produkList = new ArrayList<>();
        produkList.add(new ProdukComp("Laptop", 12000000));
        produkList.add(new ProdukComp("Headset", 350000));
        produkList.add(new ProdukComp("Mouse", 150000));

        // Strategi 1: Urutkan berdasarkan harga termurah
        produkList.sort(Comparator.comparingInt(p -> p.harga));
        System.out.println("Urutan Berdasarkan Harga Termurah:");
        produkList.forEach(p -> System.out.println(" " + p));

        // Strategi 2: Urutkan berdasarkan nama produk secara alfabetis
        produkList.sort(Comparator.comparing(p -> p.nama));
        System.out.println("\nUrutan Berdasarkan Nama Produk:");
        produkList.forEach(p -> System.out.println(" " + p));
    }
}

class ProdukComp {
    String nama;
    int harga;

    ProdukComp(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return nama + " - Rp " + harga;
    }
}
