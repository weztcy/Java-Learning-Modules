// Mendemonstrasikan prinsip Agregasi (Aggregation): hubungan longgar 'has-a' di mana objek bagian dapat hidup mandiri.
import java.util.ArrayList;
import java.util.List;

class Aggregation {
    public static void main(String[] args) {
        System.out.println("=== Hubungan Agregasi (Aggregation: Weak Has-A) ===");

        // Dosen diciptakan secara independen di luar Jurusan
        Dosen d1 = new Dosen("Dr. Hendra", "Kecerdasan Buatan");
        Dosen d2 = new Dosen("Prof. Suryo", "Jaringan Komputer");

        JurusanKampus ifJurusan = new JurusanKampus("Teknik Informatika");
        ifJurusan.tambahDosen(d1);
        ifJurusan.tambahDosen(d2);

        ifJurusan.tampilkanDosen();
        System.out.println("Catatan: Jika jurusan ditutup, objek Dosen tetap eksis mandiri di sistem.");
    }
}

class Dosen {
    String nama;
    String keahlian;

    Dosen(String nama, String keahlian) {
        this.nama = nama;
        this.keahlian = keahlian;
    }
}

class JurusanKampus {
    String namaJurusan;
    List<Dosen> daftarDosen = new ArrayList<>();

    JurusanKampus(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    void tambahDosen(Dosen d) {
        daftarDosen.add(d);
    }

    void tampilkanDosen() {
        System.out.println("Daftar Dosen di " + namaJurusan + ":");
        for (Dosen d : daftarDosen) {
            System.out.println(" - " + d.nama + " (Bidang: " + d.keahlian + ")");
        }
    }
}
