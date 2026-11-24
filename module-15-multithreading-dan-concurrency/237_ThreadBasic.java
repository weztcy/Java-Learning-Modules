// Mendemonstrasikan pembuatan thread dasar dengan mewarisi class java.lang.Thread.
class ThreadBasic {
    public static void main(String[] args) {
        System.out.println("=== Pembuatan Thread Dasar (extends Thread) ===");

        // Membuat instance worker thread
        PekerjaThread thread1 = new PekerjaThread("Worker-A");
        PekerjaThread thread2 = new PekerjaThread("Worker-B");

        // Memulai thread baru dengan start() yang memicu eksekusi method run() secara asynchronous
        thread1.start();
        thread2.start();

        System.out.println("Method main() selesai dieksekusi oleh thread: " + Thread.currentThread().getName());
    }
}

class PekerjaThread extends Thread {
    PekerjaThread(String nama) {
        super(nama);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " mengeksekusi tugas langkah ke-" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
