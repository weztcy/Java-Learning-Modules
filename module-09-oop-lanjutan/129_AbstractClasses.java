// Mendemonstrasikan Abstract Class sebagai kerangka dasar yang tidak dapat diinstansiasi langsung.
class AbstractClasses {
    public static void main(String[] args) {
        System.out.println("=== Abstract Class ===");

        // DokumenDigital doc = new DokumenDigital(); // COMPILE ERROR: class abstrak tidak dapat di-instantiate!
        DokumenDigital pdf = new DokumenPDF("Laporan_Keuangan_2026.pdf");
        pdf.bukaFile();
        pdf.cetakKeKertas();
    }
}

abstract class DokumenDigital {
    String namaFile;

    DokumenDigital(String namaFile) {
        this.namaFile = namaFile;
    }

    // Concrete method (memiliki body implementasi) yang diwariskan langsung
    void bukaFile() {
        System.out.println("Membuka file '" + namaFile + "' dari memori penyimpanan.");
    }

    // Abstract method: wajib diisi oleh subclass
    abstract void cetakKeKertas();
}

class DokumenPDF extends DokumenDigital {
    DokumenPDF(String namaFile) {
        super(namaFile);
    }

    @Override
    void cetakKeKertas() {
        System.out.println("Merender halaman PDF '" + namaFile + "' ke printer laser warna.");
    }
}
