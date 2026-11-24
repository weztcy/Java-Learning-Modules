// Mendemonstrasikan Atomic Variables (java.util.concurrent.atomic.AtomicInteger) yang berkinerja tinggi tanpa lock (Lock-Free CAS).
import java.util.concurrent.atomic.AtomicInteger;

class AtomicVariables {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Atomic Variables (AtomicInteger: Lock-Free) ===");

        // Menggunakan instruksi CPU Compare-And-Swap (CAS)
        AtomicInteger counterAtomik = new AtomicInteger(0);

        Thread[] paraPekerja = new Thread[5];
        for (int i = 0; i < paraPekerja.length; i++) {
            paraPekerja[i] = new Thread(() -> {
                for (int j = 0; j < 500; j++) {
                    counterAtomik.incrementAndGet(); // Operasi atomik aman dari race condition
                }
            });
            paraPekerja[i].start();
        }

        for (Thread p : paraPekerja) {
            p.join();
        }

        System.out.println("Total akhir Counter Atomik: " + counterAtomik.get() + " (Ekspektasi: 2500)");
    }
}
