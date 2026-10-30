// Mendemonstrasikan interface fungsional standar java.util.function.Predicate (pengujian kondisi boolean: T -> boolean).
import java.util.function.Predicate;

class PredicateInterface {
    public static void main(String[] args) {
        System.out.println("=== java.util.function.Predicate<T> ===");

        // Predicate memeriksa apakah angka bernilai genap
        Predicate<Integer> isGenap = n -> n % 2 == 0;
        Predicate<Integer> isPositif = n -> n > 0;

        int angkaUji = 14;
        System.out.println("Apakah " + angkaUji + " genap?   " + isGenap.test(angkaUji));

        // Menggabungkan dua kondisi Predicate dengan .and()
        Predicate<Integer> isGenapDanPositif = isGenap.and(isPositif);
        System.out.println("Apakah " + angkaUji + " genap & positif? " + isGenapDanPositif.test(angkaUji));
    }
}
