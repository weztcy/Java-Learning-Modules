// Program praktis perkalian dua buah matriks matematika (ordo 2x2).
class MatrixMultiplication {
    public static void main(String[] args) {
        System.out.println("=== Perkalian Matriks 2x2 ===");

        int[][] matriksA = {
            {1, 2},
            {3, 4}
        };

        int[][] matriksB = {
            {5, 6},
            {7, 8}
        };

        int[][] hasil = new int[2][2];

        // Rumus perkalian baris kali kolom: C[i][j] = sum(A[i][k] * B[k][j])
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }

        System.out.println("Hasil Matriks A x Matriks B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
