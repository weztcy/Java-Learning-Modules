// Mendemonstrasikan Immutable Collections (Java 9+ factory methods: List.of, Set.of, Map.of).
import java.util.List;
import java.util.Map;
import java.util.Set;

class ImmutableCollections {
    public static void main(String[] args) {
        System.out.println("=== Immutable Collections (List.of, Set.of, Map.of) ===");

        // Koleksi tidak dapat diubah (unmodifiable)
        List<String> hariKerja = List.of("Senin", "Selasa", "Rabu", "Kamis", "Jumat");
        Set<Integer> kodeRespon = Set.of(200, 201, 204);
        Map<String, String> konfigurasi = Map.of("env", "production", "debug", "false");

        System.out.println("Hari Kerja   : " + hariKerja);
        System.out.println("Kode Respon  : " + kodeRespon);
        System.out.println("Konfigurasi  : " + konfigurasi);

        // Mencoba memodifikasi akan melempar UnsupportedOperationException
        try {
            hariKerja.add("Sabtu");
        } catch (UnsupportedOperationException e) {
            System.out.println("-> Verifikasi Sukses: Modifikasi koleksi immutable dilarang!");
        }
    }
}
