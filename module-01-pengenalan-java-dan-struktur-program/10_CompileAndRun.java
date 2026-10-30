// Mendemonstrasikan alur kompilasi dan eksekusi program di Java Virtual Machine (JVM).
class CompileAndRun {
    public static void main(String[] args) {
        System.out.println("=== Alur Kompilasi dan Eksekusi Program Java ===");
        // Langkah 1: Penulisan berkas kode sumber dengan ekstensi .java
        System.out.println("Langkah 1: Menulis berkas kode sumber (Source Code: Program.java)");
        
        // Langkah 2: Kompiler javac mengubah source code menjadi bytecode (.class)
        System.out.println("Langkah 2: Menjalankan 'javac Program.java' untuk menghasilkan bytecode (Program.class)");
        
        // Langkah 3: JVM membaca bytecode dan mengeksekusinya ke bahasa mesin
        System.out.println("Langkah 3: Menjalankan 'java Program' di mana JVM menerjemahkan bytecode ke mesin host");
        
        // Menampilkan versi runtime Java yang sedang digunakan saat ini
        System.out.println("Java Runtime Version: " + System.getProperty("java.version"));
    }
}
