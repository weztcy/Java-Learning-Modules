// Program praktis pemrosesan teks: menghitung jumlah kata, huruf vokal, dan karakter unik.
class TextProcessing {
    public static void main(String[] args) {
        System.out.println("=== Program Analisis Pemrosesan Teks ===");

        String artikel = "Bahasa Java dikembangkan oleh James Gosling di Sun Microsystems. Java bersifat portabel dan aman.";
        System.out.println("Teks Analisis: " + artikel);

        // Menghitung jumlah kata
        String[] kata = artikel.split("\\s+");
        int jumlahKata = kata.length;

        // Menghitung jumlah vokal
        int jumlahVokal = 0;
        String vokal = "aiueoAIUEO";
        for (char c : artikel.toCharArray()) {
            if (vokal.indexOf(c) != -1) {
                jumlahVokal++;
            }
        }

        System.out.println("\nHasil Analisis Teks:");
        System.out.println("1. Jumlah total karakter : " + artikel.length());
        System.out.println("2. Jumlah kata           : " + jumlahKata);
        System.out.println("3. Jumlah huruf vokal    : " + jumlahVokal);
    }
}
