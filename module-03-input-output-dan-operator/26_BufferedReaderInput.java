// Mendemonstrasikan pembacaan data teks baris demi baris menggunakan BufferedReader dan InputStreamReader.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.IOException;

class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        // BufferedReader lebih efisien untuk membaca aliran data teks berukuran besar
        BufferedReader reader;
        if (System.console() != null) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        } else {
            reader = new BufferedReader(new StringReader("Siti Rahma\nTeknik Informatika\n"));
        }

        System.out.println("=== Input Menggunakan BufferedReader ===");
        System.out.print("Masukkan Nama     : ");
        String nama = reader.readLine();

        System.out.print("Masukkan Jurusan  : ");
        String jurusan = reader.readLine();

        System.out.println("\n--- Konfirmasi Data ---");
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Program Studi: " + jurusan);

        reader.close();
    }
}
