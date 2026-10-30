// Mendemonstrasikan operator logika boolean: AND (&&), OR (||), dan NOT (!).
class LogicalOperators {
    public static void main(String[] args) {
        boolean punyaSIM = true;
        boolean pakaiHelm = false;
        int usia = 18;

        // AND (&&) bernilai true jika kedua kondisi bernilai true
        boolean bolehMengemudi = (usia >= 17) && punyaSIM;

        // OR (||) bernilai true jika salah satu atau kedua kondisi bernilai true
        boolean kenaTeguran = (!punyaSIM) || (!pakaiHelm);

        // NOT (!) membalikkan nilai kebenaran logika
        boolean tidakPakaiHelm = !pakaiHelm;

        System.out.println("=== Operator Logika ===");
        System.out.println("Boleh Mengemudi (Usia>=17 && SIM): " + bolehMengemudi);
        System.out.println("Kena Teguran (No SIM || No Helm) : " + kenaTeguran);
        System.out.println("Nilai NOT Helm (!pakaiHelm)       : " + tidakPakaiHelm);
    }
}
