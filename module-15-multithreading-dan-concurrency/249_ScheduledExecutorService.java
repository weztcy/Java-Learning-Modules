// Mendemonstrasikan penjadwalan eksekusi tugas periodik dan bertunda menggunakan ScheduledExecutorService.
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== ScheduledExecutorService (Penjadwalan Tugas) ===");

        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        System.out.println("Menjadwalkan tugas untuk dieksekusi setelah penundaan 300ms...");

        // Menjadwalkan tugas satu kali dengan delay 300 milidetik
        scheduler.schedule(() -> {
            System.out.println("-> [TUGAS TERJADWAL]: Mengirim ping detak jantung (heartbeat) sistem.");
        }, 300, TimeUnit.MILLISECONDS);

        // Menunggu eksekusi tugas
        Thread.sleep(600);

        scheduler.shutdown();
        System.out.println("Scheduler ditutup dengan aman.");
    }
}
