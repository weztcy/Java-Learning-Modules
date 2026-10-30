// Mendemonstrasikan instance method yang bekerja pada state objek spesifik setelah diinstansiasi.
class InstanceMethods {
    public static void main(String[] args) {
        System.out.println("=== Instance Methods ===");

        // Membuat objek spesifik dari class Mobil
        Mobil mobilSaya = new Mobil();
        mobilSaya.merk = "Sedan Sport";

        // Memanggil instance method melalui referensi objek
        mobilSaya.tambahKecepatan(40);
        mobilSaya.tambahKecepatan(30);
        mobilSaya.rem();
    }
}

// Class Mobil yang memiliki atribut dan instance method
class Mobil {
    String merk;
    int kecepatan = 0;

    // Instance method dapat mengakses dan memodifikasi atribut (state) objek
    void tambahKecepatan(int akselerasi) {
        this.kecepatan += akselerasi;
        System.out.println(merk + " melaju dengan kecepatan: " + this.kecepatan + " km/jam");
    }

    void rem() {
        this.kecepatan = 0;
        System.out.println(merk + " berhenti total.");
    }
}
