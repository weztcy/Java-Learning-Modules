// Mendemonstrasikan ListIterator: iterator dua arah (maju dan mundur) khusus untuk List.
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class ListIteratorDemo {
    public static void main(String[] args) {
        System.out.println("=== ListIterator Dua Arah ===");

        List<String> langkah = new ArrayList<>(List.of("Langkah 1", "Langkah 2", "Langkah 3"));

        ListIterator<String> listIt = langkah.listIterator();

        System.out.println("1. Maju ke depan:");
        while (listIt.hasNext()) {
            System.out.println("   Maju -> " + listIt.next());
        }

        System.out.println("\n2. Mundur ke belakang:");
        while (listIt.hasPrevious()) {
            System.out.println("   Mundur <- " + listIt.previous());
        }
    }
}
