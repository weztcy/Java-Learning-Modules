// Mendemonstrasikan prinsip Komposisi (Composition): hubungan erat 'has-a' di mana bagian tidak dapat hidup tanpa induknya.
class Composition {
    public static void main(String[] args) {
        System.out.println("=== Hubungan Komposisi (Composition: Strong Has-A) ===");

        MobilKomposisi mobil = new MobilKomposisi("V8 Twin-Turbo");
        mobil.jalankanMobil();
    }
}

class MesinMobil {
    private String tipe;

    MesinMobil(String tipe) {
        this.tipe = tipe;
    }

    void nyalakan() {
        System.out.println("Mesin bertipe " + tipe + " menyala dengan bertenaga.");
    }
}

class MobilKomposisi {
    // Mesin diciptakan bersamaan dengan pembuatan Mobil (ikatan erat / siklus hidup terikat)
    private final MesinMobil mesin;

    MobilKomposisi(String tipeMesin) {
        this.mesin = new MesinMobil(tipeMesin);
    }

    void jalankanMobil() {
        mesin.nyalakan();
        System.out.println("Mobil bergerak melaju di jalan raya.");
    }
}
