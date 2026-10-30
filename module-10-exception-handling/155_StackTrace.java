// Mendemonstrasikan analisis jejak tumpukan eksekusi (Stack Trace) saat mencari akar penyebab error program.
class StackTrace {
    public static void main(String[] args) {
        System.out.println("=== Analisis Stack Trace ===");

        try {
            fungsiA();
        } catch (Exception e) {
            System.out.println("-> Exception tertangkap: " + e);
            System.out.println("Rincian Call Stack Trace:");

            // Membaca elemen stack trace secara terstruktur
            StackTraceElement[] jejak = e.getStackTrace();
            for (int i = 0; i < Math.min(jejak.length, 3); i++) {
                StackTraceElement el = jejak[i];
                System.out.println("   [" + i + "] Class: " + el.getClassName() +
                                   " | Method: " + el.getMethodName() +
                                   " | Baris: " + el.getLineNumber());
            }
        }
    }

    static void fungsiA() { fungsiB(); }
    static void fungsiB() { fungsiC(); }
    static void fungsiC() {
        throw new IllegalStateException("Kondisi sistem belum siap untuk komputasi.");
    }
}
