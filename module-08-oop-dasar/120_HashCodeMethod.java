// Mendemonstrasikan override method hashCode() yang konsisten berpasangan dengan equals().
import java.util.Objects;

class HashCodeMethod {
    public static void main(String[] args) {
        System.out.println("=== Hubungan Kontrak equals() dan hashCode() ===");

        ProdukHash p1 = new ProdukHash("P-001", "Monitor LED 24 Inch");
        ProdukHash p2 = new ProdukHash("P-001", "Monitor LED 24 Inch");

        System.out.println("Apakah p1.equals(p2)? " + p1.equals(p2));
        System.out.println("HashCode p1 : " + p1.hashCode());
        System.out.println("HashCode p2 : " + p2.hashCode());
        System.out.println("Aturan Kontrak: Jika dua objek bernilai sama menurut equals(), keduanya WAJIB memiliki hashCode yang sama.");
    }
}

class ProdukHash {
    private String kode;
    private String nama;

    ProdukHash(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdukHash that = (ProdukHash) o;
        return Objects.equals(kode, that.kode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kode);
    }
}
