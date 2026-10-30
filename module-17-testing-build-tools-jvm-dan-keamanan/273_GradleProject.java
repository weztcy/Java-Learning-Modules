// Mendemonstrasikan pemahaman sistem build modern Gradle: DSL skrip, pengelolaan task, dan perbandingan performa build cache.
import java.util.ArrayList;
import java.util.List;

class GradleProject {
    public static void main(String[] args) {
        System.out.println("=== 273. Manajemen Proyek & Build Automation dengan Gradle ===");

        GradleEngine gradle = new GradleEngine("AplikasiKeren");

        // Menambahkan task terstruktur dalam skrip build.gradle
        gradle.daftarkanTask("clean", "Membersihkan direktori build/");
        gradle.daftarkanTask("compileJava", "Mengompilasi source code Java ke bytecode class");
        gradle.daftarkanTask("processResources", "Menyalin file konfigurasi dan aset");
        gradle.daftarkanTask("classes", "Menghubungkan kompilasi dan resources");
        gradle.daftarkanTask("test", "Menjalankan seluruh unit test dengan report HTML");
        gradle.daftarkanTask("jar", "Membungkus class file ke format .jar");
        gradle.daftarkanTask("build", "Task agregator perakitan menyeluruh");

        System.out.println("1. Menjalankan 'gradle build':");
        gradle.eksekusiBuild();

        System.out.println("\n2. Keunggulan Utama Gradle:");
        System.out.println("   - Incremental Build: Hanya mengompilasi file yang dimodifikasi.");
        System.out.println("   - Build Cache: Menggunakan kembali artefak build antar mesin/developer.");
        System.out.println("   - Gradle Daemon: Proses latar belakang yang membuat eksekusi jauh lebih cepat.");
    }
}

class GradleEngine {
    private final String namaProyek;
    private final List<String[]> daftarTask = new ArrayList<>();

    public GradleEngine(String namaProyek) { this.namaProyek = namaProyek; }

    public void daftarkanTask(String nama, String deskripsi) {
        daftarTask.add(new String[]{nama, deskripsi});
    }

    public void eksekusiBuild() {
        for (String[] t : daftarTask) {
            System.out.printf("   > Task :%-18s UP-TO-DATE (%s)%n", t[0], t[1]);
        }
        System.out.println("   BUILD SUCCESSFUL in 450ms");
    }
}
