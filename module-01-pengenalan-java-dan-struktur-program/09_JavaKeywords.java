// Mendemonstrasikan konsep kata kunci terpesan (reserved keywords) pada Java.
class JavaKeywords {
    public static void main(String[] args) {
        // Kata kunci 'class', 'public', 'static', 'void', 'int', 'final', 'boolean' adalah reserved keywords.
        // Kata kunci tidak dapat dijadikan nama variabel atau class.
        final int KODE_SUKSES = 200;
        boolean statusAktif = true;

        System.out.println("=== Contoh Java Reserved Keywords ===");
        System.out.println("1. Tipe data primitif : int, double, boolean, char, float, byte, short, long");
        System.out.println("2. Kontrol alur      : if, else, switch, case, for, while, do, break, continue");
        System.out.println("3. Access modifier   : public, private, protected");
        System.out.println("4. Modifier lain     : static, final, abstract, synchronized");
        System.out.println("Status program saat ini: " + statusAktif + " (Kode: " + KODE_SUKSES + ")");
    }
}
