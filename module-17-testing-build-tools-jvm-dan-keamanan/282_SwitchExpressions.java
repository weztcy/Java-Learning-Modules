// Mendemonstrasikan fitur modern Java 14+: Switch Expressions dengan sintaks panah (->), yield, dan multi-value cases.
class SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("=== 282. Switch Expressions Modern (Java 14+) ===");

        Hari hariIni = Hari.SABTU;

        // 1. Switch expression mengembalikan nilai secara langsung dengan sintaks panah (->)
        String tipeHari = switch (hariIni) {
            case SENIN, SELASA, RABU, KAMIS, JUMAT -> "Hari Kerja (Weekday)";
            case SABTU, MINGGU -> "Hari Libur Akhir Pekan (Weekend)";
        };
        System.out.println("Hari: " + hariIni + " -> Tipe: " + tipeHari);

        // 2. Switch expression dengan blok logika kompleks dan keyword 'yield'
        int tingkatKepuasan = 4;
        String responLayanan = switch (tingkatKepuasan) {
            case 5 -> "Luar Biasa Memuaskan!";
            case 4 -> {
                System.out.println("   [Log] Pelanggan memberikan rating sangat baik.");
                yield "Sangat Puas";
            }
            case 3 -> "Cukup Baik";
            case 1, 2 -> "Perlu Perbaikan Segera";
            default -> "Rating Tidak Dikenal";
        };
        System.out.println("Rating: " + tingkatKepuasan + " -> Respon: " + responLayanan);
    }
}

enum Hari {
    SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
}
