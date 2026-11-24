// Mendemonstrasikan percabangan bersarang (nested if) di dalam blok kondisi lainnya.
class NestedIf {
    public static void main(String[] args) {
        int usia = 20;
        boolean memilikiSIM = true;

        System.out.println("=== Percabangan Bersarang (Nested if) ===");

        // Kondisi luar memeriksa batas usia minimum
        if (usia >= 17) {
            System.out.println("Kriteria Usia: Memenuhi syarat legal berkendara (>=17 tahun).");

            // Kondisi dalam memeriksa dokumen izin berkendara
            if (memilikiSIM) {
                System.out.println("Kriteria Dokumen: Memiliki SIM yang sah. Diizinkan mengemudi.");
            } else {
                System.out.println("Kriteria Dokumen: Belum memiliki SIM. Tidak diizinkan mengemudi.");
            }
        } else {
            System.out.println("Kriteria Usia: Belum cukup umur untuk mengemudi.");
        }
    }
}
