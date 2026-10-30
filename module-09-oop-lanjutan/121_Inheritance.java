// Mendemonstrasikan konsep dasar pewarisan (Inheritance) dengan kata kunci extends.
class Inheritance {
    public static void main(String[] args) {
        System.out.println("=== Konsep Pewarisan (Inheritance) ===");

        KucingPiaraan kucing = new KucingPiaraan();
        // Mengakses atribut yang diwarisi dari superclass HewanDasar
        kucing.nama = "Kuro";
        kucing.makan(); // Method warisan

        // Memanggil method khusus milik subclass
        kucing.mengeong();
    }
}

// Superclass
class HewanDasar {
    String nama;

    void makan() {
        System.out.println(nama + " sedang makan makanan bernutrisi.");
    }
}

// Subclass mewarisi seluruh anggota non-private dari HewanDasar
class KucingPiaraan extends HewanDasar {
    void mengeong() {
        System.out.println(nama + " bersuara: Meong... Meong!");
    }
}
