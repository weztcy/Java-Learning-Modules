// Mendemonstrasikan deklarasi Generic Method yang dapat menerima argumen array dari berbagai tipe.
class GenericMethods {
    public static void main(String[] args) {
        System.out.println("=== Generic Methods ===");

        Integer[] dataAngka = {1, 2, 3, 4, 5};
        String[] dataKata = {"Satu", "Dua", "Tiga"};
        Double[] dataDesimal = {1.1, 2.2, 3.3};

        System.out.print("Array Integer : ");
        cetakElemenArray(dataAngka);

        System.out.print("Array String  : ");
        cetakElemenArray(dataKata);

        System.out.print("Array Double  : ");
        cetakElemenArray(dataDesimal);
    }

    // Generic method dengan type parameter <E> sebelum return type
    static <E> void cetakElemenArray(E[] arrayInput) {
        for (E elemen : arrayInput) {
            System.out.print(elemen + " ");
        }
        System.out.println();
    }
}
