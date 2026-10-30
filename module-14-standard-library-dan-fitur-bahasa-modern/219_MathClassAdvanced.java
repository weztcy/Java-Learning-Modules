// Mendemonstrasikan operasi matematika tingkat lanjut pada class java.lang.Math (trigonometri, logaritma, eksponensial).
class MathClassAdvanced {
    public static void main(String[] args) {
        System.out.println("=== Operasi Matematika Lanjutan (Math Class) ===");

        double sudutDerajat = 45.0;
        double sudutRadian = Math.toRadians(sudutDerajat);

        // Fungsi trigonometri
        double nilaiSin = Math.sin(sudutRadian);
        double nilaiCos = Math.cos(sudutRadian);
        double nilaiTan = Math.tan(sudutRadian);

        // Fungsi logaritma dan eksponensial
        double nilaiLog10 = Math.log10(1000.0);
        double nilaiExp = Math.exp(1.0); // Bilangan Euler e^1

        System.out.printf("Sudut 45 deg -> sin: %.4f | cos: %.4f | tan: %.4f%n", nilaiSin, nilaiCos, nilaiTan);
        System.out.println("Logaritma basis 10 dari 1000 : " + nilaiLog10);
        System.out.printf("Konstanta Euler e             : %.5f%n", nilaiExp);
    }
}
