// Proyek Praktik Konsol 3: Sistem Inventaris Gudang Barang (Stok, Valuasi, dan Peringatan).
import java.util.ArrayList;
import java.util.List;

class InventoryManagementProject {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("        PROYEK 3: SISTEM MANAJEMEN INVENTARIS GUDANG        ");
        System.out.println("=============================================================");

        GudangInventaris gudang = new GudangInventaris();

        // 1. Memasukkan Barang Awal
        System.out.println("-> 1. Mendaftarkan barang ke gudang...");
        gudang.tambahBarang(new ItemBarang("BRG-01", "Laptop Core i7 16GB", "Elektronik", 15, 12500000.0));
        gudang.tambahBarang(new ItemBarang("BRG-02", "Monitor IPS 27 Inci", "Elektronik", 8, 3200000.0));
        gudang.tambahBarang(new ItemBarang("BRG-03", "Mouse Ergonomis", "Aksesoris", 3, 250000.0));
        gudang.tambahBarang(new ItemBarang("BRG-04", "Meja Kerja Kayu Jati", "Furniture", 4, 1800000.0));

        // 2. Menampilkan Status Gudang
        gudang.tampilkanInventaris();

        // 3. Mutasi Stok (Masuk & Keluar)
        System.out.println("-> 2. Melakukan Transaksi Mutasi Stok:");
        gudang.tambahStok("BRG-02", 5);  // Tambah stok monitor
        gudang.kurangStok("BRG-03", 2);  // Kurang stok mouse (tinggal 1 -> kritis!)

        // 4. Deteksi Peringatan Stok Kritis (Stok < 5)
        gudang.cekPeringatanStokKritis(5);

        // 5. Valuasi Total Aset Gudang
        gudang.tampilkanValuasiAset();
    }
}

class ItemBarang {
    private final String kode;
    private final String nama;
    private final String kategori;
    private int stok;
    private final double hargaSatuan;

    public ItemBarang(String kode, String nama, String kategori, int stok, double hargaSatuan) {
        this.kode = kode; this.nama = nama; this.kategori = kategori; this.stok = stok; this.hargaSatuan = hargaSatuan;
    }
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public String getKategori() { return kategori; }
    public int getStok() { return stok; }
    public double getHargaSatuan() { return hargaSatuan; }
    public void tambahStok(int jml) { this.stok += jml; }
    public boolean kurangStok(int jml) {
        if (jml > stok) return false;
        this.stok -= jml;
        return true;
    }
    public double hitungNilaiTotal() { return stok * hargaSatuan; }
}

class GudangInventaris {
    private final List<ItemBarang> daftarBarang = new ArrayList<>();

    public void tambahBarang(ItemBarang b) {
        daftarBarang.add(b);
        System.out.println("   [REGISTRASI] " + b.getKode() + " - " + b.getNama() + " (" + b.getStok() + " unit)");
    }

    public void tambahStok(String kode, int qty) {
        for (ItemBarang b : daftarBarang) {
            if (b.getKode().equalsIgnoreCase(kode)) {
                b.tambahStok(qty);
                System.out.println("   [STOK MASUK] " + b.getNama() + " +" + qty + " unit. Stok saat ini: " + b.getStok());
                return;
            }
        }
    }

    public void kurangStok(String kode, int qty) {
        for (ItemBarang b : daftarBarang) {
            if (b.getKode().equalsIgnoreCase(kode)) {
                if (b.kurangStok(qty)) {
                    System.out.println("   [STOK KELUAR] " + b.getNama() + " -" + qty + " unit. Sisa: " + b.getStok());
                } else {
                    System.out.println("   [GAGAL] Stok tidak mencukupi untuk pengurangan " + qty + " unit.");
                }
                return;
            }
        }
    }

    public void cekPeringatanStokKritis(int batasMin) {
        System.out.println("\n--- PERINGATAN: ITEM STOK MENIPIS (< " + batasMin + " UNIT) ---");
        boolean adaKritis = false;
        for (ItemBarang b : daftarBarang) {
            if (b.getStok() < batasMin) {
                System.out.printf("   [PERINGATAN] %-8s | %-22s | Stok Sisa: %d UNIT!%n", b.getKode(), b.getNama(), b.getStok());
                adaKritis = true;
            }
        }
        if (!adaKritis) System.out.println("   Seluruh stok dalam kondisi aman di atas batas minimum.");
    }

    public void tampilkanInventaris() {
        System.out.println("\n--- DAFTAR INVENTARIS BARANG DI GUDANG ---");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-8s | %-24s | %-12s | %-6s | %-15s%n", "KODE", "NAMA BARANG", "KATEGORI", "STOK", "HARGA SATUAN");
        System.out.println("---------------------------------------------------------------------------------");
        for (ItemBarang b : daftarBarang) {
            System.out.printf("%-8s | %-24s | %-12s | %-6d | Rp %,12.2f%n",
                    b.getKode(), b.getNama(), b.getKategori(), b.getStok(), b.getHargaSatuan());
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

    public void tampilkanValuasiAset() {
        double totalValuasi = 0;
        for (ItemBarang b : daftarBarang) totalValuasi += b.hitungNilaiTotal();
        System.out.println("\n--- VALUASI TOTAL ASET GUDANG ---");
        System.out.printf("Total Nilai Finansial Barang Tersimpan: Rp %,15.2f%n", totalValuasi);
    }
}
