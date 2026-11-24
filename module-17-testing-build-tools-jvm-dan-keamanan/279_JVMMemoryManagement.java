// Mendemonstrasikan arsitektur memori Java Virtual Machine (Heap, Stack, Metaspace) dan inspeksi memori Runtime.
class JVMMemoryManagement {
    public static void main(String[] args) {
        System.out.println("=== 279. Arsitektur Memori JVM (Runtime Memory Inspection) ===");

        Runtime runtime = Runtime.getRuntime();
        long byteToMB = 1024 * 1024;

        long maxMemory = runtime.maxMemory() / byteToMB;
        long totalMemory = runtime.totalMemory() / byteToMB;
        long freeMemory = runtime.freeMemory() / byteToMB;
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Statistik Memori Heap Saat Ini:");
        System.out.println("-> Maksimum Heap (-Xmx)     : " + maxMemory + " MB");
        System.out.println("-> Total Heap Terpola (-Xms) : " + totalMemory + " MB");
        System.out.println("-> Heap Terpakai (Used)      : " + usedMemory + " MB");
        System.out.println("-> Heap Bebas (Free)         : " + freeMemory + " MB");

        System.out.println("\nKomponen Utama Memori JVM:");
        System.out.println("1. Heap Memory: Menyimpan seluruh instans Objek dan Array (dikelola oleh Garbage Collector).");
        System.out.println("2. Stack Memory: Menyimpan frame pemanggilan method, variabel lokal primitif, dan referensi objek.");
        System.out.println("3. Metaspace: Menyimpan metadata class, bytecode method, dan constant pool di memori native.");
    }
}
