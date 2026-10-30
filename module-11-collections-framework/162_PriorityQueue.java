// Mendemonstrasikan PriorityQueue: antrian berbasis heap yang mengutamakan elemen berprioritas tertinggi.
import java.util.PriorityQueue;
import java.util.Queue;

class PriorityQueueDemo {
    public static void main(String[] args) {
        System.out.println("=== PriorityQueue (Pengurutan Otomatis Min-Heap) ===");

        // Secara default menggunakan urutan alami (angka terkecil keluar lebih dulu)
        Queue<Integer> antrianDarurat = new PriorityQueue<>();

        antrianDarurat.offer(30);
        antrianDarurat.offer(10);
        antrianDarurat.offer(50);
        antrianDarurat.offer(20);

        System.out.println("Urutan pemrosesan berdasarkan prioritas nilai terkecil:");
        while (!antrianDarurat.isEmpty()) {
            System.out.print(antrianDarurat.poll() + " ");
        }
        System.out.println();
    }
}
