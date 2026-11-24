// Mendemonstrasikan single inheritance: sebuah class hanya memiliki satu superclass langsung.
class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");

        MobilSedan sedan = new MobilSedan();
        sedan.merk = "Toyota Vios";
        sedan.hidupkanMesin(); // Warisan dari KendaraanBermotor
        sedan.bukaBagasi();    // Khusus MobilSedan
    }
}

class KendaraanBermotor {
    String merk;

    void hidupkanMesin() {
        System.out.println("Mesin " + merk + " berhasil dihidupkan.");
    }
}

// Subclass tunggal
class MobilSedan extends KendaraanBermotor {
    void bukaBagasi() {
        System.out.println("Bagasi belakang " + merk + " dibuka.");
    }
}
