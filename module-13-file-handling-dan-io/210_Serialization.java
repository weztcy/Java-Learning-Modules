// Mendemonstrasikan siklus lengkap serialisasi dan deserialisasi objek yang mengimplementasikan java.io.Serializable.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializationDemo {
    public static void main(String[] args) {
        System.out.println("=== Siklus Lengkap Serialisasi & Deserialisasi ===");

        File berkas = new File("profil_ser.bin");
        ProfilPengguna profilAsli = new ProfilPengguna("user_gamer_01", "gamer@server.com", 85);

        try {
            // Tahap 1: Serialisasi (Objek -> Byte File)
            ObjectOutputStream keluar = new ObjectOutputStream(new FileOutputStream(berkas));
            keluar.writeObject(profilAsli);
            keluar.close();
            System.out.println("1. Objek berhasil diubah menjadi aliran byte biner.");

            // Tahap 2: Deserialisasi (Byte File -> Objek Memori Baru)
            ObjectInputStream masuk = new ObjectInputStream(new FileInputStream(berkas));
            ProfilPengguna profilRekonstruksi = (ProfilPengguna) masuk.readObject();
            masuk.close();
            System.out.println("2. Objek berhasil direkonstruksi kembali dari byte biner:");
            System.out.println("   Username : " + profilRekonstruksi.username);
            System.out.println("   Email    : " + profilRekonstruksi.email);
            System.out.println("   Level    : " + profilRekonstruksi.level);

            berkas.deleteOnExit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class ProfilPengguna implements Serializable {
    private static final long serialVersionUID = 100L;
    String username;
    String email;
    int level;

    ProfilPengguna(String u, String e, int l) {
        this.username = u;
        this.email = e;
        this.level = l;
    }
}
