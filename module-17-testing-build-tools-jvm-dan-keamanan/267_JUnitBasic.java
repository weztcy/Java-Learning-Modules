// Mendemonstrasikan arsitektur dasar Unit Testing: Test Runner, anotasi pengujian, dan siklus pengujian.
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

class JUnitBasic {
    public static void main(String[] args) {
        System.out.println("=== 267. Konsep Dasar Unit Testing (JUnit Architecture) ===");

        // Menjalankan Test Runner reflektif pada test class
        MiniTestRunner.jalankanSemuaTest(KalkulatorTest.class);
    }
}

// Komponen logika bisnis yang diuji (Class Under Test)
class Kalkulator {
    public int tambah(int a, int b) { return a + b; }
    public int kali(int a, int b) { return a * b; }
    public int bagi(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Pembagi tidak boleh nol!");
        return a / b;
    }
}

// Anotasi pengujian unit standar
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BeforeEach {}

// Test Class yang menguji komponen Kalkulator
class KalkulatorTest {
    private Kalkulator kalkulator;

    @BeforeEach
    public void setup() {
        // Dieksekusi sebelum setiap method @Test untuk mengisolasi state
        kalkulator = new Kalkulator();
    }

    @Test
    public void testPenambahanSukses() {
        int hasil = kalkulator.tambah(10, 5);
        if (hasil != 15) throw new AssertionError("Harusnya 15, tetapi didapat: " + hasil);
    }

    @Test
    public void testPerkalianSukses() {
        int hasil = kalkulator.kali(4, 7);
        if (hasil != 28) throw new AssertionError("Harusnya 28, tetapi didapat: " + hasil);
    }

    @Test
    public void testPembagianValid() {
        int hasil = kalkulator.bagi(20, 4);
        if (hasil != 5) throw new AssertionError("Harusnya 5, tetapi didapat: " + hasil);
    }
}

// Test Runner ringan untuk memicu dan mencatat status eksekusi test
class MiniTestRunner {
    public static void jalankanSemuaTest(Class<?> testClass) {
        System.out.println("Memulai eksekusi test suite: " + testClass.getSimpleName());
        int total = 0, passed = 0, failed = 0;

        Method beforeEach = null;
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(BeforeEach.class)) {
                beforeEach = m;
                break;
            }
        }

        try {
            Object instance = testClass.getDeclaredConstructor().newInstance();
            for (Method m : testClass.getDeclaredMethods()) {
                if (m.isAnnotationPresent(Test.class)) {
                    total++;
                    try {
                        if (beforeEach != null) beforeEach.invoke(instance);
                        m.invoke(instance);
                        System.out.println("  [PASS] " + m.getName());
                        passed++;
                    } catch (Throwable t) {
                        System.out.println("  [FAIL] " + m.getName() + " -> " + t.getCause().getMessage());
                        failed++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------");
        System.out.printf("Hasil Pengujian: %d Total | %d Lolos | %d Gagal%n", total, passed, failed);
    }
}
