// Mendemonstrasikan penggunaan kata kunci throw untuk melempar exception secara eksplisit berdasarkan aturan bisnis.
class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("=== Pelemparan Exception dengan Keyword throw ===");

        try {
            validasiUsia(20); // Usia legal
            validasiUsia(14); // Usia di bawah batas, memicu throw
        } catch (IllegalArgumentException e) {
            System.out.println("-> Berhasil menangkap throw exception: " + e.getMessage());
        }
    }

    static void validasiUsia(int usia) {
        System.out.println("Memeriksa usia pendaftar: " + usia + " tahun...");
        if (usia < 17) {
            // Melempar exception baru secara eksplisit
            throw new IllegalArgumentException("Usia minimal pendaftar SIM adalah 17 tahun!");
        }
        System.out.println("Status: Memenuhi syarat legal.");
    }
}
