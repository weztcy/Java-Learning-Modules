// Mendemonstrasikan penggunaan pernyataan assert untuk memvalidasi asumsi internal program saat tahap pengujian (debugging).
class Assertions {
    public static void main(String[] args) {
        System.out.println("=== Pernyataan Assertions di Java ===");

        int saldoAwal = 50000;
        int nominalTarik = 20000;

        int sisaSaldo = saldoAwal - nominalTarik;

        // Assertion memverifikasi bahwa kondisi logis harus selalu true
        assert sisaSaldo >= 0 : "Invarian dilanggar: Sisa saldo tidak boleh negatif!";

        System.out.println("Saldo Awal   : Rp " + saldoAwal);
        System.out.println("Tarik Uang   : Rp " + nominalTarik);
        System.out.println("Sisa Saldo   : Rp " + sisaSaldo);
        System.out.println("Status       : Asumsi internal valid.");
        System.out.println("Catatan      : Assertion diaktifkan menggunakan argumen JVM '-ea' (enableassertions).");
    }
}
