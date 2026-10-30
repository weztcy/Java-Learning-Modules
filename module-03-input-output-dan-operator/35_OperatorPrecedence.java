// Mendemonstrasikan urutan prioritas eksekusi operator (precedence) dan penggunaan tanda kurung.
class OperatorPrecedence {
    public static void main(String[] args) {
        // Perkalian (*) memiliki prioritas lebih tinggi daripada penjumlahan (+)
        int hasilTanpaKurung = 10 + 5 * 2; // 10 + 10 = 20
        
        // Tanda kurung () memaksa operasi di dalamnya dieksekusi lebih dulu
        int hasilDenganKurung = (10 + 5) * 2; // 15 * 2 = 30

        // Evaluasi campuran aritmetika, perbandingan, dan logika
        boolean evaluasiLogika = 5 + 3 * 2 > 10 && 4 < 8; // (5 + 6 > 10) && true -> (11 > 10) && true -> true

        System.out.println("=== Operator Precedence (Prioritas Operator) ===");
        System.out.println("10 + 5 * 2   = " + hasilTanpaKurung + " (perkalian dieksekusi dahulu)");
        System.out.println("(10 + 5) * 2 = " + hasilDenganKurung + " (tanda kurung diutamakan)");
        System.out.println("5 + 3 * 2 > 10 && 4 < 8 = " + evaluasiLogika);
    }
}
