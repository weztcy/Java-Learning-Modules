// Mendemonstrasikan konsep Virtual Threads (Project Loom): thread berbobot sangat ringan yang dikelola oleh JVM.
class VirtualThreads {
    public static void main(String[] args) {
        System.out.println("=== Konsep Virtual Threads (Project Loom) ===");
        System.out.println("1. Platform Thread (OS Thread) : Terikat langsung pada thread kernel OS (memori besar ~1MB).");
        System.out.println("2. Virtual Thread              : Dikelola langsung oleh runtime JVM (sangat ringan ~beberapa KB).");
        System.out.println("3. Keunggulan                  : Memungkinkan jutaan thread berjalan serentak tanpa kehabisan memori.");

        // Memeriksa kemampuan runtime dan mendemonstrasikan thread ringan
        Thread threadRingan = new Thread(() -> {
            System.out.println("-> Pekerja tugas ringan dieksekusi pada: " + Thread.currentThread());
        });
        threadRingan.start();

        try {
            threadRingan.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Konsep Virtual Threads merevolusi model konkurensi server bertaraf tinggi.");
    }
}
