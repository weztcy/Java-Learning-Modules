// Proyek Praktik Terpadu 5: Proyek REST API Lengkap (Controller, Service, Repository, DTO, Exception Handling).
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class SpringBootRestAPIProject {
    public static void main(String[] args) {
        System.out.println("=================================================================");
        System.out.println("    PROYEK 5: ARSITEKTUR REST API LENGKAP SPRING BOOT (END-TO-END)   ");
        System.out.println("=================================================================\n");

        // Perakitan komponen arsitektur berlapis (Layered Architecture)
        BarangRepository repository = new InMemoryBarangRepository();
        BarangService service = new BarangServiceImpl(repository);
        BarangRestController controller = new BarangRestController(service);

        // 1. POST /api/v1/barang (CREATE)
        System.out.println("--- 1. POST /api/v1/barang (Membuat Data Produk Baru) ---");
        System.out.println(controller.tambahBarang(new BarangRequestDTO("MacBook Pro M3", 28000000.0, 10)));
        System.out.println(controller.tambahBarang(new BarangRequestDTO("Magic Mouse Wireless", 1250000.0, 25)));

        // 2. GET /api/v1/barang (READ ALL)
        System.out.println("\n--- 2. GET /api/v1/barang (Mendapatkan Semua Data) ---");
        System.out.println(controller.ambilSemuaBarang());

        // 3. GET /api/v1/barang/{id} (READ BY ID)
        System.out.println("\n--- 3. GET /api/v1/barang/1 (Mendapatkan Data Berdasarkan ID) ---");
        System.out.println(controller.ambilBarangBerdasarkanId(1L));

        // 4. PUT /api/v1/barang/{id} (UPDATE)
        System.out.println("\n--- 4. PUT /api/v1/barang/2 (Pembaruan Data) ---");
        System.out.println(controller.perbaruiBarang(2L, new BarangRequestDTO("Magic Mouse Wireless Space Black", 1400000.0, 30)));

        // 5. GET /api/v1/barang/{id} - Penanganan Error (404 NOT FOUND)
        System.out.println("\n--- 5. GET /api/v1/barang/999 (Menguji Global Exception Handler) ---");
        System.out.println(controller.ambilBarangBerdasarkanId(999L));

        // 6. DELETE /api/v1/barang/{id} (DELETE)
        System.out.println("\n--- 6. DELETE /api/v1/barang/1 (Menghapus Data) ---");
        System.out.println(controller.hapusBarang(1L));

        // 7. GET /api/v1/barang (Verifikasi Akhir)
        System.out.println("\n--- 7. GET /api/v1/barang (Status Data Setelah Penghapusan) ---");
        System.out.println(controller.ambilSemuaBarang());

        System.out.println("=================================================================");
        System.out.println("Seluruh siklus REST API CRUD dan Error Handling sukses tuntas!");
    }
}

// 1. Data Transfer Objects (DTO)
class BarangRequestDTO {
    final String nama;
    final double harga;
    final int stok;
    public BarangRequestDTO(String n, double h, int s) { this.nama = n; this.harga = h; this.stok = s; }
}

class BarangResponseDTO {
    final Long id;
    final String nama;
    final double harga;
    final int stok;

    public BarangResponseDTO(Long id, String nama, double harga, int stok) {
        this.id = id; this.nama = nama; this.harga = harga; this.stok = stok;
    }

    public String toJson() {
        return String.format("{\"id\": %d, \"nama\": \"%s\", \"harga\": %.2f, \"stok\": %d}", id, nama, harga, stok);
    }
}

// 2. Entity Model
class BarangEntity {
    private Long id;
    private String nama;
    private double harga;
    private int stok;

    public BarangEntity(Long id, String nama, double harga, int stok) {
        this.id = id; this.nama = nama; this.harga = harga; this.stok = stok;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }
    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }
}

// 3. Repository Layer
interface BarangRepository {
    BarangEntity save(BarangEntity entity);
    List<BarangEntity> findAll();
    Optional<BarangEntity> findById(Long id);
    boolean deleteById(Long id);
}

class InMemoryBarangRepository implements BarangRepository {
    private final List<BarangEntity> database = new ArrayList<>();
    private long idSeq = 1;

    @Override
    public BarangEntity save(BarangEntity entity) {
        if (entity.getId() == null) {
            entity.setId(idSeq++);
            database.add(entity);
        } else {
            for (int i = 0; i < database.size(); i++) {
                if (database.get(i).getId().equals(entity.getId())) {
                    database.set(i, entity);
                    return entity;
                }
            }
        }
        return entity;
    }
    @Override public List<BarangEntity> findAll() { return new ArrayList<>(database); }
    @Override public Optional<BarangEntity> findById(Long id) {
        return database.stream().filter(b -> b.getId().equals(id)).findFirst();
    }
    @Override public boolean deleteById(Long id) {
        return database.removeIf(b -> b.getId().equals(id));
    }
}

// 4. Service Layer
interface BarangService {
    BarangResponseDTO create(BarangRequestDTO dto);
    List<BarangResponseDTO> getAll();
    BarangResponseDTO getById(Long id);
    BarangResponseDTO update(Long id, BarangRequestDTO dto);
    boolean delete(Long id);
}

class BarangServiceImpl implements BarangService {
    private final BarangRepository repo;
    public BarangServiceImpl(BarangRepository repo) { this.repo = repo; }

    @Override
    public BarangResponseDTO create(BarangRequestDTO dto) {
        BarangEntity e = repo.save(new BarangEntity(null, dto.nama, dto.harga, dto.stok));
        return new BarangResponseDTO(e.getId(), e.getNama(), e.getHarga(), e.getStok());
    }

    @Override
    public List<BarangResponseDTO> getAll() {
        return repo.findAll().stream()
                .map(e -> new BarangResponseDTO(e.getId(), e.getNama(), e.getHarga(), e.getStok()))
                .toList();
    }

    @Override
    public BarangResponseDTO getById(Long id) {
        BarangEntity e = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Barang dengan ID " + id + " tidak ditemukan"));
        return new BarangResponseDTO(e.getId(), e.getNama(), e.getHarga(), e.getStok());
    }

    @Override
    public BarangResponseDTO update(Long id, BarangRequestDTO dto) {
        BarangEntity existing = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Barang dengan ID " + id + " tidak ditemukan"));
        existing.setNama(dto.nama);
        existing.setHarga(dto.harga);
        existing.setStok(dto.stok);
        repo.save(existing);
        return new BarangResponseDTO(existing.getId(), existing.getNama(), existing.getHarga(), existing.getStok());
    }

    @Override
    public boolean delete(Long id) {
        if (repo.findById(id).isEmpty()) {
            throw new ResourceNotFoundException("Barang dengan ID " + id + " tidak ditemukan");
        }
        return repo.deleteById(id);
    }
}

// 5. Custom Exception
class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String msg) { super(msg); }
}

// 6. REST Controller Layer
class BarangRestController {
    private final BarangService service;
    public BarangRestController(BarangService service) { this.service = service; }

    public String tambahBarang(BarangRequestDTO req) {
        BarangResponseDTO res = service.create(req);
        return "HTTP 201 CREATED -> " + res.toJson();
    }

    public String ambilSemuaBarang() {
        List<BarangResponseDTO> list = service.getAll();
        StringBuilder sb = new StringBuilder("HTTP 200 OK (Total: " + list.size() + ") -> [\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append("  ").append(list.get(i).toJson());
            if (i < list.size() - 1) sb.append(",");
            sb.append("\n");
        }
        sb.append("]");
        return sb.toString();
    }

    public String ambilBarangBerdasarkanId(Long id) {
        try {
            BarangResponseDTO res = service.getById(id);
            return "HTTP 200 OK -> " + res.toJson();
        } catch (ResourceNotFoundException e) {
            return "HTTP 404 NOT FOUND -> {\"error\": \"" + e.getMessage() + "\"}";
        }
    }

    public String perbaruiBarang(Long id, BarangRequestDTO req) {
        try {
            BarangResponseDTO res = service.update(id, req);
            return "HTTP 200 OK -> " + res.toJson();
        } catch (ResourceNotFoundException e) {
            return "HTTP 404 NOT FOUND -> {\"error\": \"" + e.getMessage() + "\"}";
        }
    }

    public String hapusBarang(Long id) {
        try {
            service.delete(id);
            return "HTTP 200 OK -> {\"message\": \"Barang dengan ID " + id + " berhasil dihapus\"}";
        } catch (ResourceNotFoundException e) {
            return "HTTP 404 NOT FOUND -> {\"error\": \"" + e.getMessage() + "\"}";
        }
    }
}
