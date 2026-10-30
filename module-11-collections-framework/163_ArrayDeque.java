// Mendemonstrasikan ArrayDeque: Double-Ended Queue (antrian dua arah) yang sangat cepat tanpa overhead alokasi node.
import java.util.ArrayDeque;
import java.util.Deque;

class ArrayDequeDemo {
    public static void main(String[] args) {
        System.out.println("=== ArrayDeque (Double-Ended Queue) ===");

        Deque<String> dek = new ArrayDeque<>();

        // Operasi di kedua ujung antrian
        dek.addFirst("Tengah");
        dek.addFirst("Depan");
        dek.addLast("Belakang");

        System.out.println("Isi Deque: " + dek);
        System.out.println("Keluarkan Depan   : " + dek.pollFirst());
        System.out.println("Keluarkan Belakang: " + dek.pollLast());
        System.out.println("Sisa elemen       : " + dek);
    }
}
