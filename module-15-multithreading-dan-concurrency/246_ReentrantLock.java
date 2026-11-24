// Mendemonstrasikan java.util.concurrent.locks.ReentrantLock dengan pola lock() dan unlock() dalam blok finally.
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== java.util.concurrent.locks.ReentrantLock ===");

        AkunLock akun = new AkunLock();

        Thread t1 = new Thread(() -> akun.tarikTunai(40000), "User-1");
        Thread t2 = new Thread(() -> akun.tarikTunai(70000), "User-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Sisa saldo akhir: Rp " + akun.getSaldo());
    }
}

class AkunLock {
    private double saldo = 100000;
    private final ReentrantLock lock = new ReentrantLock();

    void tarikTunai(double nominal) {
        lock.lock(); // Memperoleh kunci
        try {
            System.out.println("[" + Thread.currentThread().getName() + "] Masuk ke area kritis.");
            if (saldo >= nominal) {
                saldo -= nominal;
                System.out.println("[" + Thread.currentThread().getName() + "] Berhasil tarik Rp " + nominal);
            } else {
                System.out.println("[" + Thread.currentThread().getName() + "] Saldo tidak cukup!");
            }
        } finally {
            lock.unlock(); // WAJIB melepaskan kunci di dalam finally untuk mencegah deadlock
        }
    }

    double getSaldo() {
        return saldo;
    }
}
