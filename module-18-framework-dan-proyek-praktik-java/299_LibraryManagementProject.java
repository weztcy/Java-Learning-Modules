// Proyek Praktik Konsol 4: Sistem Manajemen Perpustakaan (Katalog, Peminjaman, Denda, dan Pengembalian).
import java.util.ArrayList;
import java.util.List;

class LibraryManagementProject {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        System.out.println("        PROYEK 4: SISTEM MANAJEMEN PERPUSTAKAAN             ");
        System.out.println("=============================================================");

        PerpustakaanDaerah perpustakaan = new PerpustakaanDaerah();

        // 1. Koleksi Buku Awal
        System.out.println("-> 1. Mendaftarkan buku ke sistem katalog perpustakaan...");
        perpustakaan.tambahBuku(new BukuKoleksi("BK-01", "Clean Code", "Robert C. Martin", 2008));
        perpustakaan.tambahBuku(new BukuKoleksi("BK-02", "Effective Java", "Joshua Bloch", 2018));
        perpustakaan.tambahBuku(new BukuKoleksi("BK-03", "Design Patterns", "Gang of Four", 1994));
        perpustakaan.tambahBuku(new BukuKoleksi("BK-04", "Java: The Complete Reference", "Herbert Schildt", 2021));

        // 2. Menampilkan Katalog
        perpustakaan.tampilkanKatalog();

        // 3. Peminjaman Buku
        System.out.println("-> 2. Transaksi Peminjaman Buku:");
        perpustakaan.pinjamBuku("BK-01", "Farhan");
        perpustakaan.pinjamBuku("BK-02", "Gita");
        perpustakaan.pinjamBuku("BK-01", "Hendro"); // Gagal karena sedang dipinjam Farhan

        // 4. Menampilkan Status Katalog Setelah Peminjaman
        perpustakaan.tampilkanKatalog();

        // 5. Pengembalian Buku & Kalkulasi Denda
        System.out.println("-> 3. Pengembalian Buku & Perhitungan Denda Keterlambatan:");
        perpustakaan.kembalikanBuku("BK-01", 3); // Terlambat 3 hari (denda Rp 2.000 / hari)
        perpustakaan.kembalikanBuku("BK-02", 0); // Tepat waktu (tanpa denda)

        // 6. Katalog Akhir
        perpustakaan.tampilkanKatalog();
    }
}

class BukuKoleksi {
    private final String idBuku;
    private final String judul;
    private final String penulis;
    private final int tahunTerbit;
    private boolean sedangDipinjam = false;
    private String namaPeminjam = "-";

    public BukuKoleksi(String id, String judul, String penulis, int tahun) {
        this.idBuku = id; this.judul = judul; this.penulis = penulis; this.tahunTerbit = tahun;
    }
    public String getIdBuku() { return idBuku; }
    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public int getTahunTerbit() { return tahunTerbit; }
    public boolean isSedangDipinjam() { return sedangDipinjam; }
    public String getNamaPeminjam() { return namaPeminjam; }

    public void pinjam(String peminjam) {
        this.sedangDipinjam = true;
        this.namaPeminjam = peminjam;
    }

    public void kembalikan() {
        this.sedangDipinjam = false;
        this.namaPeminjam = "-";
    }
}

class PerpustakaanDaerah {
    private final List<BukuKoleksi> rakBuku = new ArrayList<>();
    private static final double TARIF_DENDA_PER_HARI = 2000.0;

    public void tambahBuku(BukuKoleksi b) {
        rakBuku.add(b);
        System.out.println("   [KATALOG] " + b.getIdBuku() + ": \"" + b.getJudul() + "\" oleh " + b.getPenulis());
    }

    public void tampilkanKatalog() {
        System.out.println("\n--- DAFTAR KOLEKSI BUKU PERPUSTAKAAN ---");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%-8s | %-30s | %-18s | %-12s%n", "KODE", "JUDUL BUKU", "PENULIS", "STATUS");
        System.out.println("---------------------------------------------------------------------------------");
        for (BukuKoleksi b : rakBuku) {
            String status = b.isSedangDipinjam() ? "DIPINJAM (" + b.getNamaPeminjam() + ")" : "TERSEDIA";
            System.out.printf("%-8s | %-30s | %-18s | %-12s%n", b.getIdBuku(), b.getJudul(), b.getPenulis(), status);
        }
        System.out.println("---------------------------------------------------------------------------------");
    }

    public void pinjamBuku(String id, String peminjam) {
        for (BukuKoleksi b : rakBuku) {
            if (b.getIdBuku().equalsIgnoreCase(id)) {
                if (!b.isSedangDipinjam()) {
                    b.pinjam(peminjam);
                    System.out.println("   [SUKSES] Buku \"" + b.getJudul() + "\" berhasil dipinjam oleh " + peminjam);
                } else {
                    System.out.println("   [DITOLAK] Buku \"" + b.getJudul() + "\" sedang dipinjam oleh " + b.getNamaPeminjam());
                }
                return;
            }
        }
    }

    public void kembalikanBuku(String id, int hariKeterlambatan) {
        for (BukuKoleksi b : rakBuku) {
            if (b.getIdBuku().equalsIgnoreCase(id)) {
                String peminjam = b.getNamaPeminjam();
                b.kembalikan();
                double denda = hariKeterlambatan * TARIF_DENDA_PER_HARI;
                System.out.printf("   [PENGEMBALIAN] Buku \"%s\" dikembalikan oleh %s.%n", b.getJudul(), peminjam);
                if (hariKeterlambatan > 0) {
                    System.out.printf("   [DENDA] Terlambat %d hari. Denda wajib bayar: Rp %,.2f%n", hariKeterlambatan, denda);
                } else {
                    System.out.println("   [STATUS] Dikembalikan tepat waktu tanpa denda.");
                }
                return;
            }
        }
    }
}
