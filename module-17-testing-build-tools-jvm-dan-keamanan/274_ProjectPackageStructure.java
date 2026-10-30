// Mendemonstrasikan konvensi penataan struktur package profesional dalam proyek Java berskala menengah-besar.
class ProjectPackageStructure {
    public static void main(String[] args) {
        System.out.println("=== 274. Konvensi Struktur Package Proyek Java ===");

        System.out.println("Standar Domain Inversi: com.namaperusahaan.namaproyek\n");

        String[] struktur = {
            "com.tokoonline.ecommerce",
            "com.tokoonline.ecommerce.config          // Konfigurasi aplikasi, keamanan, dan database",
            "com.tokoonline.ecommerce.controller      // Lapisan presentasi HTTP REST Endpoint",
            "com.tokoonline.ecommerce.dto             // Data Transfer Object untuk request/response",
            "com.tokoonline.ecommerce.entity          // Entitas basis data / JPA domain models",
            "com.tokoonline.ecommerce.exception       // Global exception handler dan custom exceptions",
            "com.tokoonline.ecommerce.repository      // Lapisan akses data (DAO / JPA Repository)",
            "com.tokoonline.ecommerce.service         // Logika bisnis utama sistem",
            "com.tokoonline.ecommerce.service.impl    // Implementasi konkret logika bisnis",
            "com.tokoonline.ecommerce.util            // Utility helper kelas (tanggal, format, kalkulasi)"
        };

        for (String baris : struktur) {
            System.out.println("   ├── " + baris);
        }

        System.out.println("\nManfaat Pembagian Package:");
        System.out.println("1. Separation of Concerns (Pemisahan tanggung jawab yang tegas)");
        System.out.println("2. Pengendalian visibilitas (package-private modifier)");
        System.out.println("3. Kemudahan navigasi tim dan pemeliharaan jangka panjang (*maintainability*)");
    }
}
