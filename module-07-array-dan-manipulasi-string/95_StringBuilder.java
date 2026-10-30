// Mendemonstrasikan manipulasi string yang efisien dan dapat dimutasi menggunakan StringBuilder.
class StringBuilder {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan java.lang.StringBuilder ===");

        // StringBuilder dapat diubah isinya (mutable) tanpa membuat objek baru di memori
        java.lang.StringBuilder builder = new java.lang.StringBuilder("Java");

        builder.append(" adalah");
        builder.append(" bahasa");
        builder.append(" yang hebat.");
        System.out.println("Setelah append : " + builder.toString());

        // Menyisipkan teks di posisi indeks tertentu
        builder.insert(4, " Standard Edition");
        System.out.println("Setelah insert : " + builder.toString());

        // Membalik urutan karakter
        builder.reverse();
        System.out.println("Setelah reverse: " + builder.toString());
    }
}
