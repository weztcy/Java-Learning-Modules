// Mendemonstrasikan LinkedList: implementasi linked list berantai ganda (doubly linked list).
import java.util.LinkedList;

class LinkedListBasic {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan java.util.LinkedList ===");

        LinkedList<String> antrian = new LinkedList<>();

        // Operasi penambahan di awal dan akhir secara efisien (O(1))
        antrian.add("Pelanggan B");
        antrian.addFirst("Pelanggan A (Prioritas)");
        antrian.addLast("Pelanggan C");

        System.out.println("Elemen Pertama : " + antrian.getFirst());
        System.out.println("Elemen Terakhir: " + antrian.getLast());
        System.out.println("Isi antrian    : " + antrian);

        // Menghapus elemen pertama
        antrian.removeFirst();
        System.out.println("Setelah removeFirst(): " + antrian);
    }
}
