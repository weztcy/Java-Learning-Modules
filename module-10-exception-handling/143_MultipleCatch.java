// Mendemonstrasikan multiple catch blocks untuk menangani berbagai tipe exception yang berbeda secara spesifik.
class MultipleCatch {
    public static void main(String[] args) {
        System.out.println("=== Multiple Catch Blocks ===");

        prosesData("123", 0);  // Kasus pembagian dengan nol
        System.out.println("---------------------------------");
        prosesData("ABC", 2);  // Kasus kesalahan konversi angka
    }

    static void prosesData(String inputAngka, int pembagi) {
        try {
            int angka = Integer.parseInt(inputAngka); // Bisa memicu NumberFormatException
            int hasil = angka / pembagi;              // Bisa memicu ArithmeticException
            System.out.println("Hasil perhitungan: " + hasil);
        } catch (NumberFormatException nfe) {
            System.out.println("-> Catch [NumberFormatException]: Input '" + inputAngka + "' bukan format angka valid!");
        } catch (ArithmeticException ae) {
            System.out.println("-> Catch [ArithmeticException]: Pembagian dengan nol tidak diizinkan!");
        } catch (Exception e) {
            System.out.println("-> Catch [Exception Umum]: Terjadi kesalahan tak terduga: " + e.getMessage());
        }
    }
}
