// Mendemonstrasikan Exception Propagation: exception yang tidak ditangkap akan merambat naik ke pemanggil sebelumnya di call stack.
class ExceptionPropagation {
    public static void main(String[] args) {
        System.out.println("=== Perambatan Exception (Exception Propagation) ===");

        try {
            methodTingkat1();
        } catch (ArithmeticException e) {
            System.out.println("-> Exception berhasil ditangkap di method main(): " + e.getMessage());
        }
    }

    static void methodTingkat1() {
        System.out.println("Memasuki methodTingkat1()");
        methodTingkat2();
        System.out.println("Keluar dari methodTingkat1()"); // Tidak dicapai jika exception terjadi
    }

    static void methodTingkat2() {
        System.out.println("Memasuki methodTingkat2()");
        methodTingkat3();
    }

    static void methodTingkat3() {
        System.out.println("Memasuki methodTingkat3() -> Melempar pembagian nol");
        int hasil = 10 / 0; // Exception merambat naik: 3 -> 2 -> 1 -> main
    }
}
