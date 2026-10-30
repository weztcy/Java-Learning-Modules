// Mendemonstrasikan operasi perantara .map() untuk mentransformasikan setiap elemen ke bentuk baru.
import java.util.List;

class StreamMap {
    public static void main(String[] args) {
        System.out.println("=== Operasi Stream .map() ===");

        List<String> daftarNama = List.of("budi", "citra", "dewi", "eko");

        // Mengubah setiap nama menjadi huruf kapital dan menghitung panjang karakter
        List<String> namaKapital = daftarNama.stream()
            .map(String::toUpperCase)
            .toList();

        List<Integer> panjangKarakter = daftarNama.stream()
            .map(String::length)
            .toList();

        System.out.println("Nama asli       : " + daftarNama);
        System.out.println("Nama kapital    : " + namaKapital);
        System.out.println("Panjang karakter: " + panjangKarakter);
    }
}
