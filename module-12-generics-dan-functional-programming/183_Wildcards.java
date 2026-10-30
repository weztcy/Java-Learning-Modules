// Mendemonstrasikan penggunaan Wildcard (?) pada generik: unbounded (?), upper-bounded (? extends), dan lower-bounded (? super).
import java.util.List;

class Wildcards {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan Wildcards (?) ===");

        List<Integer> listInt = List.of(10, 20, 30);
        List<Double> listDouble = List.of(1.5, 2.5, 3.5);
        List<String> listString = List.of("A", "B", "C");

        // 1. Unbounded Wildcard (?)
        System.out.println("Cetak Unbounded List:");
        cetakList(listString);

        // 2. Upper-Bounded Wildcard (? extends Number)
        System.out.println("\nTotal Penjumlahan (? extends Number):");
        System.out.println("Sum int   : " + jumlahkanAngka(listInt));
        System.out.println("Sum double: " + jumlahkanAngka(listDouble));
    }

    // Unbounded: Menerima list dari tipe apapun
    static void cetakList(List<?> list) {
        System.out.println("Elemen list: " + list);
    }

    // Upper bounded: Menerima list dari Number atau subclass-nya
    static double jumlahkanAngka(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            total += n.doubleValue();
        }
        return total;
    }
}
