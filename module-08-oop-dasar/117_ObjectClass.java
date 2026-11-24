// Mendemonstrasikan bahwa java.lang.Object adalah superclass akar dari semua class di Java.
class ObjectClass {
    public static void main(String[] args) {
        System.out.println("=== java.lang.Object sebagai Akar Hierarki ===");

        KendaraanUmum bus = new KendaraanUmum();

        // Menggunakan method bawaan class Object
        System.out.println("Class Type (getClass) : " + bus.getClass().getName());
        System.out.println("Hash code default     : " + bus.hashCode());
        System.out.println("String representasi   : " + bus.toString());
        System.out.println("Apakah bus instance of Object? " + (bus instanceof Object));
    }
}

class KendaraanUmum {
    // Secara implisit mewarisi class Object: class KendaraanUmum extends Object
}
