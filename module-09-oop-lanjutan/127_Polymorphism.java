// Mendemonstrasikan polimorfisme: referensi superclass memperlakukan berbagai jenis subclass secara seragam.
class Polymorphism {
    public static void main(String[] args) {
        System.out.println("=== Polimorfisme (Polymorphism) ===");

        // Array berjenis referensi superclass BangunDatar
        BangunDatar[] kumpulanBentuk = {
            new Persegi(4.0),
            new LingkaranPoli(7.0),
            new Persegi(6.0)
        };

        for (BangunDatar bentuk : kumpulanBentuk) {
            System.out.printf("Bentuk: %-15s | Luas: %.2f satuan%n", bentuk.getNamaBentuk(), bentuk.hitungLuas());
        }
    }
}

class BangunDatar {
    String getNamaBentuk() {
        return "Bentuk Umum";
    }

    double hitungLuas() {
        return 0.0;
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    String getNamaBentuk() {
        return "Persegi (" + sisi + "x" + sisi + ")";
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}

class LingkaranPoli extends BangunDatar {
    double r;

    LingkaranPoli(double r) {
        this.r = r;
    }

    @Override
    String getNamaBentuk() {
        return "Lingkaran (r=" + r + ")";
    }

    @Override
    double hitungLuas() {
        return Math.PI * r * r;
    }
}
