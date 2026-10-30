// Mendemonstrasikan pembuatan tipe data terhitung (Enumeration) lengkap dengan constructor dan method.
class EnumTypes {
    public static void main(String[] args) {
        System.out.println("=== Java Enumeration (enum) ===");

        StatusPesanan status = StatusPesanan.DIKIRIM;

        System.out.println("Status saat ini : " + status);
        System.out.println("Kode Status     : " + status.getKode());
        System.out.println("Deskripsi       : " + status.getDeskripsi());

        System.out.println("\nDaftar Seluruh Status:");
        for (StatusPesanan s : StatusPesanan.values()) {
            System.out.printf(" [%d] %-10s : %s%n", s.getKode(), s.name(), s.getDeskripsi());
        }
    }
}

enum StatusPesanan {
    MENUNGGU_PEMBAYARAN(10, "Menunggu verifikasi dana pelanggan"),
    DIPROSES(20, "Pesanan sedang dikemas di gudang"),
    DIKIRIM(30, "Kurir sedang mengantar pesanan"),
    SELESAI(40, "Barang telah diterima oleh pembeli");

    private final int kode;
    private final String deskripsi;

    StatusPesanan(int kode, String deskripsi) {
        this.kode = kode;
        this.deskripsi = deskripsi;
    }

    public int getKode() { return kode; }
    public String getDeskripsi() { return deskripsi; }
}
