// Mendemonstrasikan pencetakan teks tanpa menambahkan baris baru otomatis.
class SystemOutPrint {
    public static void main(String[] args) {
        // System.out.print tidak menyisipkan baris baru di akhir keluaran
        System.out.print("Kata Pertama ");
        System.out.print("dan ");
        System.out.print("Kata Kedua ");
        System.out.print("berada dalam baris yang sama.");
        
        // Mencetak baris kosong di akhir agar prompt terminal rapi
        System.out.println();
    }
}
