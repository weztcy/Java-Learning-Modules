// Mendemonstrasikan method overriding: subclass menyediakan implementasi spesifik dari method superclass.
class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("=== Method Overriding (@Override) ===");

        HewanSuara h1 = new KucingSuara();
        HewanSuara h2 = new AnjingSuara();

        h1.bersuara(); // Memanggil implementasi override Kucing
        h2.bersuara(); // Memanggil implementasi override Anjing
    }
}

class HewanSuara {
    void bersuara() {
        System.out.println("Hewan mengeluarkan suara alami.");
    }
}

class KucingSuara extends HewanSuara {
    @Override
    void bersuara() {
        System.out.println("Kucing bersuara: Meong!");
    }
}

class AnjingSuara extends HewanSuara {
    @Override
    void bersuara() {
        System.out.println("Anjing bersuara: Guk Guk!");
    }
}
