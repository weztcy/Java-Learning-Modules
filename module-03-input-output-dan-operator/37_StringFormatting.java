// Mendemonstrasikan pembuatan teks terformat menggunakan static method String.format().
class StringFormatting {
    public static void main(String[] args) {
        String produk = "Laptop Gaming";
        int stok = 12;
        double harga = 15499000.50;

        // String.format() mengembalikan String baru tanpa langsung mencetaknya ke konsol
        String laporan = String.format("Produk: %-15s | Stok: %03d unit | Harga: Rp %,.2f", produk, stok, harga);

        System.out.println("=== Pemformatan String dengan String.format() ===");
        System.out.println(laporan);
    }
}
