// Mendemonstrasikan TreeSet: himpunan berbasis struktur Red-Black Tree yang selalu terurut secara alami (sorted set).
import java.util.TreeSet;
import java.util.Set;

class TreeSetDemo {
    public static void main(String[] args) {
        System.out.println("=== java.util.TreeSet (Elemen Selalu Terurut) ===");

        Set<Integer> angkaAcak = new TreeSet<>();

        angkaAcak.add(85);
        angkaAcak.add(12);
        angkaAcak.add(45);
        angkaAcak.add(99);
        angkaAcak.add(23);

        System.out.println("Elemen otomatis terurut menaik (Ascending): " + angkaAcak);
    }
}
