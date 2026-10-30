// Mendemonstrasikan perbedaan perbandingan referensi (==) dan isi objek (.equals()).
class StringComparison {
    public static void main(String[] args) {
        System.out.println("=== Perbandingan String (== vs .equals) ===");

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java"); // Objek baru di memori Heap di luar String Pool

        // Operator == membandingkan alamat memori (referensi)
        System.out.println("str1 == str2 (String Pool) : " + (str1 == str2)); // true
        System.out.println("str1 == str3 (Objek Heap)  : " + (str1 == str3)); // false

        // Method .equals() membandingkan konten karakter yang tersimpan di dalam objek
        System.out.println("str1.equals(str3)          : " + str1.equals(str3)); // true
        System.out.println("str1.equalsIgnoreCase(\"JAVA\"): " + str1.equalsIgnoreCase("JAVA")); // true
        System.out.println("str1.compareTo(\"Kotlin\")   : " + str1.compareTo("Kotlin"));
    }
}
