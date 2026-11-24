// Mendemonstrasikan perbedaan ekspresi (expressions) dan pernyataan (statements) di Java.
class JavaStatements {
    public static void main(String[] args) {
        // Declaration statement: Mendeklarasikan tipe dan nama variabel
        int angkaA;

        // Assignment statement: Menetapkan nilai ke dalam variabel
        angkaA = 15;

        // Expression statement: Operasi perhitungan matematika yang menghasilkan nilai baru
        int angkaB = 25;
        int hasilJumlah = angkaA + angkaB;

        // Method invocation statement: Memanggil method untuk menampilkan hasil
        System.out.println("Nilai A      : " + angkaA);
        System.out.println("Nilai B      : " + angkaB);
        System.out.println("Hasil Jumlah : " + hasilJumlah);
    }
}
