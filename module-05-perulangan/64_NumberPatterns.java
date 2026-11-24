// Program praktis mencetak pola segitiga angka dan piramida karakter bintang (*).
class NumberPatterns {
    public static void main(String[] args) {
        int tinggi = 5;

        System.out.println("=== Pola Segitiga Angka ===");
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n=== Pola Segitiga Bintang Terbalik ===");
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
