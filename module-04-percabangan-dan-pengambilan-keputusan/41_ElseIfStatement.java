// Mendemonstrasikan percabangan banyak kondisi bertingkat menggunakan else-if ladder.
class ElseIfStatement {
    public static void main(String[] args) {
        int skor = 82;

        System.out.println("=== Percabangan else-if Bertingkat ===");
        System.out.println("Skor Penilaian: " + skor);

        // Kondisi diperiksa berurutan dari atas ke bawah hingga menemukan kondisi pertama yang bernilai true
        if (skor >= 85) {
            System.out.println("Predikat: A (Sangat Memuaskan)");
        } else if (skor >= 75) {
            System.out.println("Predikat: B (Memuaskan)");
        } else if (skor >= 65) {
            System.out.println("Predikat: C (Cukup)");
        } else if (skor >= 50) {
            System.out.println("Predikat: D (Kurang)");
        } else {
            System.out.println("Predikat: E (Gagal)");
        }
    }
}
