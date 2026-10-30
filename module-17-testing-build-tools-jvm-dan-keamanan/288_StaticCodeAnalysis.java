// Mendemonstrasikan konsep analisis kode statis (Static Code Analysis) untuk pencegahan bug dan deteksi code smell.
import java.util.ArrayList;
import java.util.List;

class StaticCodeAnalysis {
    public static void main(String[] args) {
        System.out.println("=== 288. Analisis Kode Statis (Static Code Analysis) ===");

        // Menginspeksi simulasi kode sumber program untuk mendeteksi potensi cacat kode
        PengujiKodeStatis linter = new PengujiKodeStatis();

        List<String> barisKode = List.of(
            "int hasil = 10 / 0;",
            "String sandiRahasia = \"admin123\";",
            "System.out.println(\"Data diproses\");",
            "catch (Exception e) { }",
            "if (nama == null) { return; }"
        );

        System.out.println("Menjalankan linter statis pada potongan kode:\n");
        linter.inspeksi(barisKode);

        System.out.println("\nAlat Analisis Kode Statis Populer di Industri Java:");
        System.out.println("1. SonarQube  : Deteksi Vulnerability, Code Smells, dan Technical Debt.");
        System.out.println("2. SpotBugs   : Menemukan potensi bug melalui analisis bytecode.");
        System.out.println("3. Checkstyle : Menegakkan standardisasi gaya penulisan kode tim.");
        System.out.println("4. PMD        : Menemukan kode mati (dead code) dan inefisiensi alokasi objek.");
    }
}

class TemuanCacatKode {
    final String aturan;
    final String tingkatKeparahan;
    final String pesan;
    final String cuplikan;

    public TemuanCacatKode(String aturan, String tingkatKeparahan, String pesan, String cuplikan) {
        this.aturan = aturan;
        this.tingkatKeparahan = tingkatKeparahan;
        this.pesan = pesan;
        this.cuplikan = cuplikan;
    }
}

class PengujiKodeStatis {
    public void inspeksi(List<String> barisList) {
        List<TemuanCacatKode> hasil = new ArrayList<>();

        for (String baris : barisList) {
            if (baris.contains("/ 0")) {
                hasil.add(new TemuanCacatKode("ARITHMETIC_FAULT", "BLOCKER", "Deteksi pembagian dengan angka nol yang pasti memicu ArithmeticException.", baris));
            }
            if (baris.contains("sandiRahasia") || baris.contains("password =")) {
                hasil.add(new TemuanCacatKode("SECURITY_CREDENTIAL", "CRITICAL", "Hardcoded credential terdeteksi! Gunakan Environment Variable atau Secret Manager.", baris));
            }
            if (baris.contains("catch (Exception e) { }")) {
                hasil.add(new TemuanCacatKode("EMPTY_CATCH_BLOCK", "MAJOR", "Empty catch block: Exception ditelan tanpa penanganan atau pencatatan log.", baris));
            }
        }

        System.out.printf("Ditemukan %d masalah kode selama analisis statis:%n", hasil.size());
        for (TemuanCacatKode t : hasil) {
            System.out.printf("  [%s] Rule: %-20s | Pesan: %s%n       Kode: %s%n",
                    t.tingkatKeparahan, t.aturan, t.pesan, t.cuplikan.trim());
        }
    }
}
