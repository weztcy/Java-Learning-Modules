// Mendemonstrasikan anotasi bawaan Java: @Override, @Deprecated, dan @SuppressWarnings.
class Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("=== Java Built-in Annotations ===");

        LayananVersiLama layanan = new LayananVersiLama();
        layanan.metodeKuno(); // Memanggil metode bertanda @Deprecated
        layanan.metodeBaru();
    }
}

class LayananVersiLama {
    // @Deprecated menandai bahwa method sudah usang dan sebaiknya tidak digunakan lagi
    @Deprecated(since = "2.0", forRemoval = true)
    void metodeKuno() {
        System.out.println("PERINGATAN: Metode ini sudah using (@Deprecated).");
    }

    void metodeBaru() {
        System.out.println("Ini adalah implementasi metode baru yang direkomendasikan.");
    }
}
