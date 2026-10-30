// Mendemonstrasikan deret bilangan Fibonacci menggunakan rekursi matematis F(n) = F(n-1) + F(n-2).
class RecursiveFibonacci {
    // F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2)
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("=== Fibonacci Rekursif ===");
        int jumlahDeret = 10;

        System.out.print("Deret Fibonacci (" + jumlahDeret + " angka pertama): ");
        for (int i = 0; i < jumlahDeret; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}
