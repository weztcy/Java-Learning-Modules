// Mendemonstrasikan inisialisasi variabel langsung saat deklarasi dan inisialisasi bertahap.
class VariableInitialization {
    public static void main(String[] args) {
        // Inisialisasi langsung: Deklarasi tipe sekaligus memberikan nilai awal
        int skorAwal = 100;
        String namaPemain = "Arjuna";

        // Inisialisasi beberapa variabel sekaligus dalam satu baris dengan tipe yang sama
        int koordinatX = 10, koordinatY = 25, koordinatZ = 0;

        System.out.println("=== Inisialisasi Variabel ===");
        System.out.println("Pemain      : " + namaPemain);
        System.out.println("Skor Awal   : " + skorAwal);
        System.out.println("Posisi (X,Y,Z): (" + koordinatX + ", " + koordinatY + ", " + koordinatZ + ")");
    }
}
