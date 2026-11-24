// Mendemonstrasikan Unchecked Exception (turunan RuntimeException) yang tidak diwajibkan compiler untuk ditangani eksplisit.
class UncheckedExceptions {
    public static void main(String[] args) {
        System.out.println("=== Unchecked Exceptions (RuntimeException) ===");

        // Contoh 1: NullPointerException
        try {
            String teksNull = null;
            System.out.println("Panjang string null: " + teksNull.length());
        } catch (NullPointerException e) {
            System.out.println("1. Tertangkap NullPointerException: Objek masih bernilai null!");
        }

        // Contoh 2: NumberFormatException
        try {
            int angka = Integer.parseInt("SeratusRupiah");
        } catch (NumberFormatException e) {
            System.out.println("2. Tertangkap NumberFormatException: Karakter alfabet tidak dapat diubah ke integer!");
        }
    }
}
