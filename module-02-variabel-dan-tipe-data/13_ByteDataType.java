// Mendemonstrasikan karakteristik tipe data primitif byte (8-bit integer: -128 s.d. 127).
class ByteDataType {
    public static void main(String[] args) {
        // Tipe byte menghemat memori pada array besar ketika rentang nilainya terbatas
        byte nilaiMin = -128;
        byte nilaiMax = 127;
        byte suhuRuangan = 26;

        System.out.println("=== Tipe Data Primitif: byte (8-bit) ===");
        System.out.println("Nilai Minimum byte : " + nilaiMin);
        System.out.println("Nilai Maksimum byte : " + nilaiMax);
        System.out.println("Contoh Penggunaan   : " + suhuRuangan + " derajat Celcius");
    }
}
