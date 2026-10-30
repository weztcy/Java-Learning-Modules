// Mendemonstrasikan pembacaan berbagai tipe data dari input menggunakan class java.util.Scanner.
import java.util.Scanner;

class ScannerInput {
    public static void main(String[] args) {
        // Menggunakan Scanner: membaca System.in jika ada konsol interaktif, atau input default jika non-interaktif
        Scanner input;
        if (System.console() != null) {
            input = new Scanner(System.in);
        } else {
            input = new Scanner("Andi Pratama\n20\n3.85\n");
        }

        System.out.println("=== Input Menggunakan Scanner ===");
        System.out.print("Masukkan Nama   : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Usia   : ");
        int usia = input.nextInt();

        System.out.print("Masukkan IPK    : ");
        double ipk = input.nextDouble();

        System.out.println("\n--- Data Berhasil Dibaca ---");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Usia Mahasiswa : " + usia + " tahun");
        System.out.println("IPK Mahasiswa  : " + ipk);
        
        input.close();
    }
}
