// Mendemonstrasikan pengenalan method references (Class::method) sebagai sintaks ringkas memanggil method.
import java.util.Arrays;
import java.util.List;

class MethodReferencesIntro {
    static void cetakGaya(String teks) {
        System.out.println("-> [Item]: " + teks);
    }

    public static void main(String[] args) {
        System.out.println("=== Pengenalan Method References (::) ===");

        List<String> frameworkJava = Arrays.asList("Spring Boot", "Quarkus", "Micronaut", "Jakarta EE");

        // Menggunakan method reference merujuk ke static method: MethodReferencesIntro::cetakGaya
        System.out.println("Daftar Framework menggunakan Class::staticMethod:");
        frameworkJava.forEach(MethodReferencesIntro::cetakGaya);

        // Menggunakan method reference merujuk ke instance method System.out: System.out::println
        System.out.println("\nMencetak langsung via System.out::println:");
        frameworkJava.forEach(System.out::println);
    }
}
