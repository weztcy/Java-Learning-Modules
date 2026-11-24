// Mendemonstrasikan manipulasi elemen array melalui nomor indeks dan batasan indeks.
class ArrayIndexing {
    public static void main(String[] args) {
        System.out.println("=== Akses Indeks Array ===");

        int[] skor = {85, 90, 78, 92, 88};

        // Membaca nilai sebelum dimodifikasi
        System.out.println("Nilai indeks ke-2 sebelum update: " + skor[2]);

        // Mengubah nilai elemen pada indeks tertentu
        skor[2] = 95;
        System.out.println("Nilai indeks ke-2 setelah update: " + skor[2]);

        System.out.println("Indeks valid untuk array ini: 0 sampai " + (skor.length - 1));
        System.out.println("Catatan: Mengakses indeks di luar batas akan memicu ArrayIndexOutOfBoundsException.");
    }
}
