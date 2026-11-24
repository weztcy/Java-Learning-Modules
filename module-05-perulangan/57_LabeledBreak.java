// Mendemonstrasikan penghentian perulangan luar dari dalam perulangan bersarang dengan labeled break.
class LabeledBreak {
    public static void main(String[] args) {
        System.out.println("=== Labeled break ===");

        // Label 'loopLuar' menandai perulangan baris terluar
        loopLuar:
        for (int baris = 1; baris <= 4; baris++) {
            for (int kolom = 1; kolom <= 4; kolom++) {
                System.out.println("Baris: " + baris + ", Kolom: " + kolom);

                // Menghentikan seluruh proses perulangan tingkat terluar jika kondisi kritis tercapai
                if (baris == 2 && kolom == 3) {
                    System.out.println("-> Kondisi tercapai pada (2,3). Menghentikan loopLuar!");
                    break loopLuar;
                }
            }
        }

        System.out.println("Eksekusi keluar dari kedua perulangan.");
    }
}
