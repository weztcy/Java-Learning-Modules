// Mendemonstrasikan method-method manipulasi string esensial di Java.
class StringMethods {
    public static void main(String[] args) {
        System.out.println("=== Metode-Metode Dasar Class String ===");

        String teks = "  Belajar Bahasa Java Modern  ";

        System.out.println("Teks Asli         : '" + teks + "'");
        System.out.println("Panjang (.length()): " + teks.length());
        System.out.println("Karakter indeks 4 : " + teks.charAt(4));
        System.out.println("Potong Spasi(trim): '" + teks.trim() + "'");
        System.out.println("Huruf Besar       : " + teks.toUpperCase().trim());
        System.out.println("Huruf Kecil       : " + teks.toLowerCase().trim());
        System.out.println("Substring(2, 9)   : '" + teks.substring(2, 9) + "'");
    }
}
