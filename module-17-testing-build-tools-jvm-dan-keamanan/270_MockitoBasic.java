// Mendemonstrasikan teknik pembuatan mock object dengan pola Mockito untuk mengisolasi dependensi eksternal.
import java.util.HashMap;
import java.util.Map;

class MockitoBasic {
    public static void main(String[] args) {
        System.out.println("=== 270. Mocking Dependensi Eksternal (Konsep Mockito) ===");

        // Skenario: Menguji LayananPembayaran tanpa menghubungi Payment Gateway / Bank sungguhan
        // 1. Membuat Mock Object dari PaymentGateway
        PaymentGateway gatewayMock = new PaymentGatewayMock();

        // 2. Menentukan perilaku mock (stubbing): when(gateway.proses(101, 250000.0)).thenReturn(true)
        ((PaymentGatewayMock) gatewayMock).aturRespon(101, 250000.0, true);

        // 3. Menyuntikkan mock ke dalam class yang diuji
        LayananPembayaran layanan = new LayananPembayaran(gatewayMock);

        System.out.println("Menjalankan transaksi pembayaran pelanggan ID 101 sejumlah Rp 250.000...");
        boolean status = layanan.bayarPesanan(101, 250000.0);

        System.out.println("Status Pembayaran: " + (status ? "SUKSES" : "GAGAL"));

        // 4. Verifikasi pemanggilan method mock (verify)
        int jumlahPanggilan = ((PaymentGatewayMock) gatewayMock).getJumlahDipanggil(101);
        System.out.println("Verifikasi Mock: Method proses() dipanggil sebanyak " + jumlahPanggilan + " kali.");

        if (status && jumlahPanggilan == 1) {
            System.out.println("Uji unit dengan mock object tuntas dan berhasil terisolasi.");
        }
    }
}

// Interface dependensi eksternal (misalnya API Bank atau Payment Provider)
interface PaymentGateway {
    boolean proses(int idPelanggan, double nominal);
}

// Komponen logika bisnis yang diuji
class LayananPembayaran {
    private final PaymentGateway gateway;
    public LayananPembayaran(PaymentGateway gateway) { this.gateway = gateway; }

    public boolean bayarPesanan(int idPelanggan, double nominal) {
        if (nominal <= 0) return false;
        return gateway.proses(idPelanggan, nominal);
    }
}

// Mock buatan untuk merefleksikan kerja Mockito (Stubbing + Verification)
class PaymentGatewayMock implements PaymentGateway {
    private final Map<String, Boolean> aturanStub = new HashMap<>();
    private final Map<Integer, Integer> catatanVerifikasi = new HashMap<>();

    public void aturRespon(int idPelanggan, double nominal, boolean respon) {
        aturanStub.put(idPelanggan + ":" + nominal, respon);
    }

    @Override
    public boolean proses(int idPelanggan, double nominal) {
        catatanVerifikasi.put(idPelanggan, catatanVerifikasi.getOrDefault(idPelanggan, 0) + 1);
        return aturanStub.getOrDefault(idPelanggan + ":" + nominal, false);
    }

    public int getJumlahDipanggil(int idPelanggan) {
        return catatanVerifikasi.getOrDefault(idPelanggan, 0);
    }
}
