// Mendemonstrasikan arsitektur pengemasan Java Archive (JAR) dan peranan file MANIFEST.MF.
import java.util.LinkedHashMap;
import java.util.Map;

class JarPackaging {
    public static void main(String[] args) {
        System.out.println("=== 275. Pengemasan Aplikasi Java Archive (JAR) ===");

        // Representasi struktur MANIFEST.MF
        Map<String, String> manifest = new LinkedHashMap<>();
        manifest.put("Manifest-Version", "1.0");
        manifest.put("Created-By", "17.0.14 (Oracle Corporation)");
        manifest.put("Main-Class", "com.aplikasi.core.MainApp");
        manifest.put("Class-Path", "lib/database-driver.jar lib/json-parser.jar");

        System.out.println("1. Isi File META-INF/MANIFEST.MF:");
        for (Map.Entry<String, String> e : manifest.entrySet()) {
            System.out.printf("   %-16s: %s%n", e.getKey(), e.getValue());
        }

        System.out.println("\n2. Perintah Pembuatan JAR via Terminal:");
        System.out.println("   jar --create --file aplikasi-distribusi.jar --main-class com.aplikasi.core.MainApp -C bin/ .");

        System.out.println("\n3. Perintah Eksekusi Executable JAR:");
        System.out.println("   java -jar aplikasi-distribusi.jar");

        System.out.println("\nArsip JAR mengompresi ribuan class file dan resources ke dalam satu berkas terdistribusi.");
    }
}
