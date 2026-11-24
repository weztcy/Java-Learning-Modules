// Mendemonstrasikan berbagai cara menelusuri elemen array (for tradisional vs enhanced for).
class ArrayIteration {
    public static void main(String[] args) {
        System.out.println("=== Iterasi Array ===");

        String[] buah = {"Apel", "Mangga", "Jeruk", "Pisang"};

        // Cara 1: Menggunakan for loop standar dengan indeks (berguna jika butuh nomor indeks)
        System.out.println("1. Iterasi Menggunakan for Loop Standar:");
        for (int i = 0; i < buah.length; i++) {
            System.out.println("   Buah indeks [" + i + "] = " + buah[i]);
        }

        // Cara 2: Menggunakan for-each loop yang lebih ringkas
        System.out.println("\n2. Iterasi Menggunakan Enhanced for-each Loop:");
        for (String item : buah) {
            System.out.println("   Nama Buah: " + item);
        }
    }
}
