// Mendemonstrasikan pencetakan teks terformat menggunakan format specifier.
class SystemOutPrintf {
    public static void main(String[] args) {
        String nama = "Budi";
        int umur = 20;
        double ipk = 3.85;

        // %s untuk String, %d untuk integer desimal, %.2f untuk angka desimal dengan 2 angka di belakang koma, %n untuk newline
        System.out.printf("Nama Mahasiswa : %s%n", nama);
        System.out.printf("Umur           : %d tahun%n", umur);
        System.out.printf("Indeks Prestasi: %.2f%n", ipk);
    }
}
