// Mendemonstrasikan pemahaman arsitektur build tool Apache Maven, Project Object Model (pom.xml), dan fase build lifecycle.
class MavenProject {
    public static void main(String[] args) {
        System.out.println("=== 272. Arsitektur Proyek Apache Maven & POM ===");

        // Struktur model POM (Project Object Model)
        MavenPOM pom = new MavenPOM("com.belajar.java", "aplikasi-penjualan", "1.0.0");
        pom.tambahDependensi("org.junit.jupiter", "junit-jupiter-api", "5.10.0", "test");
        pom.tambahDependensi("com.google.code.gson", "gson", "2.10.1", "compile");

        System.out.println("1. Identitas Proyek Maven (GAV Coordinates):");
        System.out.println("   groupId    : " + pom.getGroupId());
        System.out.println("   artifactId : " + pom.getArtifactId());
        System.out.println("   version    : " + pom.getVersion());

        System.out.println("\n2. Dependensi Proyek Terdaftar:");
        for (String dep : pom.getDaftarDependensi()) {
            System.out.println("   * " + dep);
        }

        System.out.println("\n3. Simulasi Eksekusi Maven Standard Lifecycle:");
        String[] lifecycles = {"validate", "compile", "test", "package", "verify", "install", "deploy"};
        for (String phase : lifecycles) {
            System.out.printf("   [INFO] --- maven-lifecycle-phase: %-10s -> [SUCCESS]%n", phase);
        }

        System.out.println("\nArsitektur Maven menjamin standardisasi struktur direktori src/main/java dan dependensi otomatis.");
    }
}

class MavenPOM {
    private final String groupId;
    private final String artifactId;
    private final String version;
    private final java.util.List<String> dependensi = new java.util.ArrayList<>();

    public MavenPOM(String groupId, String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }

    public void tambahDependensi(String g, String a, String v, String scope) {
        dependensi.add(String.format("%s:%s:%s (scope: %s)", g, a, v, scope));
    }

    public String getGroupId() { return groupId; }
    public String getArtifactId() { return artifactId; }
    public String getVersion() { return version; }
    public java.util.List<String> getDaftarDependensi() { return dependensi; }
}
