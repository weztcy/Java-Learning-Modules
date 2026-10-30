# MODUL 10: Exception Handling

## Deskripsi Modul
Modul ini membahas teknik pengamanan keandalan perangkat lunak dari kesalahan waktu eksekusi (*runtime errors*) menggunakan mekanisme penanganan anomali (*Exception Handling*) di Java. Pembahasan mencakup konsep dasar exception, struktur blok `try-catch`, penanganan banyak jenis exception dengan *multiple catch blocks*, jaminan pembersihan sumber daya pada blok `finally`, pelemparan exception manual dengan kata kunci `throw`, deklarasi potensi error dengan kata kunci `throws`, pembedaan *checked exceptions* versus *unchecked exceptions*, pembuatan *custom exceptions* berbasis aturan bisnis, mekanisme perambatan error (*exception propagation*), perantaian error (*exception chaining*), manajemen sumber daya otomatis dengan *try-with-resources*, penanganan ringkas *multi-catch* (operator pipe `|`), penggunaan *assertions* untuk audit internal logika, pembacaan laporan jejak pemanggilan (*stack trace*), serta pedoman pola desain penanganan kesalahan terbaik (*best practices*) versus pola yang harus dihindari (*anti-patterns*).

## Tujuan Pembelajaran
Setelah menyelesaikan modul ini, pembelajar diharapkan mampu:
1. Mencegah program berhenti mendadak (*crash*) saat menghadapi kondisi kesalahan input atau jaringan.
2. Menggunakan konstruksi `try`, `catch`, dan `finally` secara tepat dan terukur.
3. Membedakan *checked exceptions* yang wajib dideklarasikan/ditangani dari *unchecked exceptions* (turunan `RuntimeException`).
4. Melempar exception secara sadar menggunakan kata kunci `throw` dan meneruskannya dengan `throws`.
5. Merancang class exception kustom untuk menangani validasi domain bisnis perbankan atau e-commerce.
6. Memahami aliran perambatan exception (*call stack unrolling*) dan menerapkan *exception chaining* untuk melestarikan akar masalah.
7. Memanfaatkan fitur modern *try-with-resources* pada objek `AutoCloseable` guna mencegah kebocoran memori (*resource leaks*).
8. Menganalisis *stack trace* untuk proses pelacakan dan *debugging* kesalahan secara cepat.

---

## Daftar Materi dan Submodul

| No | Berkas | Materi Pembelajaran |
|---|---|---|
| 141 | [141_ExceptionBasic.java](141_ExceptionBasic.java) | Konsep exception |
| 142 | [142_TryCatch.java](142_TryCatch.java) | `try-catch` |
| 143 | [143_MultipleCatch.java](143_MultipleCatch.java) | Multiple catch blocks |
| 144 | [144_FinallyBlock.java](144_FinallyBlock.java) | Blok `finally` |
| 145 | [145_ThrowKeyword.java](145_ThrowKeyword.java) | Keyword `throw` |
| 146 | [146_ThrowsKeyword.java](146_ThrowsKeyword.java) | Keyword `throws` |
| 147 | [147_CheckedExceptions.java](147_CheckedExceptions.java) | Checked exceptions |
| 148 | [148_UncheckedExceptions.java](148_UncheckedExceptions.java) | Unchecked exceptions |
| 149 | [149_CustomExceptions.java](149_CustomExceptions.java) | Custom exceptions |
| 150 | [150_ExceptionPropagation.java](150_ExceptionPropagation.java) | Propagasi exception |
| 151 | [151_ExceptionChaining.java](151_ExceptionChaining.java) | Exception chaining |
| 152 | [152_TryWithResources.java](152_TryWithResources.java) | Try-with-resources |
| 153 | [153_MultiCatch.java](153_MultiCatch.java) | Multi-catch |
| 154 | [154_Assertions.java](154_Assertions.java) | Assertions |
| 155 | [155_StackTrace.java](155_StackTrace.java) | Stack trace |
| 156 | [156_ExceptionHandlingPatterns.java](156_ExceptionHandlingPatterns.java) | Pola penanganan exception |

---

## Penjelasan Setiap Submodul

### 141. 141_ExceptionBasic.java
- **Tujuan:** Mengenal konsep dasar anomali eksekusi yang mengganggu alur normal program.
- **Konsep Utama:** Objek exception dilempar oleh runtime Java saat operasi ilegal terjadi (misalnya pembagian dengan nol).
- **Penjelasan Source Code:** Menangkap `ArithmeticException` saat membagi bilangan dengan nol sehingga program tetap lanjut.
- **Cara Menjalankan:** `java 141_ExceptionBasic.java`
- **Hasil yang Diharapkan:** Pesan anomali tertangkap dan program sukses melanjutkan eksekusi akhir.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 141_ExceptionBasic](output/141_ExceptionBasic.png)

### 142. 142_TryCatch.java
- **Tujuan:** Menangani error batas memori array secara terkendali.
- **Konsep Utama:** Blok `try` mengawasi kode berisiko, dan blok `catch` menyediakan penanganan cadangan.
- **Penjelasan Source Code:** Menangkap `ArrayIndexOutOfBoundsException` saat mencoba membaca indeks ke-5 dari array 3 elemen.
- **Cara Menjalankan:** `java 142_TryCatch.java`
- **Hasil yang Diharapkan:** Informasi detail indeks yang melampaui kapasitas array tercetak aman.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 142_TryCatch](output/142_TryCatch.png)

### 143. 143_MultipleCatch.java
- **Tujuan:** Menyediakan penanganan spesifik untuk lebih dari satu jenis potensi kesalahan.
- **Konsep Utama:** Menempatkan blok catch dari tipe yang lebih spesifik ke tipe yang lebih umum (`Exception`).
- **Penjelasan Source Code:** Menangani `NumberFormatException` pada konversi string dan `ArithmeticException` pada pembagian.
- **Cara Menjalankan:** `java 143_MultipleCatch.java`
- **Hasil yang Diharapkan:** Tangkapan error yang sesuai tampil pada masing-masing skenario uji.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 143_MultipleCatch](output/143_MultipleCatch.png)

### 144. 144_FinallyBlock.java
- **Tujuan:** Menjamin eksekusi kode penutupan koneksi atau berkas tanpa terpengaruh ada atau tidaknya error.
- **Konsep Utama:** Blok `finally` dipastikan selalu berjalan baik setelah try berhasil maupun catch menangani error.
- **Penjelasan Source Code:** Mensimulasikan pembukaan dan penutupan koneksi jaringan pada skenario sukses dan gagal.
- **Cara Menjalankan:** `java 144_FinallyBlock.java`
- **Hasil yang Diharapkan:** Pesan pembersihan sumber daya pada blok finally selalu tercetak di akhir operasi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 144_FinallyBlock](output/144_FinallyBlock.png)

### 145. 145_ThrowKeyword.java
- **Tujuan:** Memicu pelemparan exception secara sengaja berdasarkan pelanggaran aturan bisnis.
- **Konsep Utama:** Kata kunci `throw` digunakan untuk melemparkan objek instansiasi turunan `Throwable`.
- **Penjelasan Source Code:** Melemparkan `IllegalArgumentException` saat usia pendaftar SIM kurang dari 17 tahun.
- **Cara Menjalankan:** `java 145_ThrowKeyword.java`
- **Hasil yang Diharapkan:** Pesan pelanggaran syarat usia tercetak di layar.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 145_ThrowKeyword](output/145_ThrowKeyword.png)

### 146. 146_ThrowsKeyword.java
- **Tujuan:** Mendeklarasikan daftar checked exception pada signature method pemanggil.
- **Konsep Utama:** Meneruskan tanggung jawab penanganan error ke method tingkat atas yang memanggilnya.
- **Penjelasan Source Code:** Method `bacaFileKritis` mendeklarasikan `throws IOException` yang kemudian ditangani oleh method `main`.
- **Cara Menjalankan:** `java 146_ThrowsKeyword.java`
- **Hasil yang Diharapkan:** Penanganan kegagalan akses file berhasil ditangani oleh method main.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 146_ThrowsKeyword](output/146_ThrowsKeyword.png)

### 147. 147_CheckedExceptions.java
- **Tujuan:** Memahami karakteristik exception yang diverifikasi langsung oleh compiler saat waktu kompilasi.
- **Konsep Utama:** Turunan `Exception` selain `RuntimeException` wajib ditangani dengan try-catch atau `throws`.
- **Penjelasan Source Code:** Menangani `FileNotFoundException` saat mencoba membaca berkas konfigurasi sistem yang tidak ada.
- **Cara Menjalankan:** `java 147_CheckedExceptions.java`
- **Hasil yang Diharapkan:** Notifikasi berkas tidak ditemukan tertangkap rapi tanpa compile error.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 147_CheckedExceptions](output/147_CheckedExceptions.png)

### 148. 148_UncheckedExceptions.java
- **Tujuan:** Mengenali bug logika pemrograman (*runtime exception*) yang tidak diwajibkan compiler untuk ditangani.
- **Konsep Utama:** Turunan `RuntimeException` seperti `NullPointerException` dan `NumberFormatException`.
- **Penjelasan Source Code:** Menangkap manipulasi referensi null dan parsing format angka yang keliru.
- **Cara Menjalankan:** `java 148_UncheckedExceptions.java`
- **Hasil yang Diharapkan:** Penjelasan penyebab terjadinya NullPointerException dan NumberFormatException ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 148_UncheckedExceptions](output/148_UncheckedExceptions.png)

### 149. 149_CustomExceptions.java
- **Tujuan:** Membangun class exception buatan sendiri untuk memodelkan aturan bisnis perbankan.
- **Konsep Utama:** Membuat subclass `SaldoTidakMencukupiException extends Exception` lengkap dengan atribut nilai kekurangan.
- **Penjelasan Source Code:** Melempar custom exception saat nominal penarikan saldo melampaui saldo tersisa.
- **Cara Menjalankan:** `java 149_CustomExceptions.java`
- **Hasil yang Diharapkan:** Pesan penolakan transaksi dan rincian kekurangan nominal saldo tercetak jelas.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 149_CustomExceptions](output/149_CustomExceptions.png)

### 150. 150_ExceptionPropagation.java
- **Tujuan:** Memahami aliran perambatan exception menaiki call stack fungsi yang saling memanggil.
- **Konsep Utama:** Jika method terdalam tidak menangani exception, runtime akan mencari blok catch pada pemanggil sebelumnya.
- **Penjelasan Source Code:** Error pembagian nol di method 3 merambat melewati method 2 dan 1 hingga ditangkap di main.
- **Cara Menjalankan:** `java 150_ExceptionPropagation.java`
- **Hasil yang Diharapkan:** Jejak alur masuk fungsi dan titik penangkapan di main tercetak berurutan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 150_ExceptionPropagation](output/150_ExceptionPropagation.png)

### 151. 151_ExceptionChaining.java
- **Tujuan:** Membungkus exception teknis tingkat rendah ke dalam exception aplikasi tanpa menghilangkan akar masalah.
- **Konsep Utama:** Menghubungkan exception melalui konstruktor `Throwable(message, cause)` untuk kemudahan pelacakan.
- **Penjelasan Source Code:** Menangkap error database `SQLException` dan membungkusnya menjadi `AplikasiServiceException`.
- **Cara Menjalankan:** `java 151_ExceptionChaining.java`
- **Hasil yang Diharapkan:** Pesan aplikasi tingkat tinggi dan referensi akar penyebab asli database ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 151_ExceptionChaining](output/151_ExceptionChaining.png)

### 152. 152_TryWithResources.java
- **Tujuan:** Mengotomatiskan pembersihan dan penutupan sumber daya tanpa perlu blok finally manual.
- **Konsep Utama:** Setiap class yang mengimplementasikan `java.lang.AutoCloseable` otomatis memanggil method `close()`.
- **Penjelasan Source Code:** Membuka koneksi simulasi database dan memverifikasi pemanggilan otomatis method close().
- **Cara Menjalankan:** `java 152_TryWithResources.java`
- **Hasil yang Diharapkan:** Log pembukaan koneksi, eksekusi kueri, dan penutupan otomatis tertampil lengkap.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 152_TryWithResources](output/152_TryWithResources.png)

### 153. 153_MultiCatch.java
- **Tujuan:** Menyederhanakan penanganan beberapa tipe exception dengan logika penanganan identik.
- **Konsep Utama:** Menggabungkan tipe exception dalam satu blok catch menggunakan operator pemisah pipa (`|`).
- **Penjelasan Source Code:** Menangani `ArithmeticException` dan `ArrayIndexOutOfBoundsException` dalam satu blok catch ringkas.
- **Cara Menjalankan:** `java 153_MultiCatch.java`
- **Hasil yang Diharapkan:** Kedua skenario kesalahan tertangkap oleh satu blok catch yang sama.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 153_MultiCatch](output/153_MultiCatch.png)

### 154. 154_Assertions.java
- **Tujuan:** Memvalidasi asumsi kebenaran logika internal selama proses pengembangan dan pengujian sistem.
- **Konsep Utama:** Pernyataan `assert kondisi : pesan` memicu `AssertionError` jika kondisi bernilai salah.
- **Penjelasan Source Code:** Memverifikasi invarian bahwa sisa saldo kas tidak boleh bernilai negatif setelah penarikan.
- **Cara Menjalankan:** `java 154_Assertions.java`
- **Hasil yang Diharapkan:** Status verifikasi asumsi internal berhasil dievaluasi dengan benar.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 154_Assertions](output/154_Assertions.png)

### 155. 155_StackTrace.java
- **Tujuan:** Menganalisis laporan jejak tumpukan fungsi untuk mengidentifikasi berkas dan nomor baris penyebab error.
- **Konsep Utama:** Membedah array objek `StackTraceElement` yang disediakan oleh method `getStackTrace()`.
- **Penjelasan Source Code:** Menangkap error dari pemanggilan berantai fungsi A -> B -> C dan mencetak nomor barisnya.
- **Cara Menjalankan:** `java 155_StackTrace.java`
- **Hasil yang Diharapkan:** Laporan jejak nama class, method, dan nomor baris call stack ditampilkan terstruktur.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 155_StackTrace](output/155_StackTrace.png)

### 156. 156_ExceptionHandlingPatterns.java
- **Tujuan:** Memahami standar industri pola penanganan kesalahan terbaik (*best practices*) dan menghindari anti-patterns.
- **Konsep Utama:** Larangan menelan exception secara diam-diam (*empty catch*) dan pemisahan logika bisnis dari exception flow.
- **Penjelasan Source Code:** Memperagakan bahaya anti-pattern penelanan exception dan mendemonstrasikan pola penanganan valid.
- **Cara Menjalankan:** `java 156_ExceptionHandlingPatterns.java`
- **Hasil yang Diharapkan:** Edukasi perbandingan pola penanganan exception tampil jelas di layar.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 156_ExceptionHandlingPatterns](output/156_ExceptionHandlingPatterns.png)

---

## Ringkasan Modul
Modul 10 telah memberikan keterampilan penting dalam membangun aplikasi yang tangguh (*robust*) dan toleran terhadap kesalahan (*fault-tolerant*). Dengan menguasai try-catch-finally, checked vs unchecked exceptions, pelemparan throw/throws, custom exception domain, auto-closing try-with-resources, hingga analisis stack trace, sistem perangkat lunak yang dibangun kini siap beroperasi secara andal di lingkungan produksi. Selanjutnya, pembelajar akan mempelajari struktur data dinamis pada Modul 11: Java Collections Framework.
