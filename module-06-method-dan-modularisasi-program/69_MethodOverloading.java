// Mendemonstrasikan method overloading: beberapa method dengan nama sama namun parameter berbeda.
class MethodOverloading {
    // Versi 1: Penjumlahan dua bilangan integer
    static int tambah(int a, int b) {
        return a + b;
    }

    // Versi 2: Penjumlahan tiga bilangan integer (beda jumlah parameter)
    static int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Versi 3: Penjumlahan dua bilangan double (beda tipe parameter)
    static double tambah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("=== Method Overloading ===");
        System.out.println("tambah(10, 20)         : " + tambah(10, 20));
        System.out.println("tambah(10, 20, 30)     : " + tambah(10, 20, 30));
        System.out.println("tambah(12.5, 7.8)      : " + tambah(12.5, 7.8));
    }
}
