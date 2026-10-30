// Mendemonstrasikan pemisahan teks menjadi array kata dengan .split() dan penggabungan dengan String.join().
class StringSplitting {
    public static void main(String[] args) {
        System.out.println("=== Pemisahan dan Penggabungan String ===");

        String dataKaryawan = "K-101,Ahmad Firdaus,Finance,Bandung";

        // split() memecah string berdasarkan delimiter koma
        String[] elemen = dataKaryawan.split(",");

        System.out.println("Daftar Elemen Hasil Split:");
        for (int i = 0; i < elemen.length; i++) {
            System.out.println("   Bagian [" + i + "]: " + elemen[i]);
        }

        // String.join() menggabungkan array kembali dengan pemisah baru
        String dataTersambung = String.join(" | ", elemen);
        System.out.println("\nHasil String.join(' | '): " + dataTersambung);
    }
}
