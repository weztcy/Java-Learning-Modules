// Mendemonstrasikan static methods sebagai fungsi utilitas class yang tidak memerlukan state instance.
class StaticMethods {
    public static void main(String[] args) {
        System.out.println("=== Static Methods Utility ===");

        // Pemanggilan method tanpa instansiasi objek
        int hasilTambah = UtilitasMatematika.tambah(45, 55);
        int hasilKali = UtilitasMatematika.kali(12, 8);

        System.out.println("Hasil 45 + 55 = " + hasilTambah);
        System.out.println("Hasil 12 * 8  = " + hasilKali);
    }
}

class UtilitasMatematika {
    static int tambah(int a, int b) {
        return a + b;
    }

    static int kali(int a, int b) {
        return a * b;
    }
}
