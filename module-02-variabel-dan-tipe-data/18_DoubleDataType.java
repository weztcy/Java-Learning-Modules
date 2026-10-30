// Mendemonstrasikan karakteristik tipe data double (64-bit double-precision floating point).
class DoubleDataType {
    public static void main(String[] args) {
        // Tipe double adalah tipe desimal default dengan tingkat presisi sekitar 15-17 digit desimal
        double presisiPi = 3.141592653589793;
        double saldoRekening = 12500000.75;

        System.out.println("=== Tipe Data Primitif: double (64-bit) ===");
        System.out.println("Presisi Tinggi Pi   : " + presisiPi);
        System.out.println("Saldo Rekening      : Rp " + saldoRekening);
        System.out.println("Rentang Positif Min : " + Double.MIN_VALUE);
        System.out.println("Rentang Positif Max : " + Double.MAX_VALUE);
    }
}
