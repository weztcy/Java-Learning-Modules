// Mendemonstrasikan penggantian bagian teks menggunakan replace(), replaceFirst(), dan replaceAll().
class StringReplacement {
    public static void main(String[] args) {
        System.out.println("=== Penggantian Teks (String Replacement) ===");

        String kalimat = "Satu apel, dua apel, tiga jeruk.";

        // replace() mengganti semua kecocokan teks literal
        String gantiSemua = kalimat.replace("apel", "mangga");
        System.out.println("Setelah replace('apel', 'mangga')      : " + gantiSemua);

        // replaceFirst() hanya mengganti kemunculan pertama
        String gantiPertama = kalimat.replaceFirst("apel", "pisang");
        System.out.println("Setelah replaceFirst('apel', 'pisang') : " + gantiPertama);

        // replaceAll() mendukung pola ekspresi reguler (regex)
        String hapusKoma = kalimat.replaceAll("[,.]", "");
        System.out.println("Setelah replaceAll tanda baca          : " + hapusKoma);
    }
}
