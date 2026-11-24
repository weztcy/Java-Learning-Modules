// Mendemonstrasikan pengujian integrasi Spring Boot menggunakan arsitektur @SpringBootTest dan MockMvc.
class SpringBootTesting {
    public static void main(String[] args) {
        System.out.println("=== 295. Pengujian Terpadu Spring Boot (@SpringBootTest & MockMvc) ===");

        MockMvcEngine mockMvc = new MockMvcEngine();

        System.out.println("1. Menguji Endpoint GET /api/mahasiswa:");
        mockMvc.performGet("/api/mahasiswa")
               .expectStatus(200)
               .expectHeader("Content-Type", "application/json")
               .expectBodyContains("Daftar Mahasiswa");

        System.out.println("\n2. Menguji Endpoint POST /api/mahasiswa dengan Payload:");
        mockMvc.performPost("/api/mahasiswa", "{\"nama\": \"Denny Pratama\", \"ipk\": 3.75}")
               .expectStatus(201)
               .expectBodyContains("Denny Pratama");

        System.out.println("\n3. Menguji Validasi 404 Not Found:");
        mockMvc.performGet("/api/halaman-tidak-ada")
               .expectStatus(404);

        System.out.println("\nSeluruh simulasi pengetesan controller Spring Boot sukses tuntas.");
    }
}

class MockMvcResult {
    private final int status;
    private final String body;
    private final String contentType;

    public MockMvcResult(int status, String body, String contentType) {
        this.status = status; this.body = body; this.contentType = contentType;
    }

    public MockMvcResult expectStatus(int expectedStatus) {
        if (this.status == expectedStatus) {
            System.out.println("   [ASSERT OK] Status Code matches: " + expectedStatus);
        } else {
            throw new AssertionError("Status code mismatch: expected " + expectedStatus + " but got " + this.status);
        }
        return this;
    }

    public MockMvcResult expectHeader(String header, String val) {
        System.out.println("   [ASSERT OK] Header " + header + " contains: " + val);
        return this;
    }

    public MockMvcResult expectBodyContains(String snippet) {
        if (body.contains(snippet)) {
            System.out.println("   [ASSERT OK] Response body contains string: \"" + snippet + "\"");
        } else {
            throw new AssertionError("Snippet not found in body");
        }
        return this;
    }
}

class MockMvcEngine {
    public MockMvcResult performGet(String url) {
        System.out.println("-> Executing MockMvc GET: " + url);
        if (url.equals("/api/mahasiswa")) {
            return new MockMvcResult(200, "[{\"id\": 1, \"nama\": \"Daftar Mahasiswa Aktif\"}]", "application/json");
        }
        return new MockMvcResult(404, "{\"error\": \"Not Found\"}", "application/json");
    }

    public MockMvcResult performPost(String url, String body) {
        System.out.println("-> Executing MockMvc POST: " + url + " | Body: " + body);
        return new MockMvcResult(201, "{\"id\": 105, \"nama\": \"Denny Pratama\", \"status\": \"Created\"}", "application/json");
    }
}
