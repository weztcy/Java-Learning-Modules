// Mendemonstrasikan tipe data String sebagai tipe referensi teks di Java.
class StringDataType {
    public static void main(String[] args) {
        // String adalah objek representasi urutan karakter, bersifat immutable (tidak dapat diubah isinya)
        String sapaan = "Halo";
        String target = "Dunia Java";

        // Menggabungkan string dan memanggil method bawaan objek String
        String kalimatLengkap = sapaan + ", " + target + "!";
        int panjangKalimat = kalimatLengkap.length();

        System.out.println("=== Tipe Referensi: String ===");
        System.out.println("Isi String     : " + kalimatLengkap);
        System.out.println("Panjang String : " + panjangKalimat + " karakter");
        System.out.println("Huruf Kapital  : " + kalimatLengkap.toUpperCase());
    }
}
