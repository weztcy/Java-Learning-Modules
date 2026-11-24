// Mendemonstrasikan penanganan error secara terstruktur dengan blok try-catch.
class TryCatch {
    public static void main(String[] args) {
        System.out.println("=== Blok try-catch Sederhana ===");

        int[] data = {10, 20, 30};

        try {
            System.out.println("Membaca elemen indeks ke-5 (di luar batas array 0..2)...");
            int nilai = data[5]; // Memicu ArrayIndexOutOfBoundsException
            System.out.println("Nilai: " + nilai);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("-> Blok CATCH menangkap kesalahan: Indeks array melebihi ukuran!");
            System.out.println("   Pesan detail error: " + ex.getMessage());
        }

        System.out.println("Aplikasi tetap stabil dan tidak mengalami crash mendadak.");
    }
}
