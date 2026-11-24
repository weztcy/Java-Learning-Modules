// Mendemonstrasikan karakteristik tipe data int (32-bit: default integer di Java).
class IntDataType {
    public static void main(String[] args) {
        // Tipe int adalah pilihan standar untuk representasi bilangan bulat di Java
        int nilaiMin = Integer.MIN_VALUE;
        int nilaiMax = Integer.MAX_VALUE;
        int populasiKota = 1500000;

        System.out.println("=== Tipe Data Primitif: int (32-bit) ===");
        System.out.println("Nilai Minimum int : " + nilaiMin);
        System.out.println("Nilai Maksimum int : " + nilaiMax);
        System.out.println("Jumlah Populasi   : " + populasiKota + " jiwa");
    }
}
