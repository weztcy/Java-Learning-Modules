// Mendemonstrasikan HashMap: pemetaan pasangan kunci-nilai (key-value) berbasis hashing dengan akses cepat O(1).
import java.util.HashMap;
import java.util.Map;

class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("=== java.util.HashMap (Key-Value) ===");

        Map<String, Integer> stokBarang = new HashMap<>();

        // Menyimpan data dengan put(key, value)
        stokBarang.put("Laptop", 15);
        stokBarang.put("Mouse", 50);
        stokBarang.put("Keyboard", 30);

        // Membaca nilai berdasarkan kunci
        System.out.println("Stok Laptop: " + stokBarang.get("Laptop"));
        System.out.println("Apakah kunci 'Monitor' ada? " + stokBarang.containsKey("Monitor"));

        // Mengiterasi seluruh key dan value
        System.out.println("\nDaftar Lengkap Inventaris:");
        for (Map.Entry<String, Integer> entri : stokBarang.entrySet()) {
            System.out.println(" - " + entri.getKey() + " : " + entri.getValue() + " unit");
        }
    }
}
