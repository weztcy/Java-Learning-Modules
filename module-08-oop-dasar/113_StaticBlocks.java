// Mendemonstrasikan static initialization blocks yang dieksekusi satu kali saat class pertama kali dimuat.
class StaticBlocks {
    public static void main(String[] args) {
        System.out.println("=== Static Initialization Block ===");
        System.out.println("Titik masuk method main...");

        // Mengakses class KonfigurasiSistem
        System.out.println("Nama Sistem : " + KonfigurasiSistem.NAMA_SISTEM);
        System.out.println("Versi API   : " + KonfigurasiSistem.VERSI_API);
    }
}

class KonfigurasiSistem {
    static String NAMA_SISTEM;
    static int VERSI_API;

    // Static block berjalan otomatis satu kali saat class pertama kali dimuat JVM ke memori
    static {
        System.out.println("-> [Static Block] Menginisialisasi konfigurasi sistem dari lingkungan...");
        NAMA_SISTEM = "Sistem Enterprise Java";
        VERSI_API = 3;
    }
}
