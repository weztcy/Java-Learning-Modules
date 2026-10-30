// Mendemonstrasikan pembuatan thread menggunakan java.lang.Runnable untuk fleksibilitas pewarisan class.
class RunnableInterface {
    public static void main(String[] args) {
        System.out.println("=== Pembuatan Thread dengan Runnable Interface ===");

        // Menggunakan Runnable memisahkan tugas (task) dari mekanisme eksekusi thread
        Runnable tugasDownload = () -> {
            String namaThread = Thread.currentThread().getName();
            System.out.println("[" + namaThread + "] Memulai pengunduhan file...");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("[" + namaThread + "] Pengunduhan file tuntas 100%.");
        };

        Thread t1 = new Thread(tugasDownload, "Downloader-1");
        Thread t2 = new Thread(tugasDownload, "Downloader-2");

        t1.start();
        t2.start();

        try {
            t1.join(); // Menunggu t1 selesai sebelum lanjut
            t2.join(); // Menunggu t2 selesai sebelum lanjut
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Semua proses download selesai.");
    }
}
