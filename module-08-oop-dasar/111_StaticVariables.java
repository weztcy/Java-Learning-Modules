// Mendemonstrasikan static variables (class variables) yang dibagi bersama oleh seluruh instance objek.
class StaticVariables {
    public static void main(String[] args) {
        System.out.println("=== Static Variables (Class Variables) ===");

        // Mengakses static variable langsung melalui nama class
        System.out.println("Jumlah objek awal: " + PengukurObjek.jumlahObjek);

        PengukurObjek obj1 = new PengukurObjek("Objek Alpha");
        PengukurObjek obj2 = new PengukurObjek("Objek Beta");
        PengukurObjek obj3 = new PengukurObjek("Objek Gamma");

        System.out.println("Total objek tercipta sekarang: " + PengukurObjek.jumlahObjek);
    }
}

class PengukurObjek {
    String label;
    // Static variable disimpan sekali di area memori class dan dibagi bersama oleh semua objek
    static int jumlahObjek = 0;

    PengukurObjek(String label) {
        this.label = label;
        jumlahObjek++; // Setiap objek baru menambah counter statis
        System.out.println("Membuat " + label + " (Objek ke-" + jumlahObjek + ")");
    }
}
