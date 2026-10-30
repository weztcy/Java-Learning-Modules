// Mendemonstrasikan siklus hidup status thread (Thread.State): NEW, RUNNABLE, TIMED_WAITING, TERMINATED.
class ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Siklus Hidup Thread (Thread.State) ===");

        Thread threadUji = new Thread(() -> {
            try {
                // Berada dalam kondisi TIMED_WAITING saat sleep
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Status 1: NEW (baru dibuat, belum di-start)
        System.out.println("Status 1 (Sebelum start) : " + threadUji.getState());

        threadUji.start();
        // Status 2: RUNNABLE (sedang aktif berjalan di CPU)
        System.out.println("Status 2 (Setelah start) : " + threadUji.getState());

        Thread.sleep(50);
        // Status 3: TIMED_WAITING (sedang tidur terukur)
        System.out.println("Status 3 (Saat sleep)    : " + threadUji.getState());

        threadUji.join();
        // Status 4: TERMINATED (tugas selesai tuntas)
        System.out.println("Status 4 (Setelah tuntas): " + threadUji.getState());
    }
}
