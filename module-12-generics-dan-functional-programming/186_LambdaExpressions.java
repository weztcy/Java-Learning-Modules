// Mendemonstrasikan ekspresi Lambda sebagai sintaks ringkas fungsi anonim (Java 8+).
class LambdaExpressions {
    public static void main(String[] args) {
        System.out.println("=== Lambda Expressions ===");

        // Lambda dengan dua parameter dan operasi matematika ringkas
        OperasiAritmetika penjumlahan = (a, b) -> a + b;
        OperasiAritmetika perkalian = (a, b) -> a * b;

        System.out.println("10 + 25 = " + penjumlahan.hitung(10, 25));
        System.out.println("10 * 25 = " + perkalian.hitung(10, 25));
    }
}

@FunctionalInterface
interface OperasiAritmetika {
    int hitung(int a, int b);
}
