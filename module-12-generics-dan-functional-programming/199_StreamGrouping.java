// Mendemonstrasikan pengelompokan data dengan Collectors.groupingBy dan pemisahan partisi dengan partitioningBy.
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StreamGrouping {
    public static void main(String[] args) {
        System.out.println("=== Grouping dan Partitioning pada Stream ===");

        List<PegawaiGroup> karyawan = List.of(
            new PegawaiGroup("Budi", "IT", 28),
            new PegawaiGroup("Citra", "HR", 24),
            new PegawaiGroup("Dewi", "IT", 32),
            new PegawaiGroup("Eko", "Finance", 29)
        );

        // Grouping by departemen
        Map<String, List<PegawaiGroup>> grupDept = karyawan.stream()
            .collect(Collectors.groupingBy(p -> p.departemen));

        System.out.println("Pengelompokan Berdasarkan Departemen:");
        grupDept.forEach((dept, list) -> System.out.println(" " + dept + " -> " + list));

        // Partitioning by usia >= 30 tahun
        Map<Boolean, List<PegawaiGroup>> partisiUsia = karyawan.stream()
            .collect(Collectors.partitioningBy(p -> p.usia >= 30));

        System.out.println("\nPartisi Usia >= 30 tahun: " + partisiUsia.get(true));
        System.out.println("Partisi Usia < 30 tahun : " + partisiUsia.get(false));
    }
}

class PegawaiGroup {
    String nama;
    String departemen;
    int usia;

    PegawaiGroup(String nama, String departemen, int usia) {
        this.nama = nama;
        this.departemen = departemen;
        this.usia = usia;
    }

    @Override
    public String toString() {
        return nama + "(" + usia + "th)";
    }
}
