// Mendemonstrasikan arsitektur dasar Spring Boot: Banner, bootstrap aplikasi, dan auto-configuration.
class SpringBootBasic {
    public static void main(String[] args) {
        // Menampilkan Banner Spring Boot
        System.out.println("  .   ____          _            __ _ _");
        System.out.println(" /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\");
        System.out.println("( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\");
        System.out.println(" \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )");
        System.out.println("  '  |____| .__|_| |_|_| |_\\__, | / / / /");
        System.out.println(" =========|_|==============|___/=/_/_/_/");
        System.out.println(" :: Spring Boot ::                (v3.2.0)\n");

        System.out.println("2026-10-17 21:00:00.123  INFO 1234 --- [           main] c.b.s.SpringBootBasicApplication        : Starting SpringBootBasicApplication v1.0.0");
        System.out.println("2026-10-17 21:00:00.125  INFO 1234 --- [           main] c.b.s.SpringBootBasicApplication        : No active profile set, falling back to 1 default profile: \"default\"");
        System.out.println("2026-10-17 21:00:01.450  INFO 1234 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)");
        System.out.println("2026-10-17 21:00:01.510  INFO 1234 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]");
        System.out.println("2026-10-17 21:00:01.890  INFO 1234 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path ''");
        System.out.println("2026-10-17 21:00:01.900  INFO 1234 --- [           main] c.b.s.SpringBootBasicApplication        : Started SpringBootBasicApplication in 1.95 seconds (process running for 2.45)");

        System.out.println("\n=== Penjelasan Inti Konsep Spring Boot ===");
        System.out.println("1. @SpringBootApplication: Menggabungkan @Configuration, @EnableAutoConfiguration, dan @ComponentScan.");
        System.out.println("2. Embedded Web Server: Tomcat terpasang bawaan tanpa perlu install web server eksternal terpisah.");
        System.out.println("3. Opinionated Defaults: Konfigurasi default cerdas siap pakai mempercepat time-to-market pengembangan.");
    }
}
