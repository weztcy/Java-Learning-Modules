// Mendemonstrasikan pengujian terparameterisasi untuk menguji berbagai variasi input secara efisien.
import java.util.Arrays;
import java.util.List;

class ParameterizedTests {
    public static void main(String[] args) {
        System.out.println("=== 269. Pengujian Terparameterisasi (Parameterized Tests) ===");

        PemeriksaPalindrom pemeriksa = new PemeriksaPalindrom();

        // Kumpulan data uji @ValueSource (kata yang seharusnya bernilai palindrom)
        List<String> kasusKataPalindrom = Arrays.asList("katak", "radar", "kasur rusak", "level", "kodok");
        System.out.println("--- Skenario 1: Dataset Valid Palindrom (@ValueSource) ---");
        for (String kata : kasusKataPalindrom) {
            boolean hasil = pemeriksa.isPalindrom(kata);
            System.out.printf("  Input: '%-12s' -> Is Palindrom: %-5b [PASS]%n", kata, hasil);
            if (!hasil) throw new AssertionError("Kata '" + kata + "' harusnya palindrom!");
        }

        // Kumpulan data uji @CsvSource (Input angka, Ekspektasi status prima)
        System.out.println("\n--- Skenario 2: Dataset Angka Prima (@CsvSource) ---");
        Object[][] dataPrimaCsv = {
            {2, true},
            {3, true},
            {4, false},
            {17, true},
            {20, false},
            {29, true}
        };

        PemeriksaBilangan PrimaChecker = new PemeriksaBilangan();
        for (Object[] baris : dataPrimaCsv) {
            int angka = (Integer) baris[0];
            boolean expected = (Boolean) baris[1];
            boolean actual = PrimaChecker.isPrima(angka);
            System.out.printf("  Angka: %-3d | Ekspektasi: %-5b | Aktual: %-5b [PASS]%n", angka, expected, actual);
            if (expected != actual) throw new AssertionError("Gagal pada angka: " + angka);
        }

        System.out.println("\nSeluruh pengujian terparameterisasi berhasil 100% tanpa kegagalan.");
    }
}

class PemeriksaPalindrom {
    public boolean isPalindrom(String teks) {
        String bersih = teks.replaceAll("\\s+", "").toLowerCase();
        return new StringBuilder(bersih).reverse().toString().equals(bersih);
    }
}

class PemeriksaBilangan {
    public boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
