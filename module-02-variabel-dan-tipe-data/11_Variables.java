// Mendemonstrasikan deklarasi berbagai variabel di Java sebelum digunakan.
class Variables {
    public static void main(String[] args) {
        // Deklarasi variabel menentukan tipe data dan nama variabel tanpa langsung mengisi nilainya
        int usia;
        double beratBadan;
        char jenisKelamin;
        boolean statusMenikah;

        // Mengisi nilai ke dalam variabel yang telah dideklarasikan
        usia = 22;
        beratBadan = 65.5;
        jenisKelamin = 'L';
        statusMenikah = false;

        // Menampilkan nilai variabel
        System.out.println("=== Deklarasi Variabel Java ===");
        System.out.println("Usia           : " + usia + " tahun");
        System.out.println("Berat Badan    : " + beratBadan + " kg");
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Status Menikah : " + statusMenikah);
    }
}
