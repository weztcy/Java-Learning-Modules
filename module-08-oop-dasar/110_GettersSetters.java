// Mendemonstrasikan penggunaan method getter (aksesor) dan setter (mutator) berstandar JavaBean.
class GettersSetters {
    public static void main(String[] args) {
        System.out.println("=== Getter dan Setter ===");

        KaryawanBean kry = new KaryawanBean();
        kry.setNama("Siti Aminah");
        kry.setGajiPokok(8500000);

        System.out.println("Nama Pegawai : " + kry.getNama());
        System.out.printf("Gaji Pokok   : Rp %,.2f%n", kry.getGajiPokok());

        // Menguji validasi setter
        kry.setGajiPokok(-500000); // Akan ditolak oleh validasi internal
    }
}

class KaryawanBean {
    private String nama;
    private double gajiPokok;

    // Getter untuk membaca nilai nama
    public String getNama() {
        return nama;
    }

    // Setter untuk memvalidasi dan menetapkan nilai nama
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        }
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok >= 0) {
            this.gajiPokok = gajiPokok;
        } else {
            System.out.println("Peringatan: Gaji tidak boleh bernilai negatif!");
        }
    }
}
