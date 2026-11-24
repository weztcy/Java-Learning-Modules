// Mendemonstrasikan java.math.BigInteger untuk komputasi bilangan bulat berukuran luar biasa besar tanpa batas.
import java.math.BigInteger;

class BigIntegerDemo {
    public static void main(String[] args) {
        System.out.println("=== java.math.BigInteger (Bilangan Bulat Raksasa) ===");

        // Angka yang melampaui kapasitas 64-bit Long (Long.MAX_VALUE = 9,223,372,036,854,775,807)
        BigInteger angkaA = new BigInteger("987654321098765432109876543210");
        BigInteger angkaB = new BigInteger("123456789012345678901234567890");

        BigInteger hasilJumlah = angkaA.add(angkaB);
        BigInteger hasilKali = angkaA.multiply(angkaB);

        System.out.println("Angka A       : " + angkaA);
        System.out.println("Angka B       : " + angkaB);
        System.out.println("A + B         : " + hasilJumlah);
        System.out.println("A * B         : " + hasilKali);
    }
}
