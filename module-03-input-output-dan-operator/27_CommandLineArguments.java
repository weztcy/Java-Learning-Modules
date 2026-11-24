// Mendemonstrasikan penanganan argumen baris perintah (CLI arguments) melalui parameter args pada method main.
class CommandLineArguments {
    public static void main(String[] args) {
        // Jika tidak ada argumen CLI yang diteruskan, sediakan argumen default sebagai peraga edukatif
        if (args.length == 0) {
            System.out.println("Tidak ada argumen CLI yang dimasukkan, menggunakan argumen demonstrasi:");
            args = new String[]{"Belajar", "Pemrograman", "Java", "2026"};
        }

        System.out.println("=== Argumen Baris Perintah (args) ===");
        System.out.println("Jumlah argumen diterima: " + args.length);

        // Iterasi menampilkan seluruh argumen beserta nomor indeksnya
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumen [" + i + "] = " + args[i]);
        }
    }
}
