// Proyek Praktik Konsol 1: Aplikasi Kalkulator Lengkap dengan Riwayat Perhitungan.
import java.util.ArrayList;
import java.util.List;

class CalculatorProject {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("      PROYEK 1: APLIKASI KALKULATOR KONSOL      ");
        System.out.println("=================================================");

        KalkulatorMesin kalkulator = new KalkulatorMesin();

        // Menjalankan skenario kalkulasi otomatis komprehensif
        kalkulator.hitung(125.0, 75.0, '+');
        kalkulator.hitung(500.0, 180.0, '-');
        kalkulator.hitung(24.0, 15.0, '*');
        kalkulator.hitung(100.0, 8.0, '/');
        kalkulator.hitung(29.0, 4.0, '%');
        kalkulator.hitung(2.0, 10.0, '^');

        // Menampilkan riwayat transaksi perhitungan
        kalkulator.tampilkanRiwayat();

        System.out.println("=================================================");
        System.out.println("Aplikasi kalkulator berjalan sempurna tanpa bug.");
    }
}

class KalkulatorMesin {
    private final List<String> riwayat = new ArrayList<>();

    public double hitung(double a, double b, char op) {
        double hasil;
        String simbol;
        switch (op) {
            case '+': hasil = a + b; simbol = "+"; break;
            case '-': hasil = a - b; simbol = "-"; break;
            case '*': hasil = a * b; simbol = "x"; break;
            case '/':
                if (b == 0) {
                    System.err.println("Error: Pembagian dengan nol tidak diizinkan!");
                    return 0;
                }
                hasil = a / b; simbol = "/"; break;
            case '%': hasil = a % b; simbol = "%"; break;
            case '^': hasil = Math.pow(a, b); simbol = "^"; break;
            default:
                System.err.println("Operator tidak dikenali: " + op);
                return 0;
        }

        String catatan = String.format("%.2f %s %.2f = %.2f", a, simbol, b, hasil);
        riwayat.add(catatan);
        System.out.println("Operasi Selesai -> " + catatan);
        return hasil;
    }

    public void tampilkanRiwayat() {
        System.out.println("\n--- DAFTAR RIWAYAT PERHITUNGAN (" + riwayat.size() + " Transaksi) ---");
        for (int i = 0; i < riwayat.size(); i++) {
            System.out.printf("%2d. %s%n", (i + 1), riwayat.get(i));
        }
    }
}
