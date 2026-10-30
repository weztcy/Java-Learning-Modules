// Mendemonstrasikan pemanggilan static method yang terikat pada class tanpa perlu instansiasi objek.
class StaticMethods {
    // Static method milik class KalkulatorSederhana
    static double celciusKeFahrenheit(double celcius) {
        return (celcius * 9.0 / 5.0) + 32.0;
    }

    static double fahrenheitKeCelcius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        System.out.println("=== Static Methods ===");
        
        // Static method dapat langsung dipanggil dengan menyebutkan namanya di dalam class yang sama
        double suhuC = 100.0;
        double suhuF = celciusKeFahrenheit(suhuC);
        System.out.println(suhuC + " C = " + suhuF + " F");

        double konversiBalik = fahrenheitKeCelcius(suhuF);
        System.out.println(suhuF + " F = " + konversiBalik + " C");
    }
}
