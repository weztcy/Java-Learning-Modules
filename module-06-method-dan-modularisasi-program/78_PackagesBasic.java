// Mendemonstrasikan konsep pengorganisasian package dan modularisasi kode di Java.
class PackagesBasic {
    public static void main(String[] args) {
        System.out.println("=== Package dan Modularisasi Kode ===");
        System.out.println("1. Package adalah namespace yang mengelompokkan class dan interface terkait.");
        System.out.println("2. Konvensi penamaan package menggunakan huruf kecil terbalik dari domain:");
        System.out.println("   Contoh: com.perusahaan.proyek.layanan");
        System.out.println("3. Perintah 'import' digunakan untuk mengimpor class dari package lain.");
        
        // Memanfaatkan class bawaan dari package java.time dan java.util
        java.time.LocalDate tanggalHariIni = java.time.LocalDate.now();
        System.out.println("Tanggal saat ini (dari package java.time): " + tanggalHariIni);
    }
}
