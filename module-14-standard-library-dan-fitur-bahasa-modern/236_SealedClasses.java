// Mendemonstrasikan Sealed Classes (Java 17) untuk membatasi class mana saja yang diizinkan mewarisi class ini.
class SealedClasses {
    public static void main(String[] args) {
        System.out.println("=== Sealed Classes (Java 17 Permitted Inheritance) ===");

        BentukSealed b1 = new LingkaranSealed(5.0);
        BentukSealed b2 = new PersegiSealed(4.0);

        System.out.printf("Luas Lingkaran: %.2f%n", b1.hitungLuas());
        System.out.printf("Luas Persegi  : %.2f%n", b2.hitungLuas());
        System.out.println("Catatan: Hanya LingkaranSealed dan PersegiSealed yang diizinkan mewarisi BentukSealed.");
    }
}

// Sealed class mendeklarasikan daftar subclass yang diizinkan dengan kata kunci 'permits'
abstract sealed class BentukSealed permits LingkaranSealed, PersegiSealed {
    abstract double hitungLuas();
}

// Subclass dari sealed class wajib berstatus final, sealed, atau non-sealed
final class LingkaranSealed extends BentukSealed {
    final double radius;

    LingkaranSealed(double r) { this.radius = r; }

    @Override
    double hitungLuas() { return Math.PI * radius * radius; }
}

final class PersegiSealed extends BentukSealed {
    final double sisi;

    PersegiSealed(double s) { this.sisi = s; }

    @Override
    double hitungLuas() { return sisi * sisi; }
}
