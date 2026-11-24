// Proyek Praktik Konsol 2: Sistem Informasi Manajemen Data Mahasiswa (CRUD Komprehensif).
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class StudentManagementProject {
    public static void main(String[] args) {
        System.out.println("=========================================================");
        System.out.println("      PROYEK 2: SISTEM PENGELOLAAN DATA MAHASISWA       ");
        System.out.println("=========================================================");

        SistemMahasiswa sistem = new SistemMahasiswa();

        // 1. Menambahkan Data Mahasiswa Baru
        System.out.println("-> 1. Menambahkan 4 data mahasiswa baru...");
        sistem.tambahMahasiswa(new DataMahasiswa("202401", "Alifia Zahra", "Informatika", 3.85));
        sistem.tambahMahasiswa(new DataMahasiswa("202402", "Bima Sakti", "Sistem Informasi", 3.60));
        sistem.tambahMahasiswa(new DataMahasiswa("202403", "Citra Kirana", "Teknik Elektro", 3.92));
        sistem.tambahMahasiswa(new DataMahasiswa("202404", "Dodi Darmawan", "Informatika", 3.40));

        // 2. Menampilkan Seluruh Mahasiswa
        sistem.tampilkanDaftar();

        // 3. Pencarian Berdasarkan NIM
        System.out.println("-> 2. Mencari Mahasiswa dengan NIM: 202403");
        sistem.cariBerdasarkanNim("202403").ifPresent(m -> System.out.println("   Ditemukan: " + m));

        // 4. Memperbarui Data Mahasiswa
        System.out.println("\n-> 3. Memperbarui IPK Mahasiswa 202402 menjadi 3.75");
        sistem.updateIpk("202402", 3.75);

        // 5. Menghapus Mahasiswa
        System.out.println("\n-> 4. Menghapus Mahasiswa NIM: 202404");
        sistem.hapusMahasiswa("202404");

        // 6. Ringkasan Akhir & Statistik
        sistem.tampilkanDaftar();
        sistem.tampilkanStatistik();
    }
}

class DataMahasiswa {
    private final String nim;
    private final String nama;
    private final String jurusan;
    private double ipk;

    public DataMahasiswa(String nim, String nama, String jurusan, double ipk) {
        this.nim = nim; this.nama = nama; this.jurusan = jurusan; this.ipk = ipk;
    }
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getJurusan() { return jurusan; }
    public double getIpk() { return ipk; }
    public void setIpk(double baru) { this.ipk = baru; }

    @Override public String toString() {
        return String.format("[NIM: %s] %-16s | Jurusan: %-18s | IPK: %.2f", nim, nama, jurusan, ipk);
    }
}

class SistemMahasiswa {
    private final List<DataMahasiswa> daftar = new ArrayList<>();

    public void tambahMahasiswa(DataMahasiswa m) {
        daftar.add(m);
        System.out.println("   [OK] Mahasiswa " + m.getNama() + " (" + m.getNim() + ") berhasil ditambahkan.");
    }

    public void tampilkanDaftar() {
        System.out.println("\n--- TABEL DATA MAHASISWA AKTIF ---");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-8s | %-18s | %-18s | %-6s%n", "NIM", "NAMA MAHASISWA", "JURUSAN", "IPK");
        System.out.println("-----------------------------------------------------------------");
        for (DataMahasiswa m : daftar) {
            System.out.printf("%-8s | %-18s | %-18s | %-6.2f%n", m.getNim(), m.getNama(), m.getJurusan(), m.getIpk());
        }
        System.out.println("-----------------------------------------------------------------");
    }

    public Optional<DataMahasiswa> cariBerdasarkanNim(String nim) {
        return daftar.stream().filter(m -> m.getNim().equalsIgnoreCase(nim)).findFirst();
    }

    public void updateIpk(String nim, double ipkBaru) {
        cariBerdasarkanNim(nim).ifPresent(m -> {
            m.setIpk(ipkBaru);
            System.out.println("   [UPDATE] Data IPK mahasiswa " + m.getNama() + " berhasil diubah ke: " + ipkBaru);
        });
    }

    public void hapusMahasiswa(String nim) {
        boolean terhapus = daftar.removeIf(m -> m.getNim().equalsIgnoreCase(nim));
        if (terhapus) System.out.println("   [DELETE] Mahasiswa NIM " + nim + " berhasil dihapus.");
    }

    public void tampilkanStatistik() {
        double totalIpk = 0;
        for (DataMahasiswa m : daftar) totalIpk += m.getIpk();
        double rataIpk = daftar.isEmpty() ? 0 : totalIpk / daftar.size();
        System.out.println("\n--- STATISTIK KEMAHASISWAAN ---");
        System.out.println("Total Mahasiswa Terdaftar : " + daftar.size() + " Orang");
        System.out.printf("Rata-rata IPK Mahasiswa    : %.2f%n", rataIpk);
    }
}
