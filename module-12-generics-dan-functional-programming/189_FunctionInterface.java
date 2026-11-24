// Mendemonstrasikan interface fungsional standar java.util.function.Function (pemetaan/transformasi: T -> R).
import java.util.function.Function;

class FunctionInterface {
    public static void main(String[] args) {
        System.out.println("=== java.util.function.Function<T, R> ===");

        // Mengubah String menjadi representasi panjang karakternya (Integer)
        Function<String, Integer> hitungPanjang = teks -> teks.length();

        // Mengubah angka rupiah ke teks berformat
        Function<Double, String> formatRupiah = nominal -> String.format("Rp %,.2f", nominal);

        System.out.println("Panjang kata 'Antigravity': " + hitungPanjang.apply("Antigravity"));
        System.out.println("Format 1500000: " + formatRupiah.apply(1500000.0));
    }
}
