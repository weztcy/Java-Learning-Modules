// Mendemonstrasikan karakteristik tipe data primitif short (16-bit integer: -32.768 s.d. 32.767).
class ShortDataType {
    public static void main(String[] args) {
        // Tipe short berukuran 2 byte, digunakan untuk nilai bilangan bulat menengah
        short nilaiMin = Short.MIN_VALUE;
        short nilaiMax = Short.MAX_VALUE;
        short tahunKemerdekaan = 1945;

        System.out.println("=== Tipe Data Primitif: short (16-bit) ===");
        System.out.println("Nilai Minimum short : " + nilaiMin);
        System.out.println("Nilai Maksimum short : " + nilaiMax);
        System.out.println("Contoh Penggunaan   : Tahun " + tahunKemerdekaan);
    }
}
