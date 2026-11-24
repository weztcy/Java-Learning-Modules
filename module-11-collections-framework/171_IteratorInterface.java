// Mendemonstrasikan pola penelusuran aman menggunakan Iterator interface beserta method .remove().
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorInterface {
    public static void main(String[] args) {
        System.out.println("=== Penelusuran Aman dengan Iterator ===");

        List<Integer> nilaiList = new ArrayList<>(List.of(45, 80, 60, 95, 30, 85));

        System.out.println("Daftar nilai awal: " + nilaiList);

        // Menggunakan Iterator untuk menghapus elemen di bawah 70 secara aman saat iterasi
        Iterator<Integer> iterator = nilaiList.iterator();
        while (iterator.hasNext()) {
            int nilai = iterator.next();
            if (nilai < 70) {
                iterator.remove(); // Aman dari ConcurrentModificationException
            }
        }

        System.out.println("Daftar nilai setelah nilai < 70 dihapus: " + nilaiList);
    }
}
