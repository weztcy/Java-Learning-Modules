// Mendemonstrasikan operator ternary (? :) sebagai alternatif ringkas dari if-else sederhana.
class TernaryOperator {
    public static void main(String[] args) {
        int nilaiUjian = 78;
        int batasKelulusan = 70;

        // Sintaks: kondisi ? nilai_jika_true : nilai_jika_false
        String statusKelulusan = (nilaiUjian >= batasKelulusan) ? "LULUS" : "TIDAK LULUS";

        int angka = -15;
        String jenisAngka = (angka >= 0) ? "Positif/Nol" : "Negatif";

        System.out.println("=== Operator Ternary (? :) ===");
        System.out.println("Nilai Siswa : " + nilaiUjian);
        System.out.println("Status      : " + statusKelulusan);
        System.out.println("Angka " + angka + " adalah bilangan: " + jenisAngka);
    }
}
