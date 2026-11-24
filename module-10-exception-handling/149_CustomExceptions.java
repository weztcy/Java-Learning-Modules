// Mendemonstrasikan pembuatan class Exception kustom sendiri untuk memodelkan domain bisnis spesifik.
class CustomExceptions {
    public static void main(String[] args) {
        System.out.println("=== Custom Exceptions ===");

        AkunBank akun = new AkunBank(500000);

        try {
            akun.tarikUang(200000);
            akun.tarikUang(400000); // Akan melempar SaldoTidakMencukupiException
        } catch (SaldoTidakMencukupiException e) {
            System.out.println("-> Transaksi Ditolak: " + e.getMessage());
            System.out.printf("   Kekurangan Saldo: Rp %,.2f%n", e.getJumlahKekurangan());
        }
    }
}

// Custom Exception class
class SaldoTidakMencukupiException extends Exception {
    private double jumlahKekurangan;

    public SaldoTidakMencukupiException(double kekurangan) {
        super("Saldo rekening tidak mencukupi untuk penarikan ini.");
        this.jumlahKekurangan = kekurangan;
    }

    public double getJumlahKekurangan() {
        return jumlahKekurangan;
    }
}

class AkunBank {
    private double saldo;

    AkunBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    void tarikUang(double nominal) throws SaldoTidakMencukupiException {
        System.out.printf("Mencoba tarik: Rp %,.2f | Saldo saat ini: Rp %,.2f%n", nominal, saldo);
        if (nominal > saldo) {
            throw new SaldoTidakMencukupiException(nominal - saldo);
        }
        saldo -= nominal;
        System.out.printf("Penarikan berhasil. Sisa saldo: Rp %,.2f%n", saldo);
    }
}
