// Mendemonstrasikan variable-length arguments (varargs: ...) untuk menerima jumlah argumen fleksibel.
class VarargsMethods {
    // Parameter varargs 'int... angka' diperlakukan sebagai array di dalam method
    static int hitungTotal(String label, int... angka) {
        System.out.print("Label: " + label + " | Daftar angka: ");
        int total = 0;
        for (int n : angka) {
            System.out.print(n + " ");
            total += n;
        }
        System.out.println();
        return total;
    }

    public static void main(String[] args) {
        System.out.println("=== Varargs (Variable-Length Arguments) ===");

        // Memanggil method dengan jumlah parameter bervariasi
        int total1 = hitungTotal("Set A", 10, 20);
        System.out.println("Total Set A = " + total1 + "\n");

        int total2 = hitungTotal("Set B", 5, 15, 25, 35, 45);
        System.out.println("Total Set B = " + total2 + "\n");

        int total3 = hitungTotal("Set C (Kosong)");
        System.out.println("Total Set C = " + total3);
    }
}
