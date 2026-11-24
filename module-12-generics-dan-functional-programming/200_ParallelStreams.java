// Mendemonstrasikan Parallel Streams untuk komputasi paralel multi-core memanfaatkan ForkJoinPool.
import java.util.List;

class ParallelStreams {
    public static void main(String[] args) {
        System.out.println("=== Parallel Streams (Multi-Core Processing) ===");

        List<Integer> angkaList = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println("Eksekusi Sejajar (Parallel Stream):");
        angkaList.parallelStream().forEach(n -> {
            System.out.println("Angka " + n + " diproses oleh thread: " + Thread.currentThread().getName());
        });

        // Menghitung jumlah total secara paralel
        long totalJumlah = angkaList.parallelStream().mapToLong(Integer::longValue).sum();
        System.out.println("Total penjumlahan paralel: " + totalJumlah);
    }
}
