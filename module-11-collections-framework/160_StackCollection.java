// Mendemonstrasikan struktur data Stack dengan prinsip LIFO (Last-In, First-Out).
import java.util.Stack;

class StackCollection {
    public static void main(String[] args) {
        System.out.println("=== Struktur Data Stack (LIFO) ===");

        Stack<String> tumpukanBuku = new Stack<>();

        // Menumpuk elemen dengan push()
        tumpukanBuku.push("Buku 1: Pemrograman Java");
        tumpukanBuku.push("Buku 2: Algoritma & Struktur Data");
        tumpukanBuku.push("Buku 3: Rekayasa Perangkat Lunak");

        // Melihat elemen puncak tanpa mengambilnya dengan peek()
        System.out.println("Buku di puncak tumpukan (peek): " + tumpukanBuku.peek());

        // Mengambil dan menghapus elemen puncak dengan pop()
        System.out.println("Mengambil buku teratas (pop)  : " + tumpukanBuku.pop());
        System.out.println("Buku di puncak sekarang       : " + tumpukanBuku.peek());
    }
}
