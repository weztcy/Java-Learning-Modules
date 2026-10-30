// Mendemonstrasikan fitur Java Records (Java 16+) sebagai pembawa data ringkas dan immutable (Data Carrier).
class RecordsDemo {
    public static void main(String[] args) {
        System.out.println("=== Java Records (Immutable Data Carrier) ===");

        // Instansiasi record MahasiswaRecord
        MahasiswaRecord mhs1 = new MahasiswaRecord("10119001", "Rian Hidayat", 3.85);

        // Membaca komponen data melalui accessor bawaan (namaRecord.komponen())
        System.out.println("NIM      : " + mhs1.nim());
        System.out.println("Nama     : " + mhs1.nama());
        System.out.println("IPK      : " + mhs1.ipk());

        // Record secara otomatis mengimplementasikan toString(), equals(), dan hashCode() secara sempurna
        System.out.println("toString : " + mhs1);

        MahasiswaRecord mhs2 = new MahasiswaRecord("10119001", "Rian Hidayat", 3.85);
        System.out.println("Apakah mhs1.equals(mhs2)? " + mhs1.equals(mhs2));
    }
}

// Record otomatis memiliki field final private, constructor kanonikal, getter, equals, hashCode, dan toString
record MahasiswaRecord(String nim, String nama, double ipk) {
    // Dapat menambahkan constructor validasi tambahan
    public MahasiswaRecord {
        if (ipk < 0.0 || ipk > 4.0) {
            throw new IllegalArgumentException("IPK harus di antara 0.0 dan 4.0");
        }
    }
}
