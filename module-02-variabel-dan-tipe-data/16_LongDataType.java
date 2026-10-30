// Mendemonstrasikan karakteristik tipe data long (64-bit integer besar dengan akhiran L).
class LongDataType {
    public static void main(String[] args) {
        // Penulisan literal long membutuhkan akhiran huruf 'L' agar tidak dianggap sebagai int oleh compiler
        long jarakBintangKm = 9460730472580800L;
        long nilaiMin = Long.MIN_VALUE;
        long nilaiMax = Long.MAX_VALUE;

        System.out.println("=== Tipe Data Primitif: long (64-bit) ===");
        System.out.println("Nilai Minimum long : " + nilaiMin);
        System.out.println("Nilai Maksimum long : " + nilaiMax);
        System.out.println("Jarak 1 Tahun Cahaya: " + jarakBintangKm + " km");
    }
}
