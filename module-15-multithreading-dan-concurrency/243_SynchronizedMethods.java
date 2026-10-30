// Mendemonstrasikan synchronized methods untuk mencegah kondisi balapan (Race Condition) pada data bersama.
class SynchronizedMethods {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Synchronized Methods (Thread-Safe Counter) ===");

        PencacahSinkron counter = new PencacahSinkron();

        // Membuat 2 thread yang menambah counter masing-masing 1000 kali secara simultan
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.tambah();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.tambah();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Total akhir counter: " + counter.getNilai() + " (Ekspektasi tepat 2000)");
    }
}

class PencacahSinkron {
    private int nilai = 0;

    // Kata kunci synchronized mengunci objek (intrinsic lock) sehingga hanya 1 thread yang boleh masuk pada satu waktu
    public synchronized void tambah() {
        nilai++;
    }

    public synchronized int getNilai() {
        return nilai;
    }
}
