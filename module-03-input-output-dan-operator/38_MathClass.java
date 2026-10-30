// Mendemonstrasikan fungsi matematika bawaan pada class java.lang.Math.
class MathClass {
    public static void main(String[] args) {
        double angkaNegatif = -45.67;
        double basis = 2.0;
        double pangkat = 8.0;

        // Memanggil fungsi-fungsi statis pada class Math
        double nilaiAbsolut = Math.abs(angkaNegatif);
        double hasilPangkat = Math.pow(basis, pangkat);
        double akarKuadrat = Math.sqrt(144.0);
        int nilaiMaks = Math.max(120, 250);
        int nilaiMin = Math.min(120, 250);
        long pembulatan = Math.round(angkaNegatif);

        System.out.println("=== Operasi Matematika Menggunakan java.lang.Math ===");
        System.out.println("Nilai Absolut dari " + angkaNegatif + " : " + nilaiAbsolut);
        System.out.println("2 pangkat 8                   : " + hasilPangkat);
        System.out.println("Akar kuadrat dari 144         : " + akarKuadrat);
        System.out.println("Nilai Maksimum (120, 250)     : " + nilaiMaks);
        System.out.println("Nilai Minimum (120, 250)      : " + nilaiMin);
        System.out.println("Pembulatan terdekat           : " + pembulatan);
    }
}
