// Mendemonstrasikan Java Reflection API untuk menginspeksi metadata class, method, dan field saat program berjalan.
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class ReflectionAPI {
    public static void main(String[] args) {
        System.out.println("=== Java Reflection API ===");

        Class<?> clazz = RekeningRahasia.class;

        System.out.println("Nama Class Lengkap: " + clazz.getName());
        System.out.println("Superclass        : " + clazz.getSuperclass().getSimpleName());

        System.out.println("\nDaftar Field:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(" - " + f.getType().getSimpleName() + " " + f.getName());
        }

        System.out.println("\nDaftar Method:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(" - " + m.getName() + "()");
        }
    }
}

class RekeningRahasia {
    private String nomorRekening = "REK-990011";
    public double saldo = 75000000.0;

    public void transferDana(double jumlah) {
        this.saldo -= jumlah;
    }

    private void cetakInternal() {
        System.out.println(nomorRekening);
    }
}
