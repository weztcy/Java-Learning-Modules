// Mendemonstrasikan multi-catch statement (Java 7+): menangani beberapa jenis exception berbeda dalam satu blok catch dengan operator pipa (|).
class MultiCatch {
    public static void main(String[] args) {
        System.out.println("=== Multi-Catch Statement (Operator |) ===");

        ujiMultiCatch(1);
        System.out.println("----------------------------------------");
        ujiMultiCatch(2);
    }

    static void ujiMultiCatch(int skenario) {
        try {
            if (skenario == 1) {
                int hasil = 50 / 0; // ArithmeticException
            } else {
                int[] data = new int[2];
                int x = data[10];   // ArrayIndexOutOfBoundsException
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            // Satu penanganan bersama untuk dua jenis exception berbeda
            System.out.println("-> Multi-Catch tertangkap!");
            System.out.println("   Tipe Exception : " + ex.getClass().getSimpleName());
            System.out.println("   Pesan Error    : " + ex.getMessage());
        }
    }
}
