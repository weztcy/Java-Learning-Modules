// Mendemonstrasikan Nested Classes: Static Nested Class dan Non-static Inner Class di Java.
class NestedClasses {
    public static void main(String[] args) {
        System.out.println("=== Nested Classes (Inner & Static Nested) ===");

        // 1. Instansiasi Static Nested Class (tidak perlu objek class luar)
        KomputerOuter.ProcessorStatic cpu = new KomputerOuter.ProcessorStatic("Intel Core i7");
        cpu.cetakSpesifikasi();

        // 2. Instansiasi Non-static Inner Class (memerlukan instance dari class luar)
        KomputerOuter pc = new KomputerOuter("Dell XPS Desktop");
        KomputerOuter.PortUsb usb = pc.new PortUsb(1);
        usb.hubungkanPerangkat("Flashdisk 64GB");
    }
}

class KomputerOuter {
    String namaKomputer;

    KomputerOuter(String nama) {
        this.namaKomputer = nama;
    }

    // Static Nested Class: independen dari atribut instance class luar
    static class ProcessorStatic {
        String tipeProcessor;

        ProcessorStatic(String tipe) {
            this.tipeProcessor = tipe;
        }

        void cetakSpesifikasi() {
            System.out.println("Processor: " + tipeProcessor);
        }
    }

    // Non-static Inner Class: memiliki akses langsung ke atribut instance class luar (namaKomputer)
    class PortUsb {
        int nomorPort;

        PortUsb(int nomor) {
            this.nomorPort = nomor;
        }

        void hubungkanPerangkat(String namaPerangkat) {
            System.out.println("Menghubungkan '" + namaPerangkat + "' ke Port USB-" + nomorPort + " pada " + namaKomputer);
        }
    }
}
