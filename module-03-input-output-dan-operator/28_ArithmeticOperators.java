// Mendemonstrasikan operasi matematika dasar (penjumlahan, pengurangan, perkalian, pembagian, sisa bagi).
class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        // Operator aritmetika standar di Java
        int tambah = a + b;
        int kurang = a - b;
        int kali = a * b;
        int bagiBulat = a / b;    // Pembagian antar integer menghasilkan bilangan bulat
        int modulus = a % b;      // Sisa hasil bagi
        double bagiDesimal = (double) a / b; // Konversi agar menghasilkan pecahan presisi

        System.out.println("=== Operator Aritmetika ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + tambah);
        System.out.println("a - b = " + kurang);
        System.out.println("a * b = " + kali);
        System.out.println("a / b (bulat)   = " + bagiBulat);
        System.out.println("a / b (desimal) = " + bagiDesimal);
        System.out.println("a % b (modulus) = " + modulus);
    }
}
