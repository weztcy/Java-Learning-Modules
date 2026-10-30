// Program praktis menghitung nilai akhir mahasiswa berdasarkan bobot tugas, UTS, dan UAS.
class GradeCalculator {
    public static void main(String[] args) {
        double nilaiTugas = 85.0;
        double nilaiUTS = 78.0;
        double nilaiUAS = 90.0;

        // Bobot: Tugas 20%, UTS 35%, UAS 45%
        double nilaiAkhir = (nilaiTugas * 0.20) + (nilaiUTS * 0.35) + (nilaiUAS * 0.45);

        // Menentukan indeks huruf menggunakan seleksi kondisi
        char grade;
        String status;

        if (nilaiAkhir >= 80.0) {
            grade = 'A';
            status = "LULUS DENGAN PUJIAN";
        } else if (nilaiAkhir >= 70.0) {
            grade = 'B';
            status = "LULUS BAIK";
        } else if (nilaiAkhir >= 60.0) {
            grade = 'C';
            status = "LULUS CUKUP";
        } else if (nilaiAkhir >= 50.0) {
            grade = 'D';
            status = "PERLU PERBAIKAN";
        } else {
            grade = 'E';
            status = "MENGULANG";
        }

        System.out.println("=== Kalkulator Nilai Mahasiswa ===");
        System.out.printf("Tugas (20%%) : %.1f%n", nilaiTugas);
        System.out.printf("UTS   (35%%) : %.1f%n", nilaiUTS);
        System.out.printf("UAS   (45%%) : %.1f%n", nilaiUAS);
        System.out.printf("Nilai Akhir : %.2f%n", nilaiAkhir);
        System.out.println("Grade       : " + grade);
        System.out.println("Status      : " + status);
    }
}
