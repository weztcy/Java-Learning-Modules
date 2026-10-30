// Mendemonstrasikan pembacaan objek terserialisasi dari disk (Deserialization) dengan ObjectInputStream.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ObjectInputStreamDemo {
    public static void main(String[] args) {
        System.out.println("=== Membaca Objek dengan ObjectInputStream ===");

        File berkas = new File("produk_ois.ser");

        try {
            // Menyiapkan file objek terserialisasi
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(berkas));
            oos.writeObject(new BarangSer("Laptop Ultrabook", 14500000));
            oos.close();

            // Melakukan deserialisasi objek kembali ke memori
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(berkas))) {
                BarangSer barang = (BarangSer) ois.readObject();
                System.out.println("Objek berhasil dibaca kembali:");
                System.out.println("Nama Produk : " + barang.nama);
                System.out.println("Harga       : Rp " + barang.harga);
            }

            berkas.deleteOnExit();
        } catch (Exception e) {
            System.out.println("Error deserialisasi: " + e.getMessage());
        }
    }
}

class BarangSer implements Serializable {
    private static final long serialVersionUID = 1L;
    String nama;
    double harga;

    BarangSer(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
}
