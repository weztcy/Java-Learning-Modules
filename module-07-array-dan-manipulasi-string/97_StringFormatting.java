// Mendemonstrasikan pembuatan teks tabular dan format angka rapi dengan String.format().
class StringFormatting {
    public static void main(String[] args) {
        System.out.println("=== Format Tabel Menggunakan String.format() ===");

        String formatHeader = "%-5s | %-15s | %-10s | %12s%n";
        String formatBaris  = "%-5d | %-15s | %-10s | %,12.2f%n";

        System.out.printf(formatHeader, "NO", "NAMA BARANG", "KATEGORI", "HARGA (RP)");
        System.out.println("------+-----------------+------------+-------------");
        System.out.printf(formatBaris, 1, "Keyboard RGB", "Hardware", 450000.0);
        System.out.printf(formatBaris, 2, "Mouse Wireless", "Hardware", 175000.0);
        System.out.printf(formatBaris, 3, "Flashdisk 64GB", "Storage", 89500.0);
    }
}
