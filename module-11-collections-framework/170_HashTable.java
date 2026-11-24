// Mendemonstrasikan Hashtable: implementasi Map legacy yang thread-safe dan tidak mengizinkan nilai null.
import java.util.Hashtable;

class HashTableDemo {
    public static void main(String[] args) {
        System.out.println("=== java.util.Hashtable (Legacy Thread-Safe Map) ===");

        Hashtable<Integer, String> tabelKode = new Hashtable<>();

        tabelKode.put(200, "OK (Sukses)");
        tabelKode.put(404, "Not Found (Halaman Tidak Ditemukan)");
        tabelKode.put(500, "Internal Server Error");

        System.out.println("Kode 200: " + tabelKode.get(200));
        System.out.println("Ukuran Hashtable: " + tabelKode.size());
        System.out.println("Catatan: Hashtable menolak key atau value bernilai null.");
    }
}
