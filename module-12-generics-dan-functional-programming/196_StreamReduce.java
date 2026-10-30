// Mendemonstrasikan operasi terminal .reduce() untuk menggabungkan seluruh elemen menjadi nilai skalar tunggal.
import java.util.List;

class StreamReduce {
    public static void main(String[] args) {
        System.out.println("=== Operasi Stream .reduce() ===");

        List<Integer> daftarAngka = List.of(2, 3, 4, 5);

        // Menghitung hasil perkalian seluruh elemen: identity = 1
        int hasilKali = daftarAngka.stream()
            .reduce(1, (akumulator, nilai) -> akumulator * nilai);

        // Menghitung jumlah total: identity = 0
        int hasilJumlah = daftarAngka.stream()
            .reduce(0, Integer::sum);

        System.out.println("Daftar angka   : " + daftarAngka);
        System.out.println("Hasil kali (2*3*4*5) : " + hasilKali);
        System.out.println("Hasil jumlah total  : " + hasilJumlah);
    }
}
