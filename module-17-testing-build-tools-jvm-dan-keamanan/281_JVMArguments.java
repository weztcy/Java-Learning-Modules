// Mendemonstrasikan konfigurasi parameter JVM (-Xms, -Xmx, flag GC) dan pembacaan System Properties (-D).
class JVMArguments {
    public static void main(String[] args) {
        System.out.println("=== 281. Manajemen Parameter & Argumen JVM ===");

        // Mengatur properti sistem dinamis jika belum ada dari terminal
        if (System.getProperty("app.environment") == null) {
            System.setProperty("app.environment", "production");
        }
        if (System.getProperty("app.max.workers") == null) {
            System.setProperty("app.max.workers", "16");
        }

        System.out.println("1. Pembacaan Parameter Sistem Kustom (-D):");
        System.out.println("   app.environment : " + System.getProperty("app.environment"));
        System.out.println("   app.max.workers : " + System.getProperty("app.max.workers"));

        System.out.println("\n2. Informasi Lingkungan JVM Bawaan:");
        System.out.println("   java.version    : " + System.getProperty("java.version"));
        System.out.println("   java.vendor     : " + System.getProperty("java.vendor"));
        System.out.println("   os.name         : " + System.getProperty("os.name"));
        System.out.println("   user.home       : " + System.getProperty("user.home"));

        System.out.println("\n3. Rekomendasi Flag JVM untuk Production:");
        System.out.println("   java -Xms2g -Xmx4g -XX:+UseG1GC -Dapp.environment=production -jar aplikasi.jar");
    }
}
