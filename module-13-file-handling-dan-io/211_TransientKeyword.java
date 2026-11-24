// Mendemonstrasikan penggunaan kata kunci transient untuk mengecualikan data sensitif dari serialisasi.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class TransientKeyword {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan Keyword transient ===");

        File berkas = new File("akun_aman.ser");
        AkunBankAman akun = new AkunBankAman("Budi", "PIN_RAHASIA_1234");

        try {
            // Serialisasi objek
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(berkas));
            oos.writeObject(akun);
            oos.close();

            // Deserialisasi objek
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(berkas));
            AkunBankAman akunPulih = (AkunBankAman) ois.readObject();
            ois.close();

            System.out.println("Pemilik Rekening       : " + akunPulih.pemilik);
            System.out.println("PIN Rahasia (transient): " + akunPulih.pinRahasia);
            System.out.println("Catatan: Nilai field transient bernilai null (tidak disimpan demi keamanan data).");

            berkas.deleteOnExit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class AkunBankAman implements Serializable {
    String pemilik;
    // Kata kunci transient melarang field ini dimasukkan ke dalam aliran serialisasi
    transient String pinRahasia;

    AkunBankAman(String pemilik, String pin) {
        this.pemilik = pemilik;
        this.pinRahasia = pin;
    }
}
