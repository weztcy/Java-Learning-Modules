// Mendemonstrasikan struktur data Queue dengan prinsip FIFO (First-In, First-Out).
import java.util.LinkedList;
import java.util.Queue;

class QueueInterface {
    public static void main(String[] args) {
        System.out.println("=== Struktur Data Queue (FIFO) ===");

        Queue<String> antrianTiket = new LinkedList<>();

        // Memasukkan antrian dengan offer()
        antrianTiket.offer("Nomor 001");
        antrianTiket.offer("Nomor 002");
        antrianTiket.offer("Nomor 003");

        // Melihat antrian terdepan dengan peek()
        System.out.println("Antrian terdepan (peek): " + antrianTiket.peek());

        // Melayani dan mengeluarkan antrian dengan poll()
        System.out.println("Melayani (poll)        : " + antrianTiket.poll());
        System.out.println("Antrian berikutnya     : " + antrianTiket.peek());
        System.out.println("Sisa antrian           : " + antrianTiket);
    }
}
