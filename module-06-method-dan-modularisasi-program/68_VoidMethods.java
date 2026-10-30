// Mendemonstrasikan method bertipe void yang melakukan aksi tanpa mengembalikan nilai data.
class VoidMethods {
    // Method void digunakan ketika tujuan utama adalah aksi sampingan (side effect) seperti mencetak teks
    static void cetakGarisPemisah(char karakter, int panjang) {
        for (int i = 0; i < panjang; i++) {
            System.out.print(karakter);
        }
        System.out.println();
    }

    static void cetakKartuPegawai(String id, String nama, String divisi) {
        cetakGarisPemisah('=', 30);
        System.out.println("ID PEGAWAI : " + id);
        System.out.println("NAMA       : " + nama);
        System.out.println("DIVISI     : " + divisi);
        cetakGarisPemisah('=', 30);
    }

    public static void main(String[] args) {
        System.out.println("=== Method Void (Tanpa Nilai Kembali) ===");
        cetakKartuPegawai("PGW-001", "Bambang Pamungkas", "Teknologi Informasi");
    }
}
