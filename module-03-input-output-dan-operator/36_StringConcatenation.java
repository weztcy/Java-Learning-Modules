// Mendemonstrasikan penggabungan string menggunakan operator '+' dan method .concat().
class StringConcatenation {
    public static void main(String[] args) {
        String kata1 = "Pemrograman";
        String kata2 = "Java";
        int versi = 17;

        // Penggabungan string dengan operator '+' otomatis mengubah tipe primitif menjadi String
        String hasilPlus = kata1 + " " + kata2 + " Versi " + versi;

        // Penggabungan menggunakan method bawaan concat()
        String hasilConcat = kata1.concat(" ").concat(kata2);

        System.out.println("=== Penggabungan String (Concatenation) ===");
        System.out.println("Hasil operator '+'     : " + hasilPlus);
        System.out.println("Hasil method .concat() : " + hasilConcat);
    }
}
