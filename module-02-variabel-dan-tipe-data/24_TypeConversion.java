// Mendemonstrasikan implicit type conversion (widening conversion) yang aman dan otomatis dilakukan JVM.
class TypeConversion {
    public static void main(String[] args) {
        // Widening conversion terjadi otomatis ketika tipe berukuran lebih kecil dipindahkan ke tipe lebih besar
        byte angkaByte = 42;
        int angkaInt = angkaByte; // byte (8-bit) otomatis dikonversi ke int (32-bit)
        double angkaDouble = angkaInt; // int otomatis dikonversi ke double (64-bit)

        System.out.println("=== Implicit Type Conversion (Widening) ===");
        System.out.println("Nilai awal (byte)   : " + angkaByte);
        System.out.println("Otomatis ke (int)   : " + angkaInt);
        System.out.println("Otomatis ke (double): " + angkaDouble);
        System.out.println("Konversi otomatis aman karena tidak menghilangkan kapasitas informasi.");
    }
}
