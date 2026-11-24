// Mendemonstrasikan prinsip rekursi dasar: method yang memanggil dirinya sendiri dengan base case.
class RecursiveMethods {
    // Menghitung mundur secara rekursif
    static void hitungMundur(int n) {
        // Base case: Kondisi berhenti agar tidak terjadi StackOverflowError
        if (n <= 0) {
            System.out.println("Selesai! Base case tercapai.");
            return;
        }

        // Recursive case: Melakukan aksi lalu memanggil diri sendiri dengan argumen yang mengecil
        System.out.print(n + " -> ");
        hitungMundur(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("=== Rekursi Dasar (Recursive Methods) ===");
        System.out.print("Hitung mundur dari 5: ");
        hitungMundur(5);
    }
}
