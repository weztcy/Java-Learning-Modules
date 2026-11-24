// Mendemonstrasikan perancangan Custom Annotation kustom menggunakan @interface dan retensi RUNTIME.
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

class CustomAnnotations {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Custom Annotations & Runtime Processing ===");

        LayananBisnis layanan = new LayananBisnis();
        Method method = layanan.getClass().getMethod("eksekusiProsesKritis");

        // Memeriksa keberadaan anotasi kustom pada method
        if (method.isAnnotationPresent(PeranAkses.class)) {
            PeranAkses anotasi = method.getAnnotation(PeranAkses.class);
            System.out.println("Method '" + method.getName() + "' diproteksi!");
            System.out.println("Peran Diperlukan : " + anotasi.role());
            System.out.println("Level Otorisasi  : " + anotasi.level());
        }

        layanan.eksekusiProsesKritis();
    }
}

// Mendefinisikan custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface PeranAkses {
    String role() default "USER";
    int level() default 1;
}

class LayananBisnis {
    @PeranAkses(role = "ADMINISTRATOR", level = 5)
    public void eksekusiProsesKritis() {
        System.out.println("-> Eksekusi operasi bisnis berlevel tinggi berhasil.");
    }
}
