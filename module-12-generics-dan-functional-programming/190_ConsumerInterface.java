// Mendemonstrasikan interface fungsional standar java.util.function.Consumer (konsumen data tanpa return value: T -> void).
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerInterface {
    public static void main(String[] args) {
        System.out.println("=== java.util.function.Consumer<T> ===");

        Consumer<String> cetakBintang = teks -> System.out.println("* " + teks);
        Consumer<String> cetakPanah = teks -> System.out.println("-> " + teks);

        List<String> modul = Arrays.asList("OOP", "Exception", "Collections", "Streams");

        System.out.println("Menggunakan Consumer cetakBintang:");
        modul.forEach(cetakBintang);

        System.out.println("\nConsumer berantai dengan .andThen():");
        modul.forEach(cetakBintang.andThen(cetakPanah));
    }
}
