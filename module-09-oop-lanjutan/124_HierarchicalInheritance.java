// Mendemonstrasikan hierarchical inheritance: satu superclass diwarisi oleh banyak subclass berbeda.
class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("=== Hierarchical Inheritance ===");

        KaryawanTetap tetap = new KaryawanTetap("Ahmad", 8000000, 1500000);
        KaryawanKontrak kontrak = new KaryawanKontrak("Siti", 6000000, 12);

        tetap.cetakRincianGaji();
        System.out.println("------------------------------------");
        kontrak.cetakKontrak();
    }
}

// Superclass bersama
class KaryawanPerusahaan {
    String nama;
    double gajiPokok;

    KaryawanPerusahaan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
}

// Subclass 1
class KaryawanTetap extends KaryawanPerusahaan {
    double tunjanganKesehatan;

    KaryawanTetap(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjanganKesehatan = tunjangan;
    }

    void cetakRincianGaji() {
        System.out.printf("Karyawan Tetap : %s | Total: Rp %,.2f%n", nama, (gajiPokok + tunjanganKesehatan));
    }
}

// Subclass 2
class KaryawanKontrak extends KaryawanPerusahaan {
    int durasiBulan;

    KaryawanKontrak(String nama, double gajiPokok, int durasiBulan) {
        super(nama, gajiPokok);
        this.durasiBulan = durasiBulan;
    }

    void cetakKontrak() {
        System.out.printf("Karyawan Kontrak: %s | Durasi: %d bulan | Gaji: Rp %,.2f%n", nama, durasiBulan, gajiPokok);
    }
}
