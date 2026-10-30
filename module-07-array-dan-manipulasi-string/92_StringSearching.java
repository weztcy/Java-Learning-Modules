// Mendemonstrasikan pencarian substring dan karakter dalam string.
class StringSearching {
    public static void main(String[] args) {
        System.out.println("=== Pencarian Teks pada String ===");

        String paragraf = "Java adalah bahasa berorientasi objek. Belajar Java itu menyenangkan.";

        // contains() memeriksa keberadaan kata
        System.out.println("Mengandung 'Java'        : " + paragraf.contains("Java"));
        System.out.println("Mengandung 'Python'      : " + paragraf.contains("Python"));

        // indexOf() mencari posisi indeks pertama kemunculan
        System.out.println("Posisi pertama kata 'Java': " + paragraf.indexOf("Java"));

        // lastIndexOf() mencari posisi kemunculan terakhir
        System.out.println("Posisi terakhir kata 'Java': " + paragraf.lastIndexOf("Java"));

        // startsWith() dan endsWith() memeriksa awalan dan akhiran
        System.out.println("Diawali dengan 'Java'    : " + paragraf.startsWith("Java"));
        System.out.println("Diakhiri dengan '.'      : " + paragraf.endsWith("."));
    }
}
