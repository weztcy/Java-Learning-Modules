// Mendemonstrasikan penggunaan metode asersi lengkap untuk memvalidasi ekspektasi vs kenyataan program.
class JUnitAssertions {
    public static void main(String[] args) {
        System.out.println("=== 268. Rangkaian Asersi Standar Unit Testing ===");

        System.out.println("1. Menguji assertEquals (nilai primitif & objek):");
        EduAssertions.assertEquals(100, 50 * 2, "Perhitungan kelipatan harus 100");
        EduAssertions.assertEquals("Java", "Java", "Nama bahasa harus cocok");

        System.out.println("2. Menguji assertTrue & assertFalse:");
        EduAssertions.assertTrue(15 > 10, "Kondisi 15 > 10 harus bernilai true");
        EduAssertions.assertFalse("admin".isEmpty(), "String tidak boleh kosong");

        System.out.println("3. Menguji assertNull & assertNotNull:");
        String nama = "Programmer Java";
        String referensiKosong = null;
        EduAssertions.assertNotNull(nama, "Variabel nama tidak boleh bernilai null");
        EduAssertions.assertNull(referensiKosong, "Referensi kosong harus null");

        System.out.println("4. Menguji assertThrows (validasi exception yang diharapkan):");
        EduAssertions.assertThrows(ArithmeticException.class, () -> {
            int gagal = 10 / 0;
        }, "Pembagian angka dengan nol wajib melempar ArithmeticException");

        System.out.println("\nSeluruh 6 skenario asersi BERHASIL lolos verifikasi!");
    }
}

// Simulasi mekanisme Assertions standar
class EduAssertions {
    public static void assertEquals(Object expected, Object actual, String pesan) {
        if (!expected.equals(actual)) {
            throw new AssertionError("GAGAL: " + pesan + " [Expected: " + expected + ", Actual: " + actual + "]");
        }
        System.out.println("   [ASSERT OK] assertEquals: " + expected + " == " + actual);
    }

    public static void assertTrue(boolean kondisi, String pesan) {
        if (!kondisi) throw new AssertionError("GAGAL: " + pesan + " [Diharapkan: true]");
        System.out.println("   [ASSERT OK] assertTrue: kondisi terpenuhi");
    }

    public static void assertFalse(boolean kondisi, String pesan) {
        if (kondisi) throw new AssertionError("GAGAL: " + pesan + " [Diharapkan: false]");
        System.out.println("   [ASSERT OK] assertFalse: kondisi terpenuhi");
    }

    public static void assertNotNull(Object obj, String pesan) {
        if (obj == null) throw new AssertionError("GAGAL: " + pesan + " [Objek bernilai null]");
        System.out.println("   [ASSERT OK] assertNotNull: objek valid");
    }

    public static void assertNull(Object obj, String pesan) {
        if (obj != null) throw new AssertionError("GAGAL: " + pesan + " [Objek bukan null]");
        System.out.println("   [ASSERT OK] assertNull: objek bernilai null");
    }

    public static void assertThrows(Class<? extends Throwable> expectedType, Runnable executable, String pesan) {
        try {
            executable.run();
            throw new AssertionError("GAGAL: " + pesan + " [Tidak melempar exception]");
        } catch (Throwable t) {
            if (expectedType.isInstance(t)) {
                System.out.println("   [ASSERT OK] assertThrows: Melempar " + t.getClass().getSimpleName() + " sesuai harapan.");
            } else {
                throw new AssertionError("GAGAL: Exception yang dilempar berbeda: " + t.getClass().getSimpleName());
            }
        }
    }
}
