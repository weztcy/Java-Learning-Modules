# MODUL 14: Standard Library dan Fitur Bahasa Modern

## Deskripsi Modul
Modul ini membahas kekayaan pustaka standar bawaan (*Java Standard Library*) serta fitur-fitur modern bahasa Java hingga versi LTS (Java 17). Materi meliputi kalkulasi matematika ilmiah (`Math` tingkat lanjut), pembangkit bilangan acak biasa (`Random`) dan aman secara kriptografis (`SecureRandom`), komputasi angka raksasa (`BigInteger`), kalkulasi finansial presisi tinggi tanpa pembulatan mengambang (`BigDecimal`), paket tanggal dan waktu modern `java.time` (`LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, `DateTimeFormatter`), pencegahan `NullPointerException` dengan wrapper kontainer `Optional`, identitas global `UUID`, tipe terhitung `Enum` berkemampuan penuh, anotasi bawaan serta perancangan *Custom Annotations*, analisis metadata refleksi (*Reflection API*), hingga sintaks modern *Records* (Java 16+) dan pewarisan terproteksi *Sealed Classes* (Java 17).

## Tujuan Pembelajaran
Setelah menyelesaikan modul ini, pembelajar diharapkan mampu:
1. Menerapkan operasi trigonometri dan logaritma dengan class `Math`.
2. Menghasilkan token acak yang aman dari peretasan menggunakan `SecureRandom`.
3. Menggunakan `BigDecimal` untuk transaksi moneter perbankan yang bebas dari cacat floating-point.
4. Mengelola tanggal, jam, dan zona waktu dunia (WIB, UTC, JST) secara tepat dengan API `java.time`.
5. Mengeliminasi bug `NullPointerException` menggunakan class pembungkus `Optional`.
6. Merancang tipe `Enum` yang memiliki atribut data dan logika pemrosesan mandiri.
7. Membuat dan memproses *Custom Annotations* saat program berjalan menggunakan *Reflection API*.
8. Membangun model *Data Transfer Object* (DTO) bersih dengan *Records* dan mengontrol hierarki dengan *Sealed Classes*.

---

## Daftar Materi dan Submodul

| No | Berkas | Materi Pembelajaran |
|---|---|---|
| 219 | [219_MathClassAdvanced.java](219_MathClassAdvanced.java) | Operasi matematika lanjutan |
| 220 | [220_RandomClass.java](220_RandomClass.java) | Class `Random` |
| 221 | [221_SecureRandom.java](221_SecureRandom.java) | Class `SecureRandom` |
| 222 | [222_BigInteger.java](222_BigInteger.java) | Bilangan bulat berukuran besar |
| 223 | [223_BigDecimal.java](223_BigDecimal.java) | Aritmetika desimal presisi tinggi |
| 224 | [224_LocalDate.java](224_LocalDate.java) | Class `LocalDate` |
| 225 | [225_LocalTime.java](225_LocalTime.java) | Class `LocalTime` |
| 226 | [226_LocalDateTime.java](226_LocalDateTime.java) | Class `LocalDateTime` |
| 227 | [227_ZonedDateTime.java](227_ZonedDateTime.java) | Pengelolaan zona waktu |
| 228 | [228_DateTimeFormatter.java](228_DateTimeFormatter.java) | Format tanggal dan waktu |
| 229 | [229_OptionalClass.java](229_OptionalClass.java) | Class `Optional` |
| 230 | [230_UUIDGeneration.java](230_UUIDGeneration.java) | UUID |
| 231 | [231_EnumTypes.java](231_EnumTypes.java) | Enumerations |
| 232 | [232_Annotations.java](232_Annotations.java) | Annotations |
| 233 | [233_CustomAnnotations.java](233_CustomAnnotations.java) | Custom annotations |
| 234 | [234_ReflectionAPI.java](234_ReflectionAPI.java) | Reflection API |
| 235 | [235_Records.java](235_Records.java) | Record classes |
| 236 | [236_SealedClasses.java](236_SealedClasses.java) | Sealed classes |

---

## Penjelasan Setiap Submodul

### 219. 219_MathClassAdvanced.java
- **Tujuan:** Menghitung fungsi trigonometri dan logaritma ilmiah.
- **Konsep Utama:** Method `sin()`, `cos()`, `tan()`, `toRadians()`, `log10()`, dan konstanta `Math.E`.
- **Penjelasan Source Code:** Menghitung rasio sudut 45 derajat dan logaritma basis 10 dari angka 1000.
- **Cara Menjalankan:** `java 219_MathClassAdvanced.java`
- **Hasil yang Diharapkan:** Nilai sinus, cosinus, tangen, dan logaritma ditampilkan akurat.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 219_MathClassAdvanced](output/219_MathClassAdvanced.png)

### 220. 220_RandomClass.java
- **Tujuan:** Membangkitkan angka acak untuk simulasi atau game.
- **Konsep Utama:** Class `java.util.Random` dengan metode `nextInt()`, `nextDouble()`, dan `nextBoolean()`.
- **Penjelasan Source Code:** Mensimulasikan lemparan dadu 1-6 dan lemparan koin menggunakan seed tetap.
- **Cara Menjalankan:** `java 220_RandomClass.java`
- **Hasil yang Diharapkan:** Angka dadu, persentase desimal, dan sisi koin ditampilkan di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 220_RandomClass](output/220_RandomClass.png)

### 221. 221_SecureRandom.java
- **Tujuan:** Menghasilkan nilai acak berkeamanan tinggi untuk token sesi dan kode OTP.
- **Konsep Utama:** Entropi acak yang aman secara kriptografi (*Cryptographically Secure PRNG*).
- **Penjelasan Source Code:** Membangkitkan 6 digit OTP acak dan token otorisasi API berbasis Base64.
- **Cara Menjalankan:** `java 221_SecureRandom.java`
- **Hasil yang Diharapkan:** Kode OTP angka dan token string Base64 tercetak di layar.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 221_SecureRandom](output/221_SecureRandom.png)

### 222. 222_BigInteger.java
- **Tujuan:** Melakukan perhitungan matematika pada bilangan bulat yang melebihi kapasitas memori 64-bit primitif.
- **Konsep Utama:** Class `BigInteger` mendukung operasi `add()` dan `multiply()` dengan panjang digit tak terbatas.
- **Penjelasan Source Code:** Menjumlahkan dan mengalikan dua buah angka 30-digit.
- **Cara Menjalankan:** `java 222_BigInteger.java`
- **Hasil yang Diharapkan:** Hasil operasi penjumlahan dan perkalian raksasa tercetak utuh tanpa overflow.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 222_BigInteger](output/222_BigInteger.png)

### 223. 223_BigDecimal.java
- **Tujuan:** Mencegah ketidakakuratan perhitungan desimal pada aplikasi finansial dan perbankan.
- **Konsep Utama:** Menggunakan representasi string angka dan menentukan pembulatan eksplisit `RoundingMode`.
- **Penjelasan Source Code:** Membuktikan kalkulasi 0.1 + 0.2 tepat bernilai 0.3 dan pembagian nominal rupiah.
- **Cara Menjalankan:** `java 223_BigDecimal.java`
- **Hasil yang Diharapkan:** Hasil komputasi presisi tinggi tanpa cacat presisi pecahan ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 223_BigDecimal](output/223_BigDecimal.png)

### 224. 224_LocalDate.java
- **Tujuan:** Mengelola data kalender tanggal tanpa informasi jam dan menit.
- **Konsep Utama:** Operasi tanggal imun dari mutasi (*immutable*), mendukung `plusDays()` dan `isLeapYear()`.
- **Penjelasan Source Code:** Menghitung hari proklamasi kemerdekaan dan memproyeksikan tanggal 30 hari ke depan.
- **Cara Menjalankan:** `java 224_LocalDate.java`
- **Hasil yang Diharapkan:** Tanggal saat ini, tanggal proklamasi, dan proyeksi hari ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 224_LocalDate](output/224_LocalDate.png)

### 225. 225_LocalTime.java
- **Tujuan:** Mengelola data waktu jam, menit, detik secara presisi tanpa informasi tanggal.
- **Konsep Utama:** Manipulasi waktu kerja menggunakan method `plusHours()` dan pembanding `isAfter()`.
- **Penjelasan Source Code:** Menentukan jam masuk kerja pukul 08:00 dan jam pulang kerja 9 jam setelahnya.
- **Cara Menjalankan:** `java 225_LocalTime.java`
- **Hasil yang Diharapkan:** Jadwal jam kerja dan status perbandingan waktu tampil di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 225_LocalTime](output/225_LocalTime.png)

### 226. 226_LocalDateTime.java
- **Tujuan:** Menangani stempel waktu lengkap (kombinasi tanggal dan jam).
- **Konsep Utama:** Objek representasi waktu terpadu untuk pencatatan transaksi dan penjadwalan sistem.
- **Penjelasan Source Code:** Menjadwalkan rapat konferensi 2 hari 3 jam ke depan dengan format bahasa Indonesia.
- **Cara Menjalankan:** `java 226_LocalDateTime.java`
- **Hasil yang Diharapkan:** Timestamp waktu sistem dan jadwal rapat berformat rapi ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 226_LocalDateTime](output/226_LocalDateTime.png)

### 227. 227_ZonedDateTime.java
- **Tujuan:** Mengonversi waktu antar zona waktu geografis dunia.
- **Konsep Utama:** Penyesuaian offset waktu berbasis `ZoneId` (misal Asia/Jakarta ke Asia/Tokyo dan UTC).
- **Penjelasan Source Code:** Mengonversi waktu rapat di Jakarta menjadi waktu lokal di Tokyo dan zona UTC.
- **Cara Menjalankan:** `java 227_ZonedDateTime.java`
- **Hasil yang Diharapkan:** Waktu pada ketiga zona waktu yang saling tersinkronisasi ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 227_ZonedDateTime](output/227_ZonedDateTime.png)

### 228. 228_DateTimeFormatter.java
- **Tujuan:** Memformat objek tanggal ke string dan membaca string teks kembali menjadi tanggal (*parsing*).
- **Konsep Utama:** Penentuan pola format kustom `dd MMMM yyyy` lengkap dengan pengaturan Locale negara.
- **Penjelasan Source Code:** Memformat tanggal 17 Oktober 2026 dan mem-parsing teks tanggal Natal.
- **Cara Menjalankan:** `java 228_DateTimeFormatter.java`
- **Hasil yang Diharapkan:** Format tanggal lokal Indonesia dan hasil parsing objek ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 228_DateTimeFormatter](output/228_DateTimeFormatter.png)

### 229. 229_OptionalClass.java
- **Tujuan:** Menghindari galat NullPointerException dengan kontainer pembungkus nilai `Optional`.
- **Konsep Utama:** Method `orElse()` menyediakan nilai pengganti otomatis jika nilai di dalamnya null.
- **Penjelasan Source Code:** Menguji pencarian email pengguna yang terdaftar dan yang tidak terdaftar.
- **Cara Menjalankan:** `java 229_OptionalClass.java`
- **Hasil yang Diharapkan:** Email pengguna dan email cadangan berhasil ditangani secara elegan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 229_OptionalClass](output/229_OptionalClass.png)

### 230. 230_UUIDGeneration.java
- **Tujuan:** Menghasilkan identitas unik universal (UUID) untuk kunci primer data.
- **Konsep Utama:** UUID 128-bit berformat string 36 karakter dengan jaminan keunikan global.
- **Penjelasan Source Code:** Membangkitkan dua buah kode UUID transaksi independen.
- **Cara Menjalankan:** `java 230_UUIDGeneration.java`
- **Hasil yang Diharapkan:** Dua string UUID unik tercetak ke konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 230_UUIDGeneration](output/230_UUIDGeneration.png)

### 231. 231_EnumTypes.java
- **Tujuan:** Membangun tipe data enumerasi yang memiliki atribut kode angka dan teks deskripsi.
- **Konsep Utama:** Enum di Java adalah class berkemampuan penuh yang dapat memiliki constructor dan method.
- **Penjelasan Source Code:** Mengelola status siklus pesanan belanja (Menunggu, Diproses, Dikirim, Selesai).
- **Cara Menjalankan:** `java 231_EnumTypes.java`
- **Hasil yang Diharapkan:** Status aktif dan daftar seluruh opsi enumerasi ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 231_EnumTypes](output/231_EnumTypes.png)

### 232. 232_Annotations.java
- **Tujuan:** Memanfaatkan metadata instruksi compiler dengan anotasi bawaan Java.
- **Konsep Utama:** Menandai kode usang dengan `@Deprecated` dan meredam peringatan compiler dengan `@SuppressWarnings`.
- **Penjelasan Source Code:** Mendemonstrasikan pemanggilan method usang dan pengabaian warning deprecation.
- **Cara Menjalankan:** `java 232_Annotations.java`
- **Hasil yang Diharapkan:** Pesan peringatan method deprecated dan eksekusi method baru tercetak.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 232_Annotations](output/232_Annotations.png)

### 233. 233_CustomAnnotations.java
- **Tujuan:** Merancang anotasi buatan sendiri untuk otorisasi keamanan berbasis peran pengguna.
- **Konsep Utama:** Deklarasi `@interface` dengan target penempatan method dan retensi runtime.
- **Penjelasan Source Code:** Memeriksa keberadaan anotasi `@PeranAkses` pada method layanan bisnis saat runtime.
- **Cara Menjalankan:** `java 233_CustomAnnotations.java`
- **Hasil yang Diharapkan:** Peran yang diperlukan dan level otorisasi terbaca melalui metadata anotasi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 233_CustomAnnotations](output/233_CustomAnnotations.png)

### 234. 234_ReflectionAPI.java
- **Tujuan:** Menginspeksi struktur metadata class, method, dan field saat program sedang berjalan.
- **Konsep Utama:** Menggunakan class `java.lang.Class`, `Field`, dan `Method` untuk melihat isi class secara dinamis.
- **Penjelasan Source Code:** Membaca nama seluruh atribut privat dan method yang dimiliki class `RekeningRahasia`.
- **Cara Menjalankan:** `java 234_ReflectionAPI.java`
- **Hasil yang Diharapkan:** Rincian seluruh field dan method dari class rekening tercetak di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 234_ReflectionAPI](output/234_ReflectionAPI.png)

### 235. 235_Records.java
- **Tujuan:** Menggunakan fitur modern Java Records (Java 16+) untuk model pembawa data ringkas.
- **Konsep Utama:** Otomatis menghasilkan constructor, getter, `equals()`, `hashCode()`, dan `toString()` dalam satu baris deklarasi.
- **Penjelasan Source Code:** Membuat record `MahasiswaRecord` lengkap dengan validasi rentang IPK.
- **Cara Menjalankan:** `java 235_Records.java`
- **Hasil yang Diharapkan:** Nilai atribut record, representasi toString, dan evaluasi kesamaan data ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 235_Records](output/235_Records.png)

### 236. 236_SealedClasses.java
- **Tujuan:** Mengontrol izin pewarisan class secara ketat menggunakan Sealed Classes (Java 17).
- **Konsep Utama:** Klausa `permits` secara eksplisit mendaftarkan subclass yang diizinkan mewarisi class induk.
- **Penjelasan Source Code:** Mendefinisikan class `BentukSealed` yang hanya boleh diturunkan oleh `LingkaranSealed` dan `PersegiSealed`.
- **Cara Menjalankan:** `java 236_SealedClasses.java`
- **Hasil yang Diharapkan:** Perhitungan luas dari kedua bentuk turunan yang diizinkan tercetak akurat.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 236_SealedClasses](output/236_SealedClasses.png)

---

## Ringkasan Modul
Modul 14 telah melengkapi persenjataan pemrograman Java modern bagi pembelajar. Dari penanganan kalkulasi ilmiah, bilangan raksasa, presisi finansial BigDecimal, ekosistem tanggal waktu java.time yang komprehensif, keamanan Null via Optional, hingga fitur mutakhir Java Records dan Sealed Classes. Semua materi ini memberikan fondasi kokoh untuk melangkah ke Modul 15: Multithreading dan Concurrency.
