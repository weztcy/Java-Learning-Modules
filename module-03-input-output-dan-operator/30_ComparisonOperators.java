// Mendemonstrasikan operator perbandingan yang menghasilkan nilai boolean (true/false).
class ComparisonOperators {
    public static void main(String[] args) {
        int nilaiA = 15;
        int nilaiB = 25;

        // Evaluasi kondisi hubungan antar dua nilai
        boolean samaDengan = (nilaiA == nilaiB);
        boolean tidakSama = (nilaiA != nilaiB);
        boolean lebihBesar = (nilaiA > nilaiB);
        boolean lebihKecil = (nilaiA < nilaiB);
        boolean lebihBesarSama = (nilaiA >= 15);
        boolean lebihKecilSama = (nilaiB <= 25);

        System.out.println("=== Operator Perbandingan ===");
        System.out.println("A = " + nilaiA + ", B = " + nilaiB);
        System.out.println("A == B : " + samaDengan);
        System.out.println("A != B : " + tidakSama);
        System.out.println("A > B  : " + lebihBesar);
        System.out.println("A < B  : " + lebihKecil);
        System.out.println("A >= 15: " + lebihBesarSama);
        System.out.println("B <= 25: " + lebihKecilSama);
    }
}
