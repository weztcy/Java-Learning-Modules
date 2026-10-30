// Program praktis mencari nilai terendah (minimum) dan nilai tertinggi (maksimum) dalam array.
class ArrayMinMax {
    public static void main(String[] args) {
        System.out.println("=== Nilai Minimum dan Maksimum Array ===");

        int[] dataAngka = {45, 12, 89, 23, 67, 98, 5, 74};

        // Asumsikan elemen pertama adalah min dan max awal
        int nilaiMin = dataAngka[0];
        int nilaiMax = dataAngka[0];

        // Bandingkan dengan setiap elemen lainnya
        for (int i = 1; i < dataAngka.length; i++) {
            if (dataAngka[i] < nilaiMin) {
                nilaiMin = dataAngka[i];
            }
            if (dataAngka[i] > nilaiMax) {
                nilaiMax = dataAngka[i];
            }
        }

        System.out.println("Nilai Minimum Ditemukan: " + nilaiMin);
        System.out.println("Nilai Maksimum Ditemukan: " + nilaiMax);
    }
}
