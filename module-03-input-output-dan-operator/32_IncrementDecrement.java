// Mendemonstrasikan perbedaan pre-increment/decrement (++x, --x) dan post-increment/decrement (x++, x--).
class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        // Post-increment (a++): nilai 'a' digunakan terlebih dahulu dalam evaluasi, baru dinaikkan 1
        int hasilPost = a++;
        
        // Pre-increment (++b): nilai 'b' dinaikkan 1 terlebih dahulu, baru digunakan dalam evaluasi
        int hasilPre = ++b;

        System.out.println("=== Increment dan Decrement ===");
        System.out.println("Hasil a++ (post) : " + hasilPost + ", Nilai akhir a: " + a);
        System.out.println("Hasil ++b (pre)  : " + hasilPre + ", Nilai akhir b: " + b);

        // Operasi decrement
        int c = 5;
        System.out.println("Nilai c awal     : " + c);
        System.out.println("Nilai c-- (post) : " + (c--));
        System.out.println("Nilai --c (pre)  : " + (--c));
    }
}
