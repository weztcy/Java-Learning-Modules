// Mendemonstrasikan instance method yang mengoperasikan perilaku pada instance variables.
class InstanceMethods {
    public static void main(String[] args) {
        System.out.println("=== Instance Methods ===");

        LampuKamar lampuUtama = new LampuKamar();
        lampuUtama.namaRuang = "Ruang Tamu";

        lampuUtama.nyalakan();
        lampuUtama.periksaStatus();

        lampuUtama.padamkan();
        lampuUtama.periksaStatus();
    }
}

class LampuKamar {
    String namaRuang;
    boolean isMenyala = false;

    // Instance method dapat mengakses state objek
    void nyalakan() {
        isMenyala = true;
        System.out.println("Lampu " + namaRuang + " sekarang MENYALA.");
    }

    void padamkan() {
        isMenyala = false;
        System.out.println("Lampu " + namaRuang + " sekarang MATI.");
    }

    void periksaStatus() {
        System.out.println("Status Lampu " + namaRuang + ": " + (isMenyala ? "AKTIF" : "NON-AKTIF"));
    }
}
