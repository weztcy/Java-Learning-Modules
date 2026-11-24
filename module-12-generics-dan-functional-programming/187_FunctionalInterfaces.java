// Mendemonstrasikan Functional Interface dengan anotasi @FunctionalInterface (tepat satu abstract method).
class FunctionalInterfaces {
    public static void main(String[] args) {
        System.out.println("=== Functional Interface (@FunctionalInterface) ===");

        // Implementasi method tunggal menggunakan lambda
        TransformatorTeks pengubahKapital = teks -> teks.toUpperCase();
        TransformatorTeks penambahKurung = teks -> "[" + teks + "]";

        System.out.println(pengubahKapital.transformasi("pemrograman java"));
        System.out.println(penambahKurung.transformasi("Hasil Penting"));
    }
}

@FunctionalInterface
interface TransformatorTeks {
    String transformasi(String input); // Tepat satu abstract method

    // Boleh memiliki default atau static methods
    default void info() {
        System.out.println("Ini adalah Functional Interface kustom.");
    }
}
