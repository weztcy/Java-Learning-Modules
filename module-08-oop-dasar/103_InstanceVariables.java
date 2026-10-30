// Mendemonstrasikan instance variables yang mewakili state unik setiap objek.
class InstanceVariables {
    public static void main(String[] args) {
        System.out.println("=== Instance Variables ===");

        AkunPengguna user1 = new AkunPengguna();
        user1.username = "budi_tech";
        user1.levelAkses = 1;

        AkunPengguna user2 = new AkunPengguna();
        user2.username = "admin_super";
        user2.levelAkses = 9;

        System.out.println("User 1: " + user1.username + " (Akses Level: " + user1.levelAkses + ")");
        System.out.println("User 2: " + user2.username + " (Akses Level: " + user2.levelAkses + ")");
        System.out.println("Mengubah nilai user1 tidak mempengaruhi user2 karena keduanya adalah instance independen.");
    }
}

class AkunPengguna {
    // Instance variables: melekat pada tiap instance objek
    String username;
    int levelAkses;
}
