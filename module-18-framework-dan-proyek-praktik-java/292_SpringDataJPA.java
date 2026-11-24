// Mendemonstrasikan abstraksi Spring Data JPA: Repositori, Entity, dan otomatisasi query derivation.
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class SpringDataJPA {
    public static void main(String[] args) {
        System.out.println("=== 292. Spring Data JPA & Otomatisasi Repositori ===");

        // Inisialisasi Spring Data Repository
        PelangganRepository repo = new PelangganRepositoryImpl();

        System.out.println("1. Menyimpan Entitas Pelanggan (repo.save()):");
        repo.save(new PelangganEntity(1L, "Rudi Hartono", "rudi@mail.com", "Gold"));
        repo.save(new PelangganEntity(2L, "Sari Rahmawati", "sari@mail.com", "Platinum"));
        repo.save(new PelangganEntity(3L, "Budi Gunadi", "budi@mail.com", "Gold"));

        System.out.println("\n2. Mengambil Semua Data (repo.findAll()):");
        for (PelangganEntity p : repo.findAll()) {
            System.out.println("   * " + p);
        }

        System.out.println("\n3. Query Derivation Otomatis (repo.findByEmail()):");
        Optional<PelangganEntity> hasilEmail = repo.findByEmail("sari@mail.com");
        hasilEmail.ifPresent(p -> System.out.println("   Ditemukan: " + p.getNama() + " (" + p.getTier() + ")"));

        System.out.println("\n4. Query Derivation Berdasarkan Tingkat Kategori (repo.findByTier()):");
        List<PelangganEntity> goldMembers = repo.findByTier("Gold");
        System.out.println("   Daftar Anggota Gold (" + goldMembers.size() + " orang):");
        for (PelangganEntity p : goldMembers) {
            System.out.println("   - " + p.getNama());
        }

        System.out.println("\nKeunggulan Spring Data JPA: Mengeliminasi penulisan boilerplate query SQL/HQL manual.");
    }
}

class PelangganEntity {
    private final Long id;
    private final String nama;
    private final String email;
    private final String tier;

    public PelangganEntity(Long id, String nama, String email, String tier) {
        this.id = id; this.nama = nama; this.email = email; this.tier = tier;
    }
    public Long getId() { return id; }
    public String getNama() { return nama; }
    public String getEmail() { return email; }
    public String getTier() { return tier; }
    @Override public String toString() {
        return String.format("[ID: %d] %-18s | Email: %-15s | Tier: %s", id, nama, email, tier);
    }
}

interface PelangganRepository {
    PelangganEntity save(PelangganEntity entity);
    List<PelangganEntity> findAll();
    Optional<PelangganEntity> findById(Long id);
    Optional<PelangganEntity> findByEmail(String email);
    List<PelangganEntity> findByTier(String tier);
}

class PelangganRepositoryImpl implements PelangganRepository {
    private final List<PelangganEntity> tabel = new ArrayList<>();

    @Override
    public PelangganEntity save(PelangganEntity entity) {
        tabel.add(entity);
        System.out.println("   [JPA Hibernate] Hibernate: INSERT INTO pelanggan VALUES (" + entity.getId() + ", '" + entity.getNama() + "')");
        return entity;
    }
    @Override public List<PelangganEntity> findAll() { return new ArrayList<>(tabel); }
    @Override public Optional<PelangganEntity> findById(Long id) {
        return tabel.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
    @Override public Optional<PelangganEntity> findByEmail(String email) {
        return tabel.stream().filter(p -> p.getEmail().equalsIgnoreCase(email)).findFirst();
    }
    @Override public List<PelangganEntity> findByTier(String tier) {
        return tabel.stream().filter(p -> p.getTier().equalsIgnoreCase(tier)).toList();
    }
}
