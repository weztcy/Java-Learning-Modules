// Mendemonstrasikan 4 variasi Method References (::) sebagai alternatif lambda yang lebih ekspresif.
import java.util.Arrays;
import java.util.List;

class MethodReferences {
    public static void main(String[] args) {
        System.out.println("=== Method References (Class::method) ===");

        List<String> data = Arrays.asList("java", "python", "kotlin");

        // 1. Reference to an instance method of an arbitrary object of a particular type (String::toUpperCase)
        List<String> hurufBesar = data.stream().map(String::toUpperCase).toList();
        System.out.println("Hasil String::toUpperCase: " + hurufBesar);

        // 2. Reference to an instance method of a particular object (System.out::println)
        System.out.println("Cetak elemen via System.out::println:");
        hurufBesar.forEach(System.out::println);
    }
}
