// Mendemonstrasikan konsep Inversion of Control (IoC) dan Dependency Injection (DI) seperti pada Spring Framework.
import java.util.HashMap;
import java.util.Map;

class SpringDependencyInjection {
    public static void main(String[] args) {
        System.out.println("=== 289. Dependency Injection & Inversion of Control (IoC) ===");

        // Inisialisasi IoC Container sederhana
        IoCContainer container = new IoCContainer();

        // Mendaftarkan komponen service dan repository (seperti @Repository dan @Service)
        NotifikasiEmailService emailService = new NotifikasiEmailService();
        PenggunaRepository repo = new PenggunaRepository();
        container.registerBean("emailService", emailService);
        container.registerBean("userRepo", repo);

        // Constructor Injection: dependensi diinjeksikan melalui konstruktor
        PenggunaService userService = new PenggunaService(repo, emailService);
        container.registerBean("userService", userService);

        System.out.println("-> IoC Container berhasil memuat bean:");
        for (String beanName : container.getBeanNames()) {
            System.out.println("   * Bean: @" + beanName);
        }

        System.out.println("\n-> Menjalankan logika bisnis melalui service terinjeksi:");
        userService.registrasiPengguna("Yohanes", "yohanes@example.com");

        System.out.println("\nKeuntungan DI: Komponen memiliki loose coupling, mudah diuji secara modular, dan daur hidup objek dikelola terpusat.");
    }
}

class PenggunaRepository {
    public void simpan(String nama, String email) {
        System.out.println("   [Repository] Menyimpan data pengguna ke database: " + nama + " (" + email + ")");
    }
}

interface NotifikasiService {
    void kirimPesan(String tujuan, String pesan);
}

class NotifikasiEmailService implements NotifikasiService {
    @Override
    public void kirimPesan(String tujuan, String pesan) {
        System.out.println("   [EmailService] Mengirim email ke " + tujuan + ": \"" + pesan + "\"");
    }
}

class PenggunaService {
    private final PenggunaRepository repository;
    private final NotifikasiService notifikasi;

    // Dependency Injection via Constructor (@Autowired)
    public PenggunaService(PenggunaRepository repo, NotifikasiService notif) {
        this.repository = repo;
        this.notifikasi = notif;
    }

    public void registrasiPengguna(String nama, String email) {
        repository.simpan(nama, email);
        notifikasi.kirimPesan(email, "Selamat datang di platform kami, " + nama + "!");
    }
}

class IoCContainer {
    private final Map<String, Object> registry = new HashMap<>();
    public void registerBean(String name, Object bean) { registry.put(name, bean); }
    public Object getBean(String name) { return registry.get(name); }
    public java.util.Set<String> getBeanNames() { return registry.keySet(); }
}
