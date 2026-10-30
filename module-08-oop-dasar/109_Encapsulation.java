// Mendemonstrasikan prinsip Enkapsulasi: membungkus data internal dan memvalidasi perubahan nilai.
class Encapsulation {
    public static void main(String[] args) {
        System.out.println("=== Prinsip Enkapsulasi ===");

        DompetDigital dompet = new DompetDigital("Budi Santoso", 50000);
        dompet.isiSaldo(25000);
        dompet.tarikSaldo(40000);
        dompet.tarikSaldo(100000); // Penarikan melebihi saldo akan ditolak validasi
    }
}

class DompetDigital {
    // Data sensitif diproteksi dengan modifier private
    private String pemilik;
    private double saldo;

    DompetDigital(String pemilik, double saldoAwal) {
        this.pemilik = pemilik;
        this.saldo = Math.max(0, saldoAwal);
    }

    public void isiSaldo(double nominal) {
        if (nominal > 0) {
            saldo += nominal;
            System.out.printf("Berhasil top up Rp %,.2f. Saldo sekarang: Rp %,.2f%n", nominal, saldo);
        } else {
            System.out.println("Nominal isi saldo harus positif!");
        }
    }

    public void tarikSaldo(double nominal) {
        if (nominal > saldo) {
            System.out.printf("Gagal tarik Rp %,.2f: Saldo tidak mencukupi (Saldo: Rp %,.2f)%n", nominal, saldo);
        } else {
            saldo -= nominal;
            System.out.printf("Berhasil tarik Rp %,.2f. Sisa saldo: Rp %,.2f%n", nominal, saldo);
        }
    }
}
