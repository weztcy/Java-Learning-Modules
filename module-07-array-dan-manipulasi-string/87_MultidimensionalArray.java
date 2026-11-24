// Mendemonstrasikan struktur data array dua dimensi (matriks/tabel).
class MultidimensionalArray {
    public static void main(String[] args) {
        System.out.println("=== Array Multidimensi (2D Array) ===");

        // Inisialisasi matriks 2x3 (2 baris, 3 kolom)
        int[][] matriks = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // Menampilkan elemen menggunakan nested loop
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Jumlah baris: " + matriks.length);
        System.out.println("Jumlah kolom baris pertama: " + matriks[0].length);
    }
}
