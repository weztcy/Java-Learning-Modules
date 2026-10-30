// Mendemonstrasikan siklus hidup objek yang tidak terjangkau (unreachable) dan mekanisme Garbage Collection.
class GarbageCollection {
    public static void main(String[] args) {
        System.out.println("=== 280. Mekanisme Garbage Collection (GC) di JVM ===");

        Runtime rt = Runtime.getRuntime();
        long memoriAwal = rt.totalMemory() - rt.freeMemory();
        System.out.println("Memori terpakai awal: " + (memoriAwal / 1024) + " KB");

        System.out.println("\nMembuat 50.000 objek sementara dalam memori...");
        for (int i = 0; i < 50000; i++) {
            new ObjekSementara(i); // Objek langsung menjadi unreachable setelah dibuat
        }

        long memoriSetelahAlokasi = rt.totalMemory() - rt.freeMemory();
        System.out.println("Memori setelah alokasi objek: " + (memoriSetelahAlokasi / 1024) + " KB");

        System.out.println("\nMeminta JVM menjalankan Garbage Collection (System.gc())...");
        System.gc(); // Saran kepada JVM untuk memicu GC

        try { Thread.sleep(100); } catch (InterruptedException e) {}

        long memoriSetelahGC = rt.totalMemory() - rt.freeMemory();
        System.out.println("Memori setelah GC: " + (memoriSetelahGC / 1024) + " KB");

        System.out.println("\nKeluarga Algoritma GC JVM Modern:");
        System.out.println("- Serial GC        : Cocok untuk aplikasi footprint kecil single-thread.");
        System.out.println("- Parallel GC      : Mengoptimalkan throughput pemrosesan batch.");
        System.out.println("- G1 GC (Default)  : Menyeimbangkan latency jeda pendek dan kapasitas heap besar.");
        System.out.println("- ZGC / Shenandoah : Latency ultra-rendah (<1ms) untuk heap raksasa terabyte.");
    }
}

class ObjekSementara {
    private final int id;
    private final byte[] dummy = new byte[128];
    public ObjekSementara(int id) { this.id = id; }
}
