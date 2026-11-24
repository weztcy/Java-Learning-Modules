// Mendemonstrasikan variasi inisialisasi array secara langsung dengan array literal.
class ArrayInitialization {
    public static void main(String[] args) {
        System.out.println("=== Inisialisasi Array ===");

        // Inisialisasi langsung dengan kurung kurawal (array literal)
        String[] daftarKota = {"Jakarta", "Bandung", "Surabaya", "Yogyakarta", "Medan"};

        // Inisialisasi bertipe double
        double[] daftarHarga = new double[]{15000.0, 25000.5, 49900.0};

        System.out.println("Jumlah kota terdaftar : " + daftarKota.length);
        System.out.println("Kota ketiga           : " + daftarKota[2]);
        System.out.println("Harga pertama         : Rp " + daftarHarga[0]);
    }
}
