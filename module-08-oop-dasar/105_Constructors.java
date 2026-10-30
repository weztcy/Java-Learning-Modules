// Mendemonstrasikan constructor sebagai method khusus yang dijalankan saat pembentukan objek (new).
class Constructors {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan Constructor ===");

        // Constructor dipanggil secara otomatis saat keyword 'new' dijalankan
        MahasiswaConst mhs = new MahasiswaConst("12345678", "Putri Lestari", 3.82);
        mhs.tampilkanBiodata();
    }
}

class MahasiswaConst {
    String nim;
    String nama;
    double ipk;

    // Constructor memiliki nama persis sama dengan nama class dan tidak memiliki return type
    MahasiswaConst(String nimInput, String namaInput, double ipkInput) {
        System.out.println("-> Constructor MahasiswaConst dipanggil untuk inisialisasi awal.");
        nim = nimInput;
        nama = namaInput;
        ipk = ipkInput;
    }

    void tampilkanBiodata() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("IPK  : " + ipk);
    }
}
