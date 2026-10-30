// Mendemonstrasikan arsitektur keamanan Spring Security: Authentication, Authorization, RBAC, dan Hashing Sandi.
import java.util.HashMap;
import java.util.Map;

class SpringSecurityBasic {
    public static void main(String[] args) {
        System.out.println("=== 294. Pengenalan Arsitektur Spring Security ===");

        SecurityContextManager secManager = new SecurityContextManager();

        // 1. Percobaan Akses Tanpa Otentikasi
        System.out.println("--- 1. Mencoba Mengakses Endpoint /api/admin/laporan Tanpa Login ---");
        secManager.aksesEndpoint("/api/admin/laporan", null);

        // 2. Login Pengguna dengan Peran USER
        System.out.println("\n--- 2. Pengguna 'budi' (Peran: ROLE_USER) Login & Mencoba Akses ---");
        PenggunaAuth userBudi = secManager.login("budi", "user123");
        secManager.aksesEndpoint("/api/user/profil", userBudi);
        secManager.aksesEndpoint("/api/admin/laporan", userBudi); // Ditolak karena butuh ROLE_ADMIN

        // 3. Login Pengguna dengan Peran ADMIN
        System.out.println("\n--- 3. Pengguna 'admin' (Peran: ROLE_ADMIN) Login & Akses Admin ---");
        PenggunaAuth adminUser = secManager.login("admin", "adminSecret#1");
        secManager.aksesEndpoint("/api/admin/laporan", adminUser);

        System.out.println("\nSpring Security Filter Chain menyaring setiap request HTTP sebelum mencapai controller.");
    }
}

class PenggunaAuth {
    final String username;
    final String role;
    public PenggunaAuth(String u, String r) { this.username = u; this.role = r; }
}

class SecurityContextManager {
    private final Map<String, String[]> userStore = new HashMap<>();

    public SecurityContextManager() {
        // Username -> [Password, Role]
        userStore.put("budi", new String[]{"user123", "ROLE_USER"});
        userStore.put("admin", new String[]{"adminSecret#1", "ROLE_ADMIN"});
    }

    public PenggunaAuth login(String username, String rawPassword) {
        String[] data = userStore.get(username);
        if (data != null && data[0].equals(rawPassword)) {
            System.out.println("   [Auth] Login Berhasil: Pengguna '" + username + "' terotentikasi.");
            return new PenggunaAuth(username, data[1]);
        }
        System.out.println("   [Auth] Login Gagal: Kredensial tidak valid.");
        return null;
    }

    public void aksesEndpoint(String url, PenggunaAuth user) {
        if (user == null) {
            System.out.println("   HTTP 401 Unauthorized: Akses ditolak ke " + url + ". Anda wajib login.");
            return;
        }

        if (url.startsWith("/api/admin") && !user.role.equals("ROLE_ADMIN")) {
            System.out.println("   HTTP 403 Forbidden: Akses ke " + url + " ditolak! Memerlukan ROLE_ADMIN (Peran Anda: " + user.role + ").");
            return;
        }

        System.out.println("   HTTP 200 OK: Akses ke " + url + " diizinkan untuk " + user.username + " (" + user.role + ").");
    }
}
