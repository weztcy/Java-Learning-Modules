// Program praktis menghitung nilai faktorial (N!) menggunakan perulangan for.
class FactorialLoop {
    public static void main(String[] args) {
        int n = 7;
        long hasilFaktorial = 1L;

        System.out.println("=== Perhitungan Faktorial (" + n + "!) ===");

        // Faktorial dihitung dengan mengalikan bilangan beruntun dari 1 s.d. n
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            hasilFaktorial *= i;
            System.out.print(i + (i > 1 ? " x " : ""));
        }

        System.out.println(" = " + hasilFaktorial);
    }
}
