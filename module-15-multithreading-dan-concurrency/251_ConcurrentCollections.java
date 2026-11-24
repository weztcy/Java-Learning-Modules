// Mendemonstrasikan Concurrent Collections (ConcurrentHashMap & CopyOnWriteArrayList) untuk akses thread-safe cepat.
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Map;

class ConcurrentCollections {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Concurrent Collections (Thread-Safe Modern) ===");

        // ConcurrentHashMap membagi penguncian per bucket sehingga tidak mengunci seluruh tabel
        Map<String, Integer> sesiAktif = new ConcurrentHashMap<>();
        List<String> daftarLog = new CopyOnWriteArrayList<>();

        Thread t1 = new Thread(() -> {
            sesiAktif.put("Sesi-101", 1);
            daftarLog.add("User 1 login");
        });

        Thread t2 = new Thread(() -> {
            sesiAktif.put("Sesi-102", 2);
            daftarLog.add("User 2 login");
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Jumlah sesi aktif concurrent: " + sesiAktif.size());
        System.out.println("Log aktivitas CopyOnWrite  : " + daftarLog);
    }
}
