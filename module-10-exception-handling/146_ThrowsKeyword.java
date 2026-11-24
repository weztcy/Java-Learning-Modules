// Mendemonstrasikan kata kunci throws pada deklarasi method untuk meneruskan tanggung jawab penanganan ke pemanggil.
import java.io.IOException;

class ThrowsKeyword {
    public static void main(String[] args) {
        System.out.println("=== Deklarasi throws pada Method ===");

        // Method main bertanggung jawab menangani IOException yang dideklarasikan oleh bacaFileKritis()
        try {
            bacaFileKritis("data_transaksi.txt");
        } catch (IOException e) {
            System.out.println("-> Main berhasil menangani exception: " + e.getMessage());
        }
    }

    // Keyword throws memberitahukan compiler bahwa method ini berpotensi memicu IOException
    static void bacaFileKritis(String namaFile) throws IOException {
        System.out.println("Mencoba mengakses file: " + namaFile);
        throw new IOException("Berkas '" + namaFile + "' tidak ditemukan pada direktori penyimpanan!");
    }
}
