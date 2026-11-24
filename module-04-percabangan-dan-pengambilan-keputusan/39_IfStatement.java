// Mendemonstrasikan percabangan satu kondisi menggunakan if statement.
class IfStatement {
    public static void main(String[] args) {
        int nilaiUjian = 85;

        System.out.println("=== Percabangan if Satu Kondisi ===");
        System.out.println("Nilai Mahasiswa: " + nilaiUjian);

        // Blok kode di dalam if hanya akan dieksekusi jika kondisi bernilai true
        if (nilaiUjian >= 75) {
            System.out.println("Selamat! Anda dinyatakan LULUS ujian ini.");
        }

        System.out.println("Program selesai memeriksa nilai.");
    }
}
