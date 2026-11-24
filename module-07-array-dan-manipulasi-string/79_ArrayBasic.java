// Mendemonstrasikan konsep dasar struktur data array satu dimensi di Java.
class ArrayBasic {
    public static void main(String[] args) {
        System.out.println("=== Array Dasar di Java ===");

        // Deklarasi array bertipe int dengan ukuran 5 elemen
        int[] kumpulanAngka = new int[5];

        // Mengisi nilai elemen array berdasarkan indeks (0 sampai ukuran - 1)
        kumpulanAngka[0] = 10;
        kumpulanAngka[1] = 20;
        kumpulanAngka[2] = 30;
        kumpulanAngka[3] = 40;
        kumpulanAngka[4] = 50;

        // Properti .length menyimpan kapasitas ukuran array yang bersifat tetap (fixed-size)
        System.out.println("Panjang array: " + kumpulanAngka.length);
        System.out.println("Elemen pertama (indeks 0): " + kumpulanAngka[0]);
        System.out.println("Elemen terakhir (indeks 4): " + kumpulanAngka[4]);
    }
}
