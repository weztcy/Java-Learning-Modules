// Mendemonstrasikan blok finally yang dijamin selalu dieksekusi untuk pembersihan (cleanup) sumber daya.
class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("=== Blok finally ===");

        ujiKoneksi(true);  // Skenario error
        System.out.println("---------------------------------");
        ujiKoneksi(false); // Skenario sukses
    }

    static void ujiKoneksi(boolean simulasiError) {
        System.out.println("1. [TRY] Membuka koneksi simulasi...");
        try {
            if (simulasiError) {
                System.out.println("2. [TRY] Terjadi gangguan jaringan mendadak!");
                throw new RuntimeException("Koneksi jaringan terputus.");
            }
            System.out.println("2. [TRY] Operasi pertukaran data berhasil tuntas.");
        } catch (RuntimeException e) {
            System.out.println("3. [CATCH] Menangani error: " + e.getMessage());
        } finally {
            // Blok ini selalu dieksekusi apapun yang terjadi (sukses atau gagal)
            System.out.println("4. [FINALLY] Membersihkan sumber daya dan menutup koneksi!");
        }
    }
}
