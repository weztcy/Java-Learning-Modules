// Program praktis memeriksa tahun kabisat berdasarkan aturan kalender Gregorius.
class LeapYearChecker {
    public static void main(String[] args) {
        int[] daftarTahun = {2000, 2020, 2024, 2026, 1900, 2100};

        System.out.println("=== Pemeriksaan Tahun Kabisat ===");
        System.out.println("Aturan: Habis dibagi 400 ATAU (Habis dibagi 4 dan TIDAK habis dibagi 100)");

        for (int tahun : daftarTahun) {
            // Evaluasi kondisi kabisat
            boolean isKabisat = (tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0);

            if (isKabisat) {
                System.out.println("Tahun " + tahun + " : KABISAT (366 hari, Februari 29 hari)");
            } else {
                System.out.println("Tahun " + tahun + " : BUKAN Kabisat (365 hari, Februari 28 hari)");
            }
        }
    }
}
