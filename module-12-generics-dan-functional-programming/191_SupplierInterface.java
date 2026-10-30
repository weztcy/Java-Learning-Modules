// Mendemonstrasikan interface fungsional standar java.util.function.Supplier (penghasil nilai tanpa argumen: () -> T).
import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

class SupplierInterface {
    public static void main(String[] args) {
        System.out.println("=== java.util.function.Supplier<T> ===");

        // Supplier menghasilkan waktu saat ini saat .get() dipanggil
        Supplier<LocalDateTime> penyuplaiWaktu = () -> LocalDateTime.now();

        // Supplier menghasilkan nomor acak 1..100
        Supplier<Integer> angkaAcak = () -> new Random().nextInt(100) + 1;

        System.out.println("Waktu saat ini : " + penyuplaiWaktu.get());
        System.out.println("Nomor acak 1   : " + angkaAcak.get());
        System.out.println("Nomor acak 2   : " + angkaAcak.get());
    }
}
