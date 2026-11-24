// Program kalkulator perhitungan potongan harga dan total pembayaran berdasarkan nominal belanja.
class DiscountCalculator {
    public static void main(String[] args) {
        double totalBelanja = 750000.0;
        boolean statusMember = true;
        double persentaseDiskon = 0.0;

        System.out.println("=== Kalkulator Diskon Belanja ===");
        System.out.printf("Total Belanja Awal: Rp %,.2f%n", totalBelanja);
        System.out.println("Status Membership : " + (statusMember ? "MEMBER VIP" : "NON-MEMBER"));

        // Menentukan tier diskon berdasarkan nilai belanja
        if (totalBelanja >= 1000000.0) {
            persentaseDiskon = 0.20; // Diskon 20%
        } else if (totalBelanja >= 500000.0) {
            persentaseDiskon = 0.15; // Diskon 15%
        } else if (totalBelanja >= 250000.0) {
            persentaseDiskon = 0.10; // Diskon 10%
        }

        // Tambahan diskon khusus untuk pemegang kartu member
        if (statusMember) {
            persentaseDiskon += 0.05; // Tambahan 5%
        }

        double nominalDiskon = totalBelanja * persentaseDiskon;
        double totalBayar = totalBelanja - nominalDiskon;

        System.out.printf("Total Diskon (%.0f%%) : Rp %,.2f%n", (persentaseDiskon * 100), nominalDiskon);
        System.out.printf("Total Akhir Bayar : Rp %,.2f%n", totalBayar);
    }
}
