// Mendemonstrasikan override method toString() untuk menghasilkan representasi teks deskriptif objek.
class ToStringMethod {
    public static void main(String[] args) {
        System.out.println("=== Override Method toString() ===");

        BukuPerpustakaan buku = new BukuPerpustakaan("Clean Code", "Robert C. Martin", 2008);

        // System.out.println otomatis memanggil method toString() milik objek
        System.out.println(buku);
    }
}

class BukuPerpustakaan {
    private String judul;
    private String penulis;
    private int tahun;

    BukuPerpustakaan(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    // Meng-override toString dari class Object
    @Override
    public String toString() {
        return "BukuPerpustakaan[Judul: '" + judul + "', Penulis: " + penulis + ", Tahun: " + tahun + "]";
    }
}
