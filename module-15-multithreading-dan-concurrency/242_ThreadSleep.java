// Mendemonstrasikan penggunaan Thread.sleep() untuk menjeda eksekusi thread dengan penanganan InterruptedException yang benar.
class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan Thread.sleep() ===");

        System.out.println("Memulai simulasi hitung mundur sistem:");
        for (int i = 3; i >= 1; i--) {
            System.out.println("Waktu tersisa: " + i + " detik");
            try {
                // Menjeda thread saat ini selama 300 milidetik
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread dibangunkan sebelum waktunya: " + e.getMessage());
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Selesai! Sistem aktif bekerja.");
    }
}
