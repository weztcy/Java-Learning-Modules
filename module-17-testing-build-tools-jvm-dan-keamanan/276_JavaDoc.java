// Mendemonstrasikan format penulisan dokumentasi resmi JavaDoc standar industri.
class JavaDoc {
    public static void main(String[] args) {
        System.out.println("=== 276. Penulisan Dokumentasi JavaDoc Standar ===");

        KalkulatorFinansial calc = new KalkulatorFinansial();
        double modal = 10000000.0;
        double bunga = 0.07;
        int durasi = 5;

        double hasil = calc.hitungBungaMajemuk(modal, bunga, durasi);

        System.out.println("Kalkulasi Bunga Majemuk:");
        System.out.printf("Modal Awal  : Rp %,12.2f%n", modal);
        System.out.printf("Suku Bunga  : %.1f%%%n", bunga * 100);
        System.out.printf("Durasi      : %d Tahun%n", durasi);
        System.out.printf("Hasil Akhir : Rp %,12.2f%n", hasil);

        System.out.println("\nPerintah untuk generate HTML JavaDoc:");
        System.out.println("javadoc -d docs/ -sourcepath src/ -subpackages com.perusahaan");
    }
}

/**
 * Class KalkulatorFinansial menyediakan operasi kalkulasi bunga dan nilai masa depan uang.
 *
 * @author Tim Finansial
 * @version 2.4.0
 * @since 2024
 */
class KalkulatorFinansial {

    /**
     * Menghitung nilai akhir investasi berdasarkan bunga majemuk.
     *
     * @param pokokInvestasi jumlah modal awal (harus lebih besar dari 0)
     * @param sukuBungaTahunan persentase bunga per tahun (misal 0.08 untuk 8%)
     * @param tahun periode durasi investasi dalam satuan tahun
     * @return total akumulasi nilai investasi di masa depan
     * @throws IllegalArgumentException jika pokok investasi bernilai negatif
     */
    public double hitungBungaMajemuk(double pokokInvestasi, double sukuBungaTahunan, int tahun) {
        if (pokokInvestasi < 0) {
            throw new IllegalArgumentException("Modal pokok tidak boleh negatif!");
        }
        return pokokInvestasi * Math.pow(1.0 + sukuBungaTahunan, tahun);
    }
}
