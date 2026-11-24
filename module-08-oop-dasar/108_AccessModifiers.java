// Mendemonstrasikan 4 level access modifier: public, protected, default (package-private), dan private.
class AccessModifiers {
    public static void main(String[] args) {
        System.out.println("=== Access Modifiers di Java ===");

        DataAkses data = new DataAkses();
        System.out.println("Akses field public   : " + data.pesanPublic);
        System.out.println("Akses field default  : " + data.pesanDefault);
        System.out.println("Akses field protected: " + data.pesanProtected);
        
        // Field private tidak bisa diakses langsung: data.pesanPrivate (ERROR)
        System.out.println("Akses field private  : " + data.getPrivateData());
    }
}

class DataAkses {
    public String pesanPublic = "Dapat diakses dari mana saja";
    protected String pesanProtected = "Dapat diakses satu package & subclass";
    String pesanDefault = "Dapat diakses dalam package yang sama";
    private String pesanPrivate = "Hanya dapat diakses di dalam class DataAkses ini sendiri";

    // Method pembantu (helper) untuk membaca data private secara legal
    public String getPrivateData() {
        return this.pesanPrivate;
    }
}
