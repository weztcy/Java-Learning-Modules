// Mendemonstrasikan java.util.concurrent.Callable: thread yang dapat mengembalikan nilai hasil dan melempar checked exception.
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableInterface {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Interface Callable<V> (Dengan Return Value) ===");

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Callable mengembalikan hasil komputasi (Integer)
        Callable<Integer> tugasHitung = () -> {
            System.out.println("-> Pekerja sedang menghitung jumlah transaksi...");
            Thread.sleep(200);
            return 450 + 550; // Mengembalikan nilai
        };

        // Mengirim tugas Callable ke ExecutorService
        Future<Integer> hasilMasaDepan = executor.submit(tugasHitung);

        // Mengambil hasil dengan .get()
        int total = hasilMasaDepan.get();
        System.out.println("Hasil yang diterima dari Callable: " + total);

        executor.shutdown();
    }
}
