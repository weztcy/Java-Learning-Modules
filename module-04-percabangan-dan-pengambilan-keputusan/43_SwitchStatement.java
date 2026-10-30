// Mendemonstrasikan percabangan nilai diskret menggunakan pernyataan switch tradisional.
class SwitchStatement {
    public static void main(String[] args) {
        int nomorHari = 3;

        System.out.println("=== Pernyataan switch Tradisional ===");
        System.out.print("Hari ke-" + nomorHari + " adalah: ");

        // Switch mencocokkan nilai variabel dengan label case
        switch (nomorHari) {
            case 1:
                System.out.println("Senin");
                break; // Break mencegah eksekusi berlanjut (fall-through) ke case berikutnya
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Nomor hari tidak valid (harus 1-7).");
                break;
        }
    }
}
