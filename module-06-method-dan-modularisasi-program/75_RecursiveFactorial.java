// Mendemonstrasikan algoritma perhitungan faktorial (N!) menggunakan pendekatan rekursif.
class RecursiveFactorial {
    // n! = n * (n - 1)! dengan base case 0! = 1 dan 1! = 1
    static long faktorialRekursif(int n) {
        if (n <= 1) {
            return 1L; // Base case
        }
        return n * faktorialRekursif(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("=== Faktorial Rekursif ===");
        int[] daftarAngka = {0, 1, 4, 6, 8};

        for (int angka : daftarAngka) {
            long hasil = faktorialRekursif(angka);
            System.out.println(angka + "! = " + hasil);
        }
    }
}
