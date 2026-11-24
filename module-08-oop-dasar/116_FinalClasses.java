// Mendemonstrasikan final classes yang tidak dapat dijadikan superclass (tidak dapat diwarisi).
class FinalClasses {
    public static void main(String[] args) {
        System.out.println("=== Final Classes ===");

        KelasKriptoKeamanan kripto = new KelasKriptoKeamanan();
        kripto.enkripsi("Data Rahasia Perusahaan");
        System.out.println("Catatan: Class String bawaan Java (java.lang.String) juga dideklarasikan sebagai final class.");
    }
}

// Final class mencegah pewarisan untuk menjaga keutuhan keamanan dan immutability
final class KelasKriptoKeamanan {
    void enkripsi(String data) {
        System.out.println("Mengenkripsi data: '" + data + "' dengan algoritma aman.");
    }
}
