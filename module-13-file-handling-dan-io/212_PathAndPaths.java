// Mendemonstrasikan penggunaan antarmuka Path dan class Paths pada Java NIO.2 untuk penanganan jalur file modern.
import java.nio.file.Path;
import java.nio.file.Paths;

class PathAndPaths {
    public static void main(String[] args) {
        System.out.println("=== Java NIO.2: Path dan Paths ===");

        // Membuat objek Path yang merepresentasikan file
        Path pathFile = Paths.get("proyek", "dokumen", "laporan.pdf");

        System.out.println("Nama File        : " + pathFile.getFileName());
        System.out.println("Direktori Induk  : " + pathFile.getParent());
        System.out.println("Jumlah Elemen    : " + pathFile.getNameCount());
        System.out.println("Path Absolut     : " + pathFile.toAbsolutePath());
        System.out.println("Apakah absolut?  : " + pathFile.isAbsolute());
    }
}
