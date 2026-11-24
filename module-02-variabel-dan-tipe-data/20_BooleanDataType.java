// Mendemonstrasikan karakteristik tipe data boolean yang hanya bernilai true atau false.
class BooleanDataType {
    public static void main(String[] args) {
        // Boolean digunakan untuk pengambilan keputusan kondisi logis
        boolean lampuMenyala = true;
        boolean pintuTerkunci = false;

        // Hasil ekspresi perbandingan juga menghasilkan nilai bertipe boolean
        int batasUsia = 17;
        int usiaPengunjung = 19;
        boolean cukupUmur = usiaPengunjung >= batasUsia;

        System.out.println("=== Tipe Data Primitif: boolean ===");
        System.out.println("Lampu Menyala   : " + lampuMenyala);
        System.out.println("Pintu Terkunci  : " + pintuTerkunci);
        System.out.println("Apakah Cukup Umur? " + cukupUmur);
    }
}
