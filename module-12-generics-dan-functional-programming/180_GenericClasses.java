// Mendemonstrasikan pembuatan Generic Class dengan parameter tipe <T>.
class GenericClasses {
    public static void main(String[] args) {
        System.out.println("=== Pembuatan Generic Class ===");

        // Menggunakan KotakGenerik untuk tipe String
        KotakGenerik<String> kotakTeks = new KotakGenerik<>("Buku Catatan Pemrograman");
        System.out.println("Isi Kotak Teks  : " + kotakTeks.getKonten());

        // Menggunakan KotakGenerik untuk tipe Integer
        KotakGenerik<Integer> kotakAngka = new KotakGenerik<>(2026);
        System.out.println("Isi Kotak Angka : " + kotakAngka.getKonten());
    }
}

// Generic Class dengan tipe parameter T (Type)
class KotakGenerik<T> {
    private T konten;

    KotakGenerik(T konten) {
        this.konten = konten;
    }

    public T getKonten() {
        return konten;
    }

    public void setKonten(T konten) {
        this.konten = konten;
    }
}
