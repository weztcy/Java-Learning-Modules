// Mendemonstrasikan penggunaan variabel pencacah (counter) dan akumulator dalam perulangan.
class LoopCounter {
    public static void main(String[] args) {
        System.out.println("=== Penghitung Perulangan (Loop Counter) ===");

        int[] skorPeserta = {65, 80, 45, 90, 75, 55, 88, 72};
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int skor : skorPeserta) {
            if (skor >= 70) {
                jumlahLulus++; // Menaikkan counter kelulusan
            } else {
                jumlahTidakLulus++; // Menaikkan counter tidak lulus
            }
        }

        System.out.println("Total Peserta Ujian  : " + skorPeserta.length);
        System.out.println("Jumlah Peserta Lulus : " + jumlahLulus);
        System.out.println("Jumlah Tidak Lulus   : " + jumlahTidakLulus);
    }
}
