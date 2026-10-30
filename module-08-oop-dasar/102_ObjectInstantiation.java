// Mendemonstrasikan proses instansiasi beberapa objek independen dari satu class yang sama.
class ObjectInstantiation {
    public static void main(String[] args) {
        System.out.println("=== Instansiasi Objek Independen ===");

        // Setiap objek memiliki salinan atributnya sendiri di memori heap
        KucingInstansiasi kucing1 = new KucingInstansiasi();
        kucing1.nama = "Mimi";
        kucing1.warna = "Oranye";

        KucingInstansiasi kucing2 = new KucingInstansiasi();
        kucing2.nama = "Luna";
        kucing2.warna = "Hitam Putih";

        System.out.println("Kucing Pertama -> Nama: " + kucing1.nama + ", Warna: " + kucing1.warna);
        System.out.println("Kucing Kedua   -> Nama: " + kucing2.nama + ", Warna: " + kucing2.warna);
    }
}

class KucingInstansiasi {
    String nama;
    String warna;
}
