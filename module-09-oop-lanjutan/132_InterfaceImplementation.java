// Mendemonstrasikan implementasi interface pada class nyata dengan kata kunci implements.
class InterfaceImplementation {
    public static void main(String[] args) {
        System.out.println("=== Implementasi Interface (implements) ===");

        PembayaranTagihan bayar = new PembayaranKartuKredit();
        bayar.prosesPembayaran(750000);
        bayar.kirimKuitansi("pelanggan@mail.com");
    }
}

interface PembayaranTagihan {
    void prosesPembayaran(double nominal);
    void kirimKuitansi(String emailTujuan);
}

class PembayaranKartuKredit implements PembayaranTagihan {
    @Override
    public void prosesPembayaran(double nominal) {
        System.out.printf("Memproses otorisasi kartu kredit sebesar Rp %,.2f via Payment Gateway.%n", nominal);
    }

    @Override
    public void kirimKuitansi(String emailTujuan) {
        System.out.println("Bukti pembayaran berhasil dikirimkan ke: " + emailTujuan);
    }
}
