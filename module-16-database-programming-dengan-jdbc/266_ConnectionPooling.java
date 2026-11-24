// Mendemonstrasikan konsep arsitektur Connection Pooling untuk mendaur ulang koneksi database.
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class ConnectionPooling {
    public static void main(String[] args) {
        System.out.println("=== 266. Arsitektur Database Connection Pooling ===");

        // Inisialisasi pool koneksi dengan kapasitas 3 koneksi aktif
        SederhanaConnectionPool pool = new SederhanaConnectionPool(3);

        System.out.println("Pool berhasil dibuat dengan ukuran 3 koneksi.\n");

        // Mensimulasikan peminjaman koneksi oleh beberapa worker thread
        Runnable tugasKlien = () -> {
            String namaThread = Thread.currentThread().getName();
            KoneksiDatabaseSimulasi conn = null;
            try {
                System.out.println("[" + namaThread + "] Menunggu koneksi dari pool...");
                conn = pool.pinjamKoneksi(2, TimeUnit.SECONDS);

                if (conn != null) {
                    System.out.println("[" + namaThread + "] Mendapat " + conn + ". Menjalankan kueri...");
                    Thread.sleep(150); // Mensimulasikan eksekusi kueri
                    System.out.println("[" + namaThread + "] Kueri selesai. Mengembalikan koneksi.");
                } else {
                    System.out.println("[" + namaThread + "] TIMEOUT: Tidak ada koneksi yang tersedia saat ini.");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                if (conn != null) {
                    pool.kembalikanKoneksi(conn);
                }
            }
        };

        // Menjalankan 4 thread secara bersamaan untuk menunjukkan efisiensi antrean pool
        Thread t1 = new Thread(tugasKlien, "Worker-1");
        Thread t2 = new Thread(tugasKlien, "Worker-2");
        Thread t3 = new Thread(tugasKlien, "Worker-3");
        Thread t4 = new Thread(tugasKlien, "Worker-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nSeluruh transaksi selesai. Status koneksi pool siap digunakan kembali.");
    }
}

// Representasi koneksi database yang mahal untuk dibuat berulang kali
class KoneksiDatabaseSimulasi {
    private final int id;
    public KoneksiDatabaseSimulasi(int id) { this.id = id; }
    @Override public String toString() { return "KoneksiDb#" + id; }
}

// Implementasi connection pool thread-safe sederhana
class SederhanaConnectionPool {
    private final BlockingQueue<KoneksiDatabaseSimulasi> antreanPool;

    public SederhanaConnectionPool(int ukuranPool) {
        this.antreanPool = new LinkedBlockingQueue<>(ukuranPool);
        for (int i = 1; i <= ukuranPool; i++) {
            antreanPool.offer(new KoneksiDatabaseSimulasi(i));
        }
    }

    public KoneksiDatabaseSimulasi pinjamKoneksi(long timeout, TimeUnit unit) throws InterruptedException {
        return antreanPool.poll(timeout, unit);
    }

    public void kembalikanKoneksi(KoneksiDatabaseSimulasi conn) {
        if (conn != null) {
            antreanPool.offer(conn);
        }
    }
}
