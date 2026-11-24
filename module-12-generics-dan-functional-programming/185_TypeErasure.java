// Mendemonstrasikan Type Erasure: mekanisme compiler menghapus informasi tipe generik saat menghasilkan bytecode.
import java.util.ArrayList;
import java.util.List;

class TypeErasure {
    public static void main(String[] args) {
        System.out.println("=== Konsep Type Erasure di JVM ===");

        List<String> listTeks = new ArrayList<>();
        List<Integer> listAngka = new ArrayList<>();

        // Saat runtime di JVM, kedua class identik menjadi java.util.ArrayList mentah (raw type)
        System.out.println("Class listTeks  : " + listTeks.getClass());
        System.out.println("Class listAngka : " + listAngka.getClass());
        System.out.println("Apakah kedua class sama saat runtime? " + (listTeks.getClass() == listAngka.getClass()));
        System.out.println("Catatan: Informasi tipe hanya ada saat waktu kompilasi untuk menjamin kompatibilitas bytecode lama.");
    }
}
