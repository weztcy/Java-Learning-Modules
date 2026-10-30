// Mendemonstrasikan peloncatan ke iterasi berikutnya dari perulangan luar dengan labeled continue.
class LabeledContinue {
    public static void main(String[] args) {
        System.out.println("=== Labeled continue ===");

        // Label 'perulanganBaris' pada loop luar
        perulanganBaris:
        for (int baris = 1; baris <= 3; baris++) {
            System.out.print("Baris " + baris + ": ");

            for (int kolom = 1; kolom <= 4; kolom++) {
                // Jika kolom == 2, langsung lompat ke baris berikutnya tanpa memproses sisa kolom
                if (kolom == 2) {
                    System.out.print("[Skip Kolom " + kolom + "] ");
                    continue perulanganBaris;
                }
                System.out.print("K" + kolom + " ");
            }
            System.out.println();
        }

        System.out.println("\nPerulangan selesai.");
    }
}
