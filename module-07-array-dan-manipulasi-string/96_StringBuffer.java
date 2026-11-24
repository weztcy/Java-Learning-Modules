// Mendemonstrasikan StringBuffer: versi StringBuilder yang thread-safe dengan method synchronized.
class StringBuffer {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan java.lang.StringBuffer ===");

        // StringBuffer aman digunakan dalam lingkungan multi-threading
        java.lang.StringBuffer buffer = new java.lang.StringBuffer("Belajar");

        buffer.append(" Multithreading");
        buffer.append(" di Java");
        System.out.println("Isi Buffer: " + buffer.toString());

        buffer.delete(7, 23); // Menghapus kata ' Multithreading'
        System.out.println("Setelah delete(7, 23): " + buffer.toString());
    }
}
