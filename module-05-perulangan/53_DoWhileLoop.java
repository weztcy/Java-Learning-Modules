// Mendemonstrasikan perulangan do-while yang menjamin blok kode dijalankan minimal satu kali.
class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("=== Perulangan do-while ===");

        int angka = 10;

        // Meskipun kondisi (angka < 5) bernilai false sejak awal, blok do tetap berjalan 1 kali
        do {
            System.out.println("Nilai angka saat ini: " + angka);
            System.out.println("Blok ini dieksekusi sebelum kondisi diuji.");
            angka++;
        } while (angka < 5);

        System.out.println("Perulangan do-while selesai.");
    }
}
