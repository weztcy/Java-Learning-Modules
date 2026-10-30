// Mendemonstrasikan Anonymous Class: implementasi interface atau class langsung on-the-fly tanpa nama class eksplisit.
class AnonymousClasses {
    public static void main(String[] args) {
        System.out.println("=== Anonymous Inner Class ===");

        // Mendefinisikan implementasi interface TombolAksi secara on-the-fly (tanpa membuat class file baru)
        TombolAksi tombolSimpan = new TombolAksi() {
            @Override
            public void saatDiklik() {
                System.out.println("-> [Aksi Anonymous]: Data pengguna berhasil disimpan ke basis data!");
            }
        };

        TombolAksi tombolBatal = new TombolAksi() {
            @Override
            public void saatDiklik() {
                System.out.println("-> [Aksi Anonymous]: Formulir dibatalkan.");
            }
        };

        // Menjalankan event
        tombolSimpan.saatDiklik();
        tombolBatal.saatDiklik();
    }
}

interface TombolAksi {
    void saatDiklik();
}
