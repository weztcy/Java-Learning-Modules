// Mendemonstrasikan pengujian integrasi (Integration Testing) yang menguji kolaborasi beberapa komponen nyata.
import java.util.ArrayList;
import java.util.List;

class IntegrationTesting {
    public static void main(String[] args) {
        System.out.println("=== 271. Pengujian Integrasi (Integration Testing) ===");

        // Menguji alur lengkap: Repository nyata -> Service nyata -> Controller nyata
        KatalogRepository repository = new KatalogRepository();
        KatalogService service = new KatalogService(repository);
        KatalogController controller = new KatalogController(service);

        System.out.println("-> Tahap 1: Registrasi produk baru melalui Controller");
        String respon1 = controller.tambahProduk("Laptop Gaming Ultra", 15000000.0);
        String respon2 = controller.tambahProduk("Mouse Wireless Ergonomis", 350000.0);
        System.out.println("   Respon Controller 1: " + respon1);
        System.out.println("   Respon Controller 2: " + respon2);

        System.out.println("\n-> Tahap 2: Pengujian Integrasi Query Data");
        List<ProdukItem> hasil = controller.ambilSemuaProduk();
        System.out.println("   Jumlah item di katalog: " + hasil.size());
        for (ProdukItem item : hasil) {
            System.out.println("   - " + item);
        }

        System.out.println("\n-> Tahap 3: Validasi Integritas Data End-to-End");
        if (hasil.size() == 2 && hasil.get(0).getHarga() == 15000000.0) {
            System.out.println("   [PASS] Seluruh lapisan (Controller -> Service -> Repository) terintegrasi dengan harmonis.");
        }
    }
}

class ProdukItem {
    private final int id;
    private final String nama;
    private final double harga;
    public ProdukItem(int id, String nama, double harga) {
        this.id = id; this.nama = nama; this.harga = harga;
    }
    public int getId() { return id; }
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    @Override public String toString() {
        return String.format("[ID: %d] %-25s | Rp %,12.2f", id, nama, harga);
    }
}

class KatalogRepository {
    private final List<ProdukItem> database = new ArrayList<>();
    public void simpan(ProdukItem p) { database.add(p); }
    public List<ProdukItem> temukanSemua() { return new ArrayList<>(database); }
}

class KatalogService {
    private final KatalogRepository repo;
    private int idCounter = 1;
    public KatalogService(KatalogRepository repo) { this.repo = repo; }
    public ProdukItem daftarkanProduk(String nama, double harga) {
        if (harga <= 0) throw new IllegalArgumentException("Harga harus bernilai positif!");
        ProdukItem baru = new ProdukItem(idCounter++, nama, harga);
        repo.simpan(baru);
        return baru;
    }
    public List<ProdukItem> dapatkanDaftar() { return repo.temukanSemua(); }
}

class KatalogController {
    private final KatalogService service;
    public KatalogController(KatalogService service) { this.service = service; }
    public String tambahProduk(String nama, double harga) {
        ProdukItem item = service.daftarkanProduk(nama, harga);
        return "BERHASIL: Produk " + item.getNama() + " tercatat dengan ID " + item.getId();
    }
    public List<ProdukItem> ambilSemuaProduk() { return service.dapatkanDaftar(); }
}
