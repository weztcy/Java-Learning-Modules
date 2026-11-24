// Mendemonstrasikan pembuatan Universal Unique Identifier (UUID versi 4) acak 128-bit.
import java.util.UUID;

class UUIDGeneration {
    public static void main(String[] args) {
        System.out.println("=== Pembuatan UUID (Universally Unique Identifier) ===");

        // Menghasilkan UUID acak (versi 4 berbasis entropi pseudorandom aman)
        UUID idTransaksi1 = UUID.randomUUID();
        UUID idTransaksi2 = UUID.randomUUID();

        System.out.println("ID Transaksi 1 : " + idTransaksi1);
        System.out.println("ID Transaksi 2 : " + idTransaksi2);
        System.out.println("Panjang String : " + idTransaksi1.toString().length() + " karakter (36 termasuk tanda minus)");
        System.out.println("Varian UUID    : " + idTransaksi1.variant());
    }
}
