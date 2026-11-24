// Mendemonstrasikan kegunaan kata kunci super untuk memanggil constructor dan method milik superclass.
class SuperKeyword {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan Keyword super ===");

        AnakSuper anak = new AnakSuper("Warisan Utama", "Fitur Tambahan Anak");
        anak.tampilkanPesan();
    }
}

class IndukSuper {
    String propertiInduk;

    IndukSuper(String properti) {
        this.propertiInduk = properti;
        System.out.println("-> Constructor IndukSuper dieksekusi.");
    }

    void sapa() {
        System.out.println("Salam dari method IndukSuper.");
    }
}

class AnakSuper extends IndukSuper {
    String propertiAnak;

    AnakSuper(String propInduk, String propAnak) {
        // Memanggil constructor superclass harus diletakkan pada baris pertama
        super(propInduk);
        this.propertiAnak = propAnak;
        System.out.println("-> Constructor AnakSuper dieksekusi.");
    }

    void tampilkanPesan() {
        // Memanggil method milik superclass secara eksplisit
        super.sapa();
        System.out.println("Properti Induk : " + super.propertiInduk);
        System.out.println("Properti Anak  : " + this.propertiAnak);
    }
}
