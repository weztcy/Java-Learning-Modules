// Mendemonstrasikan final methods yang tidak dapat dioverride (ditimpa) oleh subclass.
class FinalMethods {
    public static void main(String[] args) {
        System.out.println("=== Final Methods ===");

        SubClassAman anak = new SubClassAman();
        anak.metodeBiasa();
        anak.metodeKeamananKritis();
    }
}

class IndukAman {
    void metodeBiasa() {
        System.out.println("Induk: Metode biasa dapat di-override.");
    }

    // Method final melarang subclass mengubah implementasi logika internalnya
    final void metodeKeamananKritis() {
        System.out.println("Induk: Ini adalah metode keamanan kritis (FINAL, tidak dapat di-override).");
    }
}

class SubClassAman extends IndukAman {
    @Override
    void metodeBiasa() {
        System.out.println("SubClass: Meng-override metode biasa.");
    }
    // Mencoba override metodeKeamananKritis() akan menghasilkan compile error
}
