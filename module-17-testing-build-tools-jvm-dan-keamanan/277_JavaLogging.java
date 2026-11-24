// Mendemonstrasikan pengelolaan log aplikasi dengan Java Standard Logging (java.util.logging.Logger).
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

class JavaLogging {
    private static final Logger LOGGER = Logger.getLogger(JavaLogging.class.getName());

    public static void main(String[] args) {
        System.out.println("=== 277. Manajemen Logging dengan java.util.logging ===");

        // Mengatur handler dan format kustom yang bersih
        LOGGER.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return String.format("[%s] [%-7s] %s%n",
                        record.getLoggerName(), record.getLevel(), record.getMessage());
            }
        });
        LOGGER.addHandler(handler);
        LOGGER.setLevel(Level.ALL);

        // Demonstrasi berbagai tingkatan log (Log Levels)
        LOGGER.finest("Log tingkat FINEST: Debugging mendalam.");
        LOGGER.info("Aplikasi sistem inventaris berhasil dimuat.");
        LOGGER.config("Konfigurasi port disetel ke 8080.");
        LOGGER.warning("Koneksi jaringan mengalami latensi 120ms.");
        LOGGER.severe("Gagal menghubungi server otentikasi eksternal!");

        System.out.println("\nLogging jauh lebih dianjurkan daripada System.out.println karena mendukung level filtering dan pemindahan output ke file.");
    }
}
