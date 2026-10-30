// Mendemonstrasikan fitur modern Java 16+: Pattern Matching untuk operator instanceof tanpa explicit casting manual.
class PatternMatchingInstanceof {
    public static void main(String[] args) {
        System.out.println("=== 283. Pattern Matching untuk 'instanceof' (Java 16+) ===");

        Object[] koleksiObjek = {
            "Selamat Datang di Pemrograman Modern",
            Integer.valueOf(2024),
            Double.valueOf(98.75),
            new PersegiPanjang(10, 5)
        };

        for (Object item : koleksiObjek) {
            prosesItem(item);
        }
    }

    public static void prosesItem(Object obj) {
        // Pada Java 16+, variabel pattern langsung dideklarasikan di sebelah kanan operator instanceof
        if (obj instanceof String teks) {
            System.out.println("Tipe: String | Panjang: " + teks.length() + " karakter | Huruf Besar: " + teks.toUpperCase());
        } else if (obj instanceof Integer angka) {
            System.out.println("Tipe: Integer | Nilai kuadrat: " + (angka * angka));
        } else if (obj instanceof Double desimal) {
            System.out.printf("Tipe: Double | Nilai diskon: %.2f%n", desimal * 0.9);
        } else if (obj instanceof PersegiPanjang pp) {
            System.out.println("Tipe: PersegiPanjang | Luas: " + pp.hitungLuas());
        } else {
            System.out.println("Tipe tidak dikenal.");
        }
    }
}

class PersegiPanjang {
    private final int p;
    private final int l;
    public PersegiPanjang(int p, int l) { this.p = p; this.l = l; }
    public int hitungLuas() { return p * l; }
}
