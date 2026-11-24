// Mendemonstrasikan kewajiban subclass dalam mengimplementasikan seluruh abstract method superclass.
class AbstractMethods {
    public static void main(String[] args) {
        System.out.println("=== Abstract Methods Implementation ===");

        MesinPabrik robotLas = new RobotPengelas();
        MesinPabrik banBerjalan = new KonveyorBarang();

        robotLas.operasikan();
        banBerjalan.operasikan();
    }
}

abstract class MesinPabrik {
    // Abstract method menentukan kontrak perilaku tanpa memaksakan detail logika
    abstract void startMesin();
    abstract void prosesKerja();
    abstract void stopMesin();

    // Template method yang mengeksekusi alur standar
    void operasikan() {
        startMesin();
        prosesKerja();
        stopMesin();
        System.out.println("--------------------------------");
    }
}

class RobotPengelas extends MesinPabrik {
    @Override
    void startMesin() { System.out.println("Robot Pengelas: Kalibrasi sensor optik dan lengan."); }
    @Override
    void prosesKerja() { System.out.println("Robot Pengelas: Melakukan pengelasan presisi pada rangka baja."); }
    @Override
    void stopMesin() { System.out.println("Robot Pengelas: Mengunci posisi standby."); }
}

class KonveyorBarang extends MesinPabrik {
    @Override
    void startMesin() { System.out.println("Konveyor: Menghidupkan motor listrik penggerak roda."); }
    @Override
    void prosesKerja() { System.out.println("Konveyor: Memindahkan barang kardus ke stasiun pengepakan."); }
    @Override
    void stopMesin() { System.out.println("Konveyor: Mengaktifkan rem hidrolik."); }
}
