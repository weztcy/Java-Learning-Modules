// Mendemonstrasikan konsep dasar terjadinya kondisi anomali (Exception) saat program berjalan.
class ExceptionBasic {
    public static void main(String[] args) {
        System.out.println("=== Konsep Dasar Exception ===");
        System.out.println("Exception adalah peristiwa yang mengganggu alur normal instruksi program.");

        int angka = 10;
        int pembagi = 0;

        // Tanpa penanganan, pembagian dengan nol akan melempar ArithmeticException dan menghentikan program
        System.out.println("Mencoba membagi " + angka + " dengan " + pembagi + "...");
        try {
            int hasil = angka / pembagi;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("-> Terdeteksi anomali: Tidak dapat membagi angka dengan nol (" + e.getMessage() + ")");
        }

        System.out.println("Program berhasil melanjutkan eksekusi secara selamat.");
    }
}
