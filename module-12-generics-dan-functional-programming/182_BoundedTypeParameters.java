// Mendemonstrasikan Bounded Type Parameters (<T extends Number>) untuk membatasi tipe data generik.
class BoundedTypeParameters {
    public static void main(String[] args) {
        System.out.println("=== Bounded Type Parameters (<T extends Number>) ===");

        // Tipe Integer dan Double adalah turunan dari class Number
        KalkulatorStatistik<Integer> statInt = new KalkulatorStatistik<>(new Integer[]{10, 20, 30, 40});
        System.out.printf("Rata-rata Integer : %.2f%n", statInt.hitungRataRata());

        KalkulatorStatistik<Double> statDouble = new KalkulatorStatistik<>(new Double[]{2.5, 3.5, 4.0});
        System.out.printf("Rata-rata Double  : %.2f%n", statDouble.hitungRataRata());

        // KalkulatorStatistik<String> statStr; // COMPILE ERROR: String bukan turunan Number
    }
}

class KalkulatorStatistik<T extends Number> {
    private T[] kumpulanNilai;

    KalkulatorStatistik(T[] nilai) {
        this.kumpulanNilai = nilai;
    }

    double hitungRataRata() {
        double total = 0.0;
        for (T nilai : kumpulanNilai) {
            // Karena dibatasi extends Number, method doubleValue() dijamin tersedia
            total += nilai.doubleValue();
        }
        return total / kumpulanNilai.length;
    }
}
