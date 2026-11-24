// Mendemonstrasikan fitur modern Java 15+: Text Blocks (Triple Quotes) untuk string multibaris tanpa concatenation.
class TextBlocks {
    public static void main(String[] args) {
        System.out.println("=== 285. Text Blocks Multibaris (Java 15+) ===");

        // 1. Text Block untuk dokumen JSON terstruktur
        String jsonPayload = """
                {
                    "pengguna": "yohanes",
                    "peran": "Software Architect",
                    "aktif": true,
                    "keahlian": ["Java", "Spring Boot", "Docker"]
                }
                """;

        System.out.println("1. Dokumen JSON via Text Block:");
        System.out.println(jsonPayload);

        // 2. Text Block untuk kueri SQL multibaris yang rapi
        String kueriSQL = """
                SELECT p.id, p.nama, k.nama_kategori
                FROM produk p
                INNER JOIN kategori k ON p.kategori_id = k.id
                WHERE p.harga >= 500000
                ORDER BY p.nama ASC;
                """;

        System.out.println("2. Kueri SQL via Text Block:");
        System.out.println(kueriSQL);

        System.out.println("Keuntungan: Bebas karakter escape kutip dua, indentasi otomatis dinormalisasi, dan sangat mudah dibaca.");
    }
}
