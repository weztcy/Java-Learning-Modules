// Program praktis operasi penjumlahan dua buah matriks matematika 2x2.
class MatrixAddition {
    public static void main(String[] args) {
        System.out.println("=== Penjumlahan Matriks 2x2 ===");

        int[][] matriksA = {
            {2, 4},
            {6, 8}
        };

        int[][] matriksB = {
            {1, 3},
            {5, 7}
        };

        int baris = matriksA.length;
        int kolom = matriksA[0].length;
        int[][] hasil = new int[baris][kolom];

        // Setiap elemen hasil merupakan penjumlahan elemen pada posisi yang bersesuaian: C[i][j] = A[i][j] + B[i][j]
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("Hasil Matriks A + Matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
