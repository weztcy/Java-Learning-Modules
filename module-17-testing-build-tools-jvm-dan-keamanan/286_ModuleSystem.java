// Mendemonstrasikan arsitektur Java Platform Module System (JPMS / Project Jigsaw) dan dekonstruksi module-info.java.
class ModuleSystem {
    public static void main(String[] args) {
        System.out.println("=== 286. Java Platform Module System (JPMS / Project Jigsaw) ===");

        System.out.println("1. Contoh Deklarasi Berkas 'module-info.java':");
        String deskripsiModul = """
                module com.perusahaan.layanan.keuangan {
                    // Modul dependensi yang dibutuhkan secara eksplisit
                    requires java.sql;
                    requires java.net.http;
                    requires transitive com.perusahaan.inti;

                    // Package publik yang diekspor untuk dapat diakses modul luar
                    exports com.perusahaan.layanan.keuangan.api;
                    exports com.perusahaan.layanan.keuangan.model;

                    // Mengizinkan refleksi runtime hanya untuk framework tertentu
                    opens com.perusahaan.layanan.keuangan.model to com.fasterxml.jackson.databind;
                }
                """;
        System.out.println(deskripsiModul);

        System.out.println("2. Inspeksi Modul Runtime Saat Ini:");
        Module modulSekarang = ModuleSystem.class.getModule();
        System.out.println("   Nama Modul        : " + (modulSekarang.getName() != null ? modulSekarang.getName() : "Unnamed Module"));
        System.out.println("   Apakah Modul Bernama: " + modulSekarang.isNamed());

        System.out.println("\nManfaat JPMS: Enkapsulasi kuat tingkat package, modularitas JVM, dan ukuran runtime minimal (jlink).");
    }
}
