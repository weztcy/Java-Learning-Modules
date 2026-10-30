// Mendemonstrasikan manajemen thread pool berstandar industri menggunakan java.util.concurrent.ExecutorService.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ExecutorServiceDemo {
    public static void main(String[] args) {
        System.out.println("=== java.util.concurrent.ExecutorService ===");

        // Membuat thread pool dengan 3 pekerja aktif yang dapat dipakai ulang (reusable)
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            final int idTugas = i;
            pool.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Tugas " + idTugas + " dikerjakan oleh: " + threadName);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Menutup executor setelah semua tugas selesai
        pool.shutdown();
        try {
            pool.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Semua tugas pada ExecutorService tuntas.");
    }
}
