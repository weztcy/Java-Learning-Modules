// Program praktis memeriksa apakah suatu bilangan bulat tergolong genap atau ganjil.
class EvenOddChecker {
    public static void main(String[] args) {
        int[] daftarAngka = {12, 17, 24, 33, 0, -7};

        System.out.println("=== Pemeriksa Bilangan Genap dan Ganjil ===");

        for (int angka : daftarAngka) {
            // Bilangan genap adalah bilangan yang jika dibagi 2 menghasilkan sisa 0
            if (angka % 2 == 0) {
                System.out.println("Angka " + angka + " -> GENAP");
            } else {
                System.out.println("Angka " + angka + " -> GANJIL");
            }
        }
    }
}
