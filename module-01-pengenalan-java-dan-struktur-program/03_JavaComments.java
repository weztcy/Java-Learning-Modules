/**
 * Class JavaComments mendemonstrasikan tiga jenis komentar dalam bahasa Java:
 * 1. Single-line comment
 * 2. Multi-line comment
 * 3. Documentation comment (JavaDoc)
 */
class JavaComments {
    public static void main(String[] args) {
        // Ini adalah komentar satu baris (single-line comment), diabaikan oleh compiler.
        System.out.println("Komentar satu baris menggunakan tanda double slash (//).");

        /*
         * Ini adalah komentar multi-baris (multi-line comment).
         * Sangat berguna untuk menuliskan penjelasan panjang atau menonaktifkan
         * blok kode tertentu sementara waktu.
         */
        System.out.println("Komentar multi-baris menggunakan /* ... */.");

        // JavaDoc digunakan untuk dokumentasi API resmi yang dapat diekstrak otomatis.
        System.out.println("JavaDoc diawali dengan /** dan diakhiri */.");
    }
}
