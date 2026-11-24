// Mendemonstrasikan teknik pelacakan kesalahan (Debugging) dan inspeksi Stack Trace program.
class DebuggingJava {
    public static void main(String[] args) {
        System.out.println("=== 278. Teknik Debugging & Analisis Stack Trace ===");

        System.out.println("Memulai alur eksekusi metode bertingkat:");
        metodeTingkat1();
    }

    public static void metodeTingkat1() {
        System.out.println("-> Berada di metodeTingkat1()");
        metodeTingkat2(10, 0);
    }

    public static void metodeTingkat2(int a, int b) {
        System.out.println("-> Berada di metodeTingkat2(a=" + a + ", b=" + b + ")");
        try {
            int hasil = metodeKritis(a, b);
            System.out.println("Hasil: " + hasil);
        } catch (Exception e) {
            System.out.println("\n[DEBUGGER] Menangkap Exception: " + e.getClass().getName());
            System.out.println("[DEBUGGER] Pesan: " + e.getMessage());
            System.out.println("[DEBUGGER] Rincian Stack Trace:");
            for (StackTraceElement elem : e.getStackTrace()) {
                System.out.printf("   at %s.%s (%s:%d)%n",
                        elem.getClassName(), elem.getMethodName(), elem.getFileName(), elem.getLineNumber());
            }
        }
    }

    public static int metodeKritis(int pembilang, int penyebut) {
        if (penyebut == 0) {
            throw new ArithmeticException("Penyebut bernilai 0 tidak diizinkan dalam kalkulasi.");
        }
        return pembilang / penyebut;
    }
}
