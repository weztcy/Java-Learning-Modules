// Mendemonstrasikan constructor overloading: beberapa constructor dengan daftar parameter berbeda.
class ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("=== Constructor Overloading ===");

        // Menggunakan constructor default (tanpa argumen)
        ProdukOverload p1 = new ProdukOverload();

        // Menggunakan constructor 2 argumen
        ProdukOverload p2 = new ProdukOverload("Kopi Arabika", 45000);

        // Menggunakan constructor 3 argumen lengkap
        ProdukOverload p3 = new ProdukOverload("Teh Hijau", 25000, 100);

        p1.cetakInfo();
        p2.cetakInfo();
        p3.cetakInfo();
    }
}

class ProdukOverload {
    String nama;
    int harga;
    int stok;

    // Constructor 1: Default
    ProdukOverload() {
        this.nama = "Produk Belum Bernama";
        this.harga = 0;
        this.stok = 0;
    }

    // Constructor 2: Nama dan Harga
    ProdukOverload(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
        this.stok = 10; // Stok default
    }

    // Constructor 3: Lengkap
    ProdukOverload(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    void cetakInfo() {
        System.out.println("Produk: " + nama + " | Harga: Rp " + harga + " | Stok: " + stok);
    }
}
