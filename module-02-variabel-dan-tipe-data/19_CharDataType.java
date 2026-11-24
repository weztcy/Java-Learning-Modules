// Mendemonstrasikan karakteristik tipe data char (16-bit Unicode character).
class CharDataType {
    public static void main(String[] args) {
        // Char menyimpan satu karakter yang diapit tanda petik tunggal atau kode escape
        char hurufA = 'A';
        char tandaSeru = '!';
        char karakterTab = '\t'; // Escape character tab

        // Konversi char ke representasi integer kode ASCII/Unicode
        int kodeAsciiA = hurufA;

        System.out.println("=== Tipe Data Primitif: char (16-bit Unicode) ===");
        System.out.println("Huruf Alfabet      : " + hurufA);
        System.out.println("Tanda Baca         : " + tandaSeru);
        System.out.println("Kode ASCII/Unicode : " + kodeAsciiA);
        System.out.println("Uji escape tab     :" + karakterTab + "[Teks Setelah Tab]");
    }
}
