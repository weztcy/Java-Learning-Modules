// Mendemonstrasikan pemrograman asinkronus non-blocking reaktif menggunakan java.util.concurrent.CompletableFuture.
import java.util.concurrent.CompletableFuture;

class CompletableFutureDemo {
    public static void main(String[] args) {
        System.out.println("=== java.util.concurrent.CompletableFuture ===");

        // Pipa eksekusi asinkronus: supplyAsync -> thenApply -> thenAccept
        CompletableFuture<Void> pipeline = CompletableFuture.supplyAsync(() -> {
            System.out.println("[Tahap 1] Mengambil harga produk dari server...");
            return 250000.0;
        }).thenApply(harga -> {
            System.out.println("[Tahap 2] Menerapkan diskon promo 20%...");
            return harga * 0.80;
        }).thenAccept(totalAkhir -> {
            System.out.printf("[Tahap 3] Total akhir yang harus dibayar: Rp %,.2f%n", totalAkhir);
        });

        // Menunggu seluruh tahapan pipeline asinkronus selesai
        pipeline.join();
        System.out.println("Pipeline CompletableFuture tuntas non-blocking.");
    }
}
