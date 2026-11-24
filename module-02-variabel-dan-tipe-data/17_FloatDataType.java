// Mendemonstrasikan karakteristik tipe data float (32-bit single-precision floating point).
class FloatDataType {
    public static void main(String[] args) {
        // Literal pecahan di Java default-nya adalah double, sehingga float wajib diberi akhiran 'F' atau 'f'
        float piSingkat = 3.14159f;
        float suhuTubuh = 36.6f;

        System.out.println("=== Tipe Data Primitif: float (32-bit) ===");
        System.out.println("Konstanta Pi (float): " + piSingkat);
        System.out.println("Suhu Tubuh Normal   : " + suhuTubuh + " C");
        System.out.println("Rentang Positif Min : " + Float.MIN_VALUE);
        System.out.println("Rentang Positif Max : " + Float.MAX_VALUE);
    }
}
