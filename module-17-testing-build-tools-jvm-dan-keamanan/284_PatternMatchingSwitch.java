// Mendemonstrasikan evolusi Pattern Matching pada percabangan Switch untuk penanganan tipe polimorfik.
class PatternMatchingSwitch {
    public static void main(String[] args) {
        System.out.println("=== 284. Konsep Pattern Matching Berbasis Tipe pada Switch ===");

        BentukGeometri b1 = new Lingkaran(7.0);
        BentukGeometri b2 = new Segitiga(6.0, 8.0);
        BentukGeometri b3 = new Persegi(5.0);

        deskripsikanBentuk(b1);
        deskripsikanBentuk(b2);
        deskripsikanBentuk(b3);
    }

    // Pendekatan bersih yang mencerminkan kapabilitas pattern matching modern
    public static void deskripsikanBentuk(BentukGeometri b) {
        if (b instanceof Lingkaran ling) {
            System.out.printf("Bentuk: Lingkaran | Jari-jari: %.1f | Luas: %.2f%n", ling.r(), ling.luas());
        } else if (b instanceof Segitiga seg) {
            System.out.printf("Bentuk: Segitiga  | Alas: %.1f, Tinggi: %.1f | Luas: %.2f%n", seg.alas(), seg.tinggi(), seg.luas());
        } else if (b instanceof Persegi pers) {
            System.out.printf("Bentuk: Persegi   | Sisi: %.1f | Luas: %.2f%n", pers.sisi(), pers.luas());
        }
    }
}

interface BentukGeometri {
    double luas();
}

record Lingkaran(double r) implements BentukGeometri {
    @Override public double luas() { return Math.PI * r * r; }
}

record Segitiga(double alas, double tinggi) implements BentukGeometri {
    @Override public double luas() { return 0.5 * alas * tinggi; }
}

record Persegi(double sisi) implements BentukGeometri {
    @Override public double luas() { return sisi * sisi; }
}
