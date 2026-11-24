// Mendemonstrasikan aturan penamaan identifier (variabel, class, method) di Java.
class JavaIdentifiers {
    public static void main(String[] args) {
        // Identifier variabel mengikuti konvensi camelCase
        int totalSkorSiswa = 95;
        double _nilaiRataRata = 88.5; // Karakter underscore diperbolehkan di awal
        String $namaMataKuliah = "Pemrograman Java"; // Karakter dollar diperbolehkan tetapi jarang digunakan

        // Menampilkan nilai dari identifier yang valid
        System.out.println("Mata Kuliah : " + $namaMataKuliah);
        System.out.println("Total Skor  : " + totalSkorSiswa);
        System.out.println("Rata-Rata   : " + _nilaiRataRata);
        System.out.println("Catatan     : Identifier tidak boleh diawali angka dan tidak boleh menggunakan kata kunci Java.");
    }
}
