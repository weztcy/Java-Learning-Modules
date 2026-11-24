// Mendemonstrasikan arsitektur REST Controller: Mapping HTTP methods (GET, POST, PUT, DELETE) dan JSON Response.
import java.util.ArrayList;
import java.util.List;

class SpringRestController {
    public static void main(String[] args) {
        System.out.println("=== 291. REST Controller & HTTP Endpoint Mapping ===");

        // Inisialisasi controller
        ProdukRestController controller = new ProdukRestController();

        System.out.println("--- 1. HTTP GET /api/v1/produk (Mengambil Semua Produk) ---");
        System.out.println("Status: 200 OK | Content-Type: application/json");
        System.out.println(controller.getAllProduk());

        System.out.println("\n--- 2. HTTP GET /api/v1/produk/{id} (Path Variable) ---");
        System.out.println("Request: GET /api/v1/produk/1");
        System.out.println("Status: 200 OK | Response:");
        System.out.println(controller.getProdukById(1));

        System.out.println("\n--- 3. HTTP POST /api/v1/produk (Request Body JSON) ---");
        String payloadBaru = "{\"nama\": \"Headphone Bluetooth ANC\", \"harga\": 890000.0}";
        System.out.println("Request: POST /api/v1/produk | Payload: " + payloadBaru);
        System.out.println("Status: 201 Created | Response:");
        System.out.println(controller.createProduk("Headphone Bluetooth ANC", 890000.0));

        System.out.println("\n--- 4. HTTP DELETE /api/v1/produk/{id} ---");
        System.out.println("Request: DELETE /api/v1/produk/2");
        System.out.println("Status: 204 No Content | " + controller.deleteProduk(2));
    }
}

class ProdukRestController {
    private final List<ProdukDTO> database = new ArrayList<>();

    public ProdukRestController() {
        database.add(new ProdukDTO(1, "Laptop ASUS ZenBook", 14500000.0));
        database.add(new ProdukDTO(2, "Mouse Wireless Pro", 450000.0));
    }

    public String getAllProduk() {
        StringBuilder json = new StringBuilder("[\n");
        for (int i = 0; i < database.size(); i++) {
            json.append("  ").append(database.get(i).toJson());
            if (i < database.size() - 1) json.append(",");
            json.append("\n");
        }
        json.append("]");
        return json.toString();
    }

    public String getProdukById(int id) {
        for (ProdukDTO p : database) {
            if (p.id == id) return p.toJson();
        }
        return "{\"error\": \"Produk dengan ID " + id + " tidak ditemukan\"}";
    }

    public String createProduk(String nama, double harga) {
        int newId = database.size() + 1;
        ProdukDTO p = new ProdukDTO(newId, nama, harga);
        database.add(p);
        return p.toJson();
    }

    public String deleteProduk(int id) {
        database.removeIf(p -> p.id == id);
        return "Produk ID " + id + " berhasil dihapus dari sistem.";
    }
}

class ProdukDTO {
    final int id;
    final String nama;
    final double harga;
    ProdukDTO(int id, String nama, double harga) {
        this.id = id; this.nama = nama; this.harga = harga;
    }
    String toJson() {
        return String.format("{\"id\": %d, \"nama\": \"%s\", \"harga\": %.2f}", id, nama, harga);
    }
}
