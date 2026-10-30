// Mendemonstrasikan java.math.BigDecimal untuk kalkulasi moneter/keuangan presisi tinggi tanpa error pembulatan floating-point.
import java.math.BigDecimal;
import java.math.RoundingMode;

class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println("=== java.math.BigDecimal (Presisi Finansial) ===");

        // Masalah presisi double primitif: 0.1 + 0.2 = 0.30000000000000004
        double doubleSalah = 0.1 + 0.2;
        System.out.println("Hasil kalkulasi primitif double (0.1 + 0.2): " + doubleSalah);

        // Solusi tepat menggunakan BigDecimal berbasis String literal
        BigDecimal d1 = new BigDecimal("0.1");
        BigDecimal d2 = new BigDecimal("0.2");
        BigDecimal hasilTepat = d1.add(d2);
        System.out.println("Hasil kalkulasi presisi BigDecimal       : " + hasilTepat);

        // Pembagian dengan penentuan mode pembulatan eksplisit
        BigDecimal harga = new BigDecimal("100000.00");
        BigDecimal bagiTiga = harga.divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP);
        System.out.println("Rp 100.000 / 3 (dibulatkan 2 desimal)     : Rp " + bagiTiga);
    }
}
