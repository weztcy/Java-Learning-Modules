// Mendemonstrasikan konsep Interface murni sebagai kontrak perilaku (behaviour contract) di Java.
class Interfaces {
    public static void main(String[] args) {
        System.out.println("=== Pengenalan Interface ===");

        // Mengakses konstanta publik interface secara langsung
        System.out.println("Protokol Standar: " + BisaDiisiDaya.STANDAR_KONEKTOR);
        System.out.println("Tegangan Maks   : " + BisaDiisiDaya.TEGANGAN_MAKSIMAL + " Volt");
    }
}

// Interface mendefinisikan konstanta (public static final) dan abstract method (public abstract)
interface BisaDiisiDaya {
    String STANDAR_KONEKTOR = "USB Type-C"; // Otomatis public static final
    int TEGANGAN_MAKSIMAL = 20;

    void isiDaya(int watt); // Otomatis public abstract
}
