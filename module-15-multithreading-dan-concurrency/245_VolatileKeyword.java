// Mendemonstrasikan kata kunci volatile untuk menjamin visibilitas variabel langsung ke memori utama (bukan cache register CPU).
class VolatileKeyword {
    // Keyword volatile memastikan pembaruan variabel 'berhenti' segera terlihat oleh semua thread lain
    private static volatile boolean berhenti = false;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Keyword volatile (Memori Visibilitas) ===");

        Thread pekerja = new Thread(() -> {
            long putaran = 0;
            while (!berhenti) {
                putaran++;
            }
            System.out.println("Pekerja berhenti setelah " + putaran + " putaran.");
        });

        pekerja.start();

        Thread.sleep(100);
        System.out.println("Main thread mengubah 'berhenti' menjadi true...");
        berhenti = true; // Langsung terbaca oleh thread pekerja karena modifier volatile

        pekerja.join();
        System.out.println("Aplikasi selesai.");
    }
}
