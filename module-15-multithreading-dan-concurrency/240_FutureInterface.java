// Mendemonstrasikan penggunaan Future untuk memantau status eksekusi tugas asynchronous (isDone, get, cancel).
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FutureInterface {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Interface Future<V> (Monitoring Asynchronous) ===");

        ExecutorService pool = Executors.newCachedThreadPool();

        Future<String> janjiTugas = pool.submit(() -> {
            Thread.sleep(300);
            return "Laporan Analisis Finansial Siap";
        });

        // Memeriksa status penyelesaian sebelum mengambil hasil
        System.out.println("Apakah tugas sudah selesai saat awal? " + janjiTugas.isDone());

        // Menunggu dan mengambil hasil komputasi
        String hasil = janjiTugas.get();
        System.out.println("Status selesai sekarang? " + janjiTugas.isDone());
        System.out.println("Hasil: " + hasil);

        pool.shutdown();
    }
}
