// Mendemonstrasikan konsep dasar Class sebagai cetak biru (blueprint) objek di Java.
class ClassBasic {
    public static void main(String[] args) {
        System.out.println("=== Konsep Class dan Object ===");

        // Membuat objek 'buku1' dari cetak biru class BukuDasar
        BukuDasar buku1 = new BukuDasar();
        buku1.judul = "Pemrograman Java untuk Pemula";
        buku1.penulis = "Budi Raharjo";
        buku1.harga = 95000;

        System.out.println("Informasi Buku 1:");
        System.out.println("Judul   : " + buku1.judul);
        System.out.println("Penulis : " + buku1.penulis);
        System.out.println("Harga   : Rp " + buku1.harga);
    }
}

// Blueprint class BukuDasar
class BukuDasar {
    String judul;
    String penulis;
    int harga;
}
