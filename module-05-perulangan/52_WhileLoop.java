// Mendemonstrasikan perulangan while yang memeriksa kondisi di awal sebelum eksekusi blok.
class WhileLoop {
    public static void main(String[] args) {
        System.out.println("=== Perulangan while ===");

        int energiBaterai = 100;
        int konsumsiPerJam = 25;
        int jam = 0;

        // Loop berjalan selama kondisi (energiBaterai > 0) masih bernilai true
        while (energiBaterai > 0) {
            jam++;
            energiBaterai -= konsumsiPerJam;
            System.out.println("Jam ke-" + jam + ": Sisa baterai " + energiBaterai + "%");
        }

        System.out.println("Baterai habis setelah beroperasi " + jam + " jam.");
    }
}
