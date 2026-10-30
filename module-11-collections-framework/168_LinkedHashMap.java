// Mendemonstrasikan LinkedHashMap: Map yang menjaga urutan penyisipan kunci (insertion order).
import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapDemo {
    public static void main(String[] args) {
        System.out.println("=== LinkedHashMap (Preserve Key Insertion Order) ===");

        Map<String, String> kamusIstilah = new LinkedHashMap<>();

        kamusIstilah.put("JVM", "Java Virtual Machine");
        kamusIstilah.put("JDK", "Java Development Kit");
        kamusIstilah.put("JRE", "Java Runtime Environment");

        System.out.println("Daftar istilah sesuai urutan registrasi:");
        kamusIstilah.forEach((k, v) -> System.out.println(" " + k + " = " + v));
    }
}
