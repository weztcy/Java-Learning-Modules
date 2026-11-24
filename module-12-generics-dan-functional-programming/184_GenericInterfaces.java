// Mendemonstrasikan pembuatan Generic Interface dan penerapannya pada class konkret.
import java.util.HashMap;
import java.util.Map;

class GenericInterfaces {
    public static void main(String[] args) {
        System.out.println("=== Generic Interfaces ===");

        RepositoriData<String, Integer> repoUsia = new RepositoriMap<>();
        repoUsia.simpan("Budi", 22);
        repoUsia.simpan("Siti", 20);

        System.out.println("Usia Budi : " + repoUsia.cariDenganKunci("Budi"));
        System.out.println("Usia Siti : " + repoUsia.cariDenganKunci("Siti"));
    }
}

// Generic Interface dengan 2 type parameter: K (Key) dan V (Value)
interface RepositoriData<K, V> {
    void simpan(K kunci, V nilai);
    V cariDenganKunci(K kunci);
}

class RepositoriMap<K, V> implements RepositoriData<K, V> {
    private Map<K, V> database = new HashMap<>();

    @Override
    public void simpan(K kunci, V nilai) {
        database.put(kunci, nilai);
    }

    @Override
    public V cariDenganKunci(K kunci) {
        return database.get(kunci);
    }
}
