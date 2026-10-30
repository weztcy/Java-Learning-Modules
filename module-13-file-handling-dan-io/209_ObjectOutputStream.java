// Mendemonstrasikan penyimpanan objek Java secara persisten ke berkas biner (Serialization) dengan ObjectOutputStream.
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        System.out.println("=== Menulis Objek dengan ObjectOutputStream ===");

        File berkas = new File("mahasiswa_oos.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(berkas))) {
            MahasiswaOOS mhs = new MahasiswaOOS("Farhan Syahputra", "Teknik Informatika", 3.88);
            oos.writeObject(mhs);

            System.out.println("Objek '" + mhs.nama + "' berhasil diserialisasi ke: " + berkas.getName());
            System.out.println("Ukuran berkas objek: " + berkas.length() + " bytes");

            berkas.deleteOnExit();
        } catch (Exception e) {
            System.out.println("Error serialisasi: " + e.getMessage());
        }
    }
}

class MahasiswaOOS implements Serializable {
    private static final long serialVersionUID = 1L;
    String nama;
    String jurusan;
    double ipk;

    MahasiswaOOS(String n, String j, double i) {
        this.nama = n;
        this.jurusan = j;
        this.ipk = i;
    }
}
