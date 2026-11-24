// Mendemonstrasikan pengurutan array menggunakan java.util.Arrays.sort dan algoritma Bubble Sort.
import java.util.Arrays;

class ArraySorting {
    public static void main(String[] args) {
        System.out.println("=== Pengurutan Array (Sorting) ===");

        int[] angka = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array sebelum diurutkan: " + Arrays.toString(angka));

        // Mengurutkan menggunakan utility bawaan Java
        Arrays.sort(angka);
        System.out.println("Array setelah Arrays.sort(): " + Arrays.toString(angka));

        String[] nama = {"Zaki", "Budi", "Chandra", "Agus", "Dewi"};
        Arrays.sort(nama);
        System.out.println("Nama terurut abjad: " + Arrays.toString(nama));
    }
}
