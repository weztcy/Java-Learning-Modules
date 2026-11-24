// Mendemonstrasikan override method equals() untuk membandingkan kesamaan konten data dua objek.
import java.util.Objects;

class EqualsMethod {
    public static void main(String[] args) {
        System.out.println("=== Override Method equals() ===");

        KTP ktp1 = new KTP("3201012345670001", "Ahmad Fauzi");
        KTP ktp2 = new KTP("3201012345670001", "Ahmad Fauzi");
        KTP ktp3 = new KTP("3201019999990002", "Dewi Lestari");

        System.out.println("ktp1 == ktp2 (Perbandingan Alamat) : " + (ktp1 == ktp2)); // false karena dua objek heap berbeda
        System.out.println("ktp1.equals(ktp2) (Isi Konten KTP) : " + ktp1.equals(ktp2)); // true karena NIK sama
        System.out.println("ktp1.equals(ktp3)                  : " + ktp1.equals(ktp3)); // false
    }
}

class KTP {
    private String nik;
    private String nama;

    KTP(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KTP ktp = (KTP) o;
        return Objects.equals(nik, ktp.nik);
    }
}
