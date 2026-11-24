// Mendemonstrasikan synchronized blocks untuk penguncian yang lebih terperinci (fine-grained locking).
class SynchronizedBlocks {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Synchronized Blocks (Fine-Grained Locking) ===");

        KotakUang bank = new KotakUang();

        Thread nasabah1 = new Thread(() -> bank.setor(50000));
        Thread nasabah2 = new Thread(() -> bank.setor(75000));

        nasabah1.start();
        nasabah2.start();
        nasabah1.join();
        nasabah2.join();

        System.out.println("Saldo Akhir Bank: Rp " + bank.getSaldo());
    }
}

class KotakUang {
    private double saldo = 0;
    // Objek pengunci khusus (mutex lock)
    private final Object lockKunci = new Object();

    void setor(double nominal) {
        // Hanya bagian yang memodifikasi saldo yang dikunci, bagian persiapan lain tetap berjalan paralel
        synchronized (lockKunci) {
            saldo += nominal;
            System.out.println(Thread.currentThread().getName() + " menyetor: Rp " + nominal);
        }
    }

    double getSaldo() {
        synchronized (lockKunci) {
            return saldo;
        }
    }
}
