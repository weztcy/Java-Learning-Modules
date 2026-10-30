// Mendemonstrasikan operator penugasan dasar dan compound assignment operators (+=, -=, *=, /=, %=).
class AssignmentOperators {
    public static void main(String[] args) {
        // Penugasan dasar (=)
        int x = 50;
        System.out.println("Nilai awal x       : " + x);

        // Compound assignment mempersingkat penulisan x = x + 10 menjadi x += 10
        x += 10;
        System.out.println("Setelah x += 10    : " + x);

        x -= 20;
        System.out.println("Setelah x -= 20    : " + x);

        x *= 2;
        System.out.println("Setelah x *= 2     : " + x);

        x /= 4;
        System.out.println("Setelah x /= 4     : " + x);

        x %= 7;
        System.out.println("Setelah x %= 7     : " + x);
    }
}
