// Mendemonstrasikan Exception Chaining: membungkus exception tingkat rendah ke dalam exception tingkat aplikasi dengan menyertakan akar penyebabnya (cause).
class ExceptionChaining {
    public static void main(String[] args) {
        System.out.println("=== Exception Chaining (Rantai Penyebab) ===");

        try {
            prosesTransaksiLayanan();
        } catch (AplikasiServiceException e) {
            System.out.println("-> Tertangkap Exception Aplikasi: " + e.getMessage());
            System.out.println("   Akar penyebab (Cause): " + e.getCause());
        }
    }

    static void prosesTransaksiLayanan() throws AplikasiServiceException {
        try {
            // Simulasi error database level rendah
            throw new java.sql.SQLException("Koneksi port 3306 ditolak oleh database server.");
        } catch (java.sql.SQLException dbError) {
            // Membungkus SQLException ke dalam AplikasiServiceException sambil menyertakan penyebab aslinya (dbError)
            throw new AplikasiServiceException("Gagal menyelesaikan transaksi perbankan pengguna", dbError);
        }
    }
}

class AplikasiServiceException extends Exception {
    public AplikasiServiceException(String pesan, Throwable penyebab) {
        super(pesan, penyebab);
    }
}
