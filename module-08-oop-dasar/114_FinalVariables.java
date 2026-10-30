// Mendemonstrasikan final variables (variabel yang nilainya tidak dapat diubah setelah diinisialisasi).
class FinalVariables {
    public static void main(String[] args) {
        System.out.println("=== Final Variables ===");

        // Final local variable
        final int BATAS_MAKSIMUM = 100;
        System.out.println("Nilai BATAS_MAKSIMUM: " + BATAS_MAKSIMUM);

        LingkaranBulat ling = new LingkaranBulat(7.0);
        System.out.printf("Jari-jari: %.1f | Luas: %.2f%n", ling.jariJari, ling.hitungLuas());
    }
}

class LingkaranBulat {
    // Final field harus diinisialisasi langsung atau di dalam constructor
    final double PI = 3.141592653589793;
    final double jariJari;

    LingkaranBulat(double r) {
        this.jariJari = r;
    }

    double hitungLuas() {
        return PI * jariJari * jariJari;
    }
}
