// Mendemonstrasikan pewarisan berjenjang (multilevel inheritance: kakek -> bapak -> anak).
class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("=== Multilevel Inheritance ===");

        MobilListrik tesla = new MobilListrik();
        tesla.kategori = "Kendaraan Roda Empat"; // Dari Kakek (AlatTransportasi)
        tesla.merk = "Tesla Model 3";            // Dari Bapak (MobilDarat)
        tesla.kapasitasBateraiKwh = 75;          // Milik MobilListrik

        tesla.infoTransportasi();
        tesla.klakson();
        tesla.isiDayaBaterai();
    }
}

// Tingkat 1 (Kakek)
class AlatTransportasi {
    String kategori;

    void infoTransportasi() {
        System.out.println("Kategori: " + kategori);
    }
}

// Tingkat 2 (Bapak)
class MobilDarat extends AlatTransportasi {
    String merk;

    void klakson() {
        System.out.println(merk + " membunyikan klakson: Tin Tin!");
    }
}

// Tingkat 3 (Anak)
class MobilListrik extends MobilDarat {
    int kapasitasBateraiKwh;

    void isiDayaBaterai() {
        System.out.println("Mengisi daya baterai " + kapasitasBateraiKwh + " kWh pada " + merk);
    }
}
