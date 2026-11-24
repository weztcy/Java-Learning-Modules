// Mendemonstrasikan pengiriman argumen ke dalam parameter bertipe data tertentu pada method.
class MethodParameters {
    // Method menerima dua parameter: String nama dan int usia
    static void tampilkanProfil(String nama, int usia) {
        System.out.println("Nama Pengguna : " + nama);
        System.out.println("Usia          : " + usia + " tahun");
        System.out.println("Kategori Usia : " + (usia >= 18 ? "Dewasa" : "Remaja/Anak-anak"));
    }

    public static void main(String[] args) {
        System.out.println("=== Parameter Method ===");

        // Mengirim argumen aktual saat memanggil method
        tampilkanProfil("Rina Wijaya", 21);
        System.out.println("-------------------------");
        tampilkanProfil("Dimas Arya", 15);
    }
}
