// Program praktis menghitung total penjumlahan dan nilai rata-rata dari kumpulan angka dalam array.
class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("=== Penjumlahan dan Rata-Rata Array ===");

        int[] nilaiSiswa = {80, 85, 90, 75, 95, 70, 88};
        int total = 0;

        // Mengakumulasi seluruh nilai
        for (int nilai : nilaiSiswa) {
            total += nilai;
        }

        // Menghitung rata-rata dengan konversi double agar presisi
        double rataRata = (double) total / nilaiSiswa.length;

        System.out.println("Jumlah Data Siswa : " + nilaiSiswa.length);
        System.out.println("Total Nilai       : " + total);
        System.out.printf("Nilai Rata-Rata   : %.2f%n", rataRata);
    }
}
