// Mendemonstrasikan explicit type casting (narrowing conversion) dari tipe berukuran besar ke kecil.
class TypeCasting {
    public static void main(String[] args) {
        // Narrowing casting dilakukan secara manual dengan menuliskan (tipe_tujuan) di depan nilai
        double nilaiDesimal = 159.987;
        int nilaiBulat = (int) nilaiDesimal; // Bagian pecahan terpotong (truncation)

        long nilaiLongBesar = 300L;
        byte nilaiByte = (byte) nilaiLongBesar; // Terjadi overflow karena byte maksimum 127

        System.out.println("=== Explicit Type Casting (Narrowing) ===");
        System.out.println("Nilai double asli : " + nilaiDesimal);
        System.out.println("Setelah cast ke int: " + nilaiBulat + " (pecahan dihilangkan)");
        System.out.println("Nilai long asli   : " + nilaiLongBesar);
        System.out.println("Setelah cast byte : " + nilaiByte + " (terjadi perputaran nilai/overflow)");
    }
}
