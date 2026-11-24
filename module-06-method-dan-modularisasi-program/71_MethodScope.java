// Mendemonstrasikan cakupan (scope) variabel: variabel lokal, parameter, dan variabel level class (field).
class MethodScope {
    // Class-level field (dapat diakses oleh seluruh method dalam class)
    static int variabelGlobal = 1000;

    static void demonstrasiScope() {
        // Variabel lokal method (hanya hidup di dalam method ini)
        int variabelLokal = 50;
        System.out.println("Dalam method: variabelLokal  = " + variabelLokal);
        System.out.println("Dalam method: variabelGlobal = " + variabelGlobal);

        // Block scope di dalam if
        if (true) {
            int blockVariabel = 25;
            System.out.println("Dalam blok if: blockVariabel = " + blockVariabel);
        }
        // blockVariabel sudah tidak dapat diakses di sini
    }

    public static void main(String[] args) {
        System.out.println("=== Scope (Cakupan) Variabel ===");
        demonstrasiScope();
        System.out.println("Dalam main: variabelGlobal   = " + variabelGlobal);
    }
}
