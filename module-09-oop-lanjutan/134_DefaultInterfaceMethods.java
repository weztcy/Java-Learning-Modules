// Mendemonstrasikan default methods pada interface untuk menambah fungsionalitas baru tanpa merusak implementasi lama.
class DefaultInterfaceMethods {
    public static void main(String[] args) {
        System.out.println("=== Default Methods pada Interface (Java 8+) ===");

        LayananPesan layanan = new LayananWhatsApp();
        layanan.kirimTeks("Halo, pesanan Anda telah dikirim!");
        // Memanggil default method yang disediakan langsung oleh interface
        layanan.kirimDenganEnkripsi("Pesan sangat rahasia");
    }
}

interface LayananPesan {
    void kirimTeks(String pesan);

    // Default method memiliki body implementasi bawaan
    default void kirimDenganEnkripsi(String pesan) {
        System.out.println("[DEFAULT ENKRIPSI] Mengamankan pesan '" + pesan + "' dengan AES-256 lalu mengirimkannya.");
    }
}

class LayananWhatsApp implements LayananPesan {
    @Override
    public void kirimTeks(String pesan) {
        System.out.println("WhatsApp: " + pesan);
    }
}
