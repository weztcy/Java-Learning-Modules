// Mendemonstrasikan switch expression modern dengan panah (arrow syntax ->) tanpa break.
class SwitchExpression {
    public static void main(String[] args) {
        String kodeKategori = "ELEC";

        System.out.println("=== Switch Expression Modern (Java 14+) ===");

        // Switch expression dapat mengembalikan nilai langsung ke variabel
        String namaKategori = switch (kodeKategori) {
            case "ELEC" -> "Elektronik dan Gadget";
            case "CLOTH" -> "Pakaian dan Busana";
            case "FOOD", "BEV" -> "Makanan dan Minuman"; // Multiple label dalam satu case
            default -> "Kategori Lainnya";
        };

        System.out.println("Kode Kategori : " + kodeKategori);
        System.out.println("Nama Kategori : " + namaKategori);
    }
}
