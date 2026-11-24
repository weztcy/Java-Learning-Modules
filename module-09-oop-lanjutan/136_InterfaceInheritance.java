// Mendemonstrasikan pewarisan interface: sebuah interface dapat memperluas (extends) interface lainnya.
class InterfaceInheritance {
    public static void main(String[] args) {
        System.out.println("=== Pewarisan Interface (Interface Inheritance) ===");

        PesawatJetTempur jet = new PesawatJetTempur();
        jet.terbang();
        jet.luncurkanRudal();
    }
}

interface KendaraanUdara {
    void terbang();
}

// Interface SenjataMiliter
interface SenjataMiliter {
    void luncurkanRudal();
}

// Interface anak mewarisi kedua interface induk
interface KendaraanTempurUdara extends KendaraanUdara, SenjataMiliter {
    // Mewarisi terbang() dan luncurkanRudal()
}

class PesawatJetTempur implements KendaraanTempurUdara {
    @Override
    public void terbang() {
        System.out.println("Pesawat lepas landas dan terbang dengan kecepatan Mach 2.");
    }

    @Override
    public void luncurkanRudal() {
        System.out.println("Rudal pertahanan udara diluncurkan ke target!");
    }
}
