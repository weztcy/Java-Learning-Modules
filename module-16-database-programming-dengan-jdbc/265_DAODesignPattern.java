// Mendemonstrasikan arsitektur Data Access Object (DAO) untuk pemisahan logika bisnis dari operasi database.
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class DAODesignPattern {
    public static void main(String[] args) {
        System.out.println("=== 265. Penerapan Data Access Object (DAO) Pattern ===");

        // Inisialisasi DAO mahasiswa
        MahasiswaDAO dao = new MahasiswaDAOImpl();

        // 1. CREATE: Menambahkan record baru melalui DAO
        System.out.println("1. Menambahkan Mahasiswa baru via DAO:");
        dao.insert(new Mahasiswa(101, "Arya Wiratama", "Sistem Informasi", 3.82));
        dao.insert(new Mahasiswa(102, "Nabila Syahrani", "Teknik Informatika", 3.90));
        dao.insert(new Mahasiswa(103, "Fajar Nugraha", "Teknik Elektro", 3.45));

        // 2. READ ALL: Mengambil seluruh data
        System.out.println("\n2. Daftar Seluruh Mahasiswa:");
        for (Mahasiswa m : dao.findAll()) {
            System.out.println("   - " + m);
        }

        // 3. READ BY ID: Pencarian mahasiswa spesifik
        int idCari = 102;
        System.out.println("\n3. Mencari Mahasiswa dengan ID: " + idCari);
        Optional<Mahasiswa> opt = dao.findById(idCari);
        opt.ifPresentOrElse(
            m -> System.out.println("   Ditemukan: " + m.getNama() + " (" + m.getJurusan() + ") - IPK: " + m.getIpk()),
            () -> System.out.println("   Mahasiswa tidak ditemukan.")
        );

        // 4. UPDATE: Memperbarui data
        System.out.println("\n4. Memperbarui IPK Mahasiswa ID 103:");
        dao.update(new Mahasiswa(103, "Fajar Nugraha", "Teknik Elektro", 3.65));
        System.out.println("   Data setelah update: " + dao.findById(103).get());

        // 5. DELETE: Menghapus data
        System.out.println("\n5. Menghapus Mahasiswa ID 101:");
        boolean terhapus = dao.delete(101);
        System.out.println("   Status penghapusan: " + (terhapus ? "BERHASIL" : "GAGAL"));
        System.out.println("   Total mahasiswa tersisa: " + dao.findAll().size());
    }
}

// Model Entitas Domain
class Mahasiswa {
    private final int id;
    private final String nama;
    private final String jurusan;
    private final double ipk;

    public Mahasiswa(int id, String nama, String jurusan, double ipk) {
        this.id = id;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getJurusan() { return jurusan; }
    public double getIpk() { return ipk; }

    @Override
    public String toString() {
        return String.format("[ID: %d] %-16s | Jurusan: %-18s | IPK: %.2f", id, nama, jurusan, ipk);
    }
}

// Interface Kontrak Data Access Object
interface MahasiswaDAO {
    void insert(Mahasiswa m);
    Optional<Mahasiswa> findById(int id);
    List<Mahasiswa> findAll();
    boolean update(Mahasiswa m);
    boolean delete(int id);
}

// Implementasi DAO konkret
class MahasiswaDAOImpl implements MahasiswaDAO {
    private final List<Mahasiswa> databaseTabel = new ArrayList<>();

    @Override
    public void insert(Mahasiswa m) {
        databaseTabel.add(m);
        System.out.println("   [DAO] INSERT: " + m.getNama() + " berhasil disimpan.");
    }

    @Override
    public Optional<Mahasiswa> findById(int id) {
        return databaseTabel.stream().filter(m -> m.getId() == id).findFirst();
    }

    @Override
    public List<Mahasiswa> findAll() {
        return new ArrayList<>(databaseTabel);
    }

    @Override
    public boolean update(Mahasiswa m) {
        for (int i = 0; i < databaseTabel.size(); i++) {
            if (databaseTabel.get(i).getId() == m.getId()) {
                databaseTabel.set(i, m);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        return databaseTabel.removeIf(m -> m.getId() == id);
    }
}
