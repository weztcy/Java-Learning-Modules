// Mendemonstrasikan operasi manipulasi level bit pada integer (&, |, ^, ~, <<, >>, >>>).
class BitwiseOperators {
    public static void main(String[] args) {
        int x = 12; // Biner: 0000 1100
        int y = 10; // Biner: 0000 1010

        // Bitwise AND (&): 1 hanya jika kedua bit 1 -> 0000 1000 (8)
        int andResult = x & y;

        // Bitwise OR (|): 1 jika salah satu bit 1 -> 0000 1110 (14)
        int orResult = x | y;

        // Bitwise XOR (^): 1 jika kedua bit berbeda -> 0000 0110 (6)
        int xorResult = x ^ y;

        // Bitwise Shift Left (<<): Menggeser bit ke kiri (mengalikan 2^n)
        int shiftLeft = x << 1; // 12 * 2 = 24

        // Bitwise Shift Right (>>): Menggeser bit ke kanan (membagi 2^n)
        int shiftRight = x >> 1; // 12 / 2 = 6

        System.out.println("=== Operator Bitwise ===");
        System.out.println("x = " + x + " (1100b), y = " + y + " (1010b)");
        System.out.println("x & y  : " + andResult);
        System.out.println("x | y  : " + orResult);
        System.out.println("x ^ y  : " + xorResult);
        System.out.println("x << 1 : " + shiftLeft);
        System.out.println("x >> 1 : " + shiftRight);
    }
}
