// Mendemonstrasikan kegunaan kata kunci this untuk mengatasi penutupan variabel (variable shadowing).
class ThisKeyword {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan Keyword this ===");

        TitikKoordinat titik = new TitikKoordinat(15, 25);
        titik.cetakKoordinat();
    }
}

class TitikKoordinat {
    int x; // Instance variable
    int y; // Instance variable

    // Nama parameter sengaja sama dengan instance variable (shadowing)
    TitikKoordinat(int x, int y) {
        // Keyword 'this.x' merujuk eksplisit ke instance variable milik objek saat ini
        this.x = x;
        this.y = y;
    }

    void cetakKoordinat() {
        System.out.println("Titik Posisi: (" + this.x + ", " + this.y + ")");
    }
}
