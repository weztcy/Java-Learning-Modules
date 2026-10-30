// Mendemonstrasikan percabangan switch bersarang (nested switch) untuk klasifikasi bertingkat.
class NestedSwitch {
    public static void main(String[] args) {
        int tingkatKelas = 2; // Tahun ke-2
        char peminatan = 'I';  // 'I' = Informatika, 'S' = Sistem Informasi

        System.out.println("=== Nested switch Statement ===");
        System.out.println("Tingkat: " + tingkatKelas + ", Peminatan: " + peminatan);

        switch (tingkatKelas) {
            case 1:
                System.out.println("Mata Kuliah: Pengantar Sains Komputer & Matematika Diskrit");
                break;
            case 2:
                // Switch bersarang untuk menentukan fokus jurusan di tingkat kedua
                switch (peminatan) {
                    case 'I':
                        System.out.println("Mata Kuliah: Struktur Data dan Pemrograman Java");
                        break;
                    case 'S':
                        System.out.println("Mata Kuliah: Analisis Proses Bisnis dan Basis Data");
                        break;
                    default:
                        System.out.println("Peminatan tidak dikenali.");
                        break;
                }
                break;
            default:
                System.out.println("Tingkat akhir: Praktik Kerja Lapangan dan Tugas Akhir.");
                break;
        }
    }
}
