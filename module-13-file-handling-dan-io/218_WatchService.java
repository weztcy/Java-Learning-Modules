// Mendemonstrasikan java.nio.file.WatchService untuk memantau aktivitas perubahan (create/modify/delete) pada direktori.
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.concurrent.TimeUnit;

class WatchServiceDemo {
    public static void main(String[] args) {
        System.out.println("=== Pengenalan java.nio.file.WatchService ===");

        Path folder = Path.of(".");

        try (WatchService watcher = FileSystems.getDefault().newWatchService()) {
            // Mendaftarkan direktori saat ini untuk memantau event pembuatan berkas baru
            folder.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY);
            System.out.println("Berhasil mendaftarkan watcher pada direktori: " + folder.toAbsolutePath().normalize());

            // Memeriksa event dengan timeout aman agar program tidak hanging/blocking
            System.out.println("Memeriksa antrian event sistem file (timeout 500ms)...");
            WatchKey key = watcher.poll(500, TimeUnit.MILLISECONDS);

            if (key != null) {
                System.out.println("Terdeteksi aktivitas pada direktori!");
                key.reset();
            } else {
                System.out.println("Tidak ada aktivitas file eksternal dalam jendela pantau 500ms (Normal).");
            }

            System.out.println("WatchService siap digunakan untuk memantau perubahan file secara real-time.");
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
