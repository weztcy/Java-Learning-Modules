# MODUL 1: Pengenalan Java dan Struktur Program

## Deskripsi Modul
Modul ini membahas fondasi dasar bahasa pemrograman Java, mulai dari sintaks dasar program pertama (*Hello World*), struktur anatomi class dan method main, jenis-jenis komentar kode, teknik pencetakan output konsol (`print`, `println`, `printf`), konsep pernyataan (*statements*) dan ekspresi (*expressions*), aturan penamaan *identifiers*, daftar kata kunci terpesan (*keywords*), hingga pemahaman alur kompilasi serta eksekusi pada Java Virtual Machine (JVM).

## Tujuan Pembelajaran
Setelah menyelesaikan modul ini, pembelajar diharapkan mampu:
1. Memahami struktur dasar berkas program Java dan fungsi method utama `main`.
2. Menulis komentar kode yang rapi dan memahami perbedaan komentar satu baris, multi-baris, serta JavaDoc.
3. Menggunakan fungsi output konsol `print`, `println`, dan format specifier pada `printf`.
4. Membedakan deklarasi, inisialisasi, dan ekspresi aritmetika pada statement Java.
5. Menerapkan konvensi penamaan identifier yang benar dan menghindari kata kunci terpesan Java.
6. Memahami siklus kompilasi dari kode sumber Java menjadi bytecode hingga dieksekusi oleh JVM.

---

## Daftar Materi dan Submodul

| No | Berkas | Materi Pembelajaran |
|---|---|---|
| 1 | [01_HelloWorld.java](01_HelloWorld.java) | Program pertama Java |
| 2 | [02_JavaProgramStructure.java](02_JavaProgramStructure.java) | Struktur program Java |
| 3 | [03_JavaComments.java](03_JavaComments.java) | Komentar program |
| 4 | [04_SystemOutPrint.java](04_SystemOutPrint.java) | Output menggunakan `System.out.print()` |
| 5 | [05_SystemOutPrintln.java](05_SystemOutPrintln.java) | Output menggunakan `System.out.println()` |
| 6 | [06_SystemOutPrintf.java](06_SystemOutPrintf.java) | Format output menggunakan `printf()` |
| 7 | [07_JavaStatements.java](07_JavaStatements.java) | Statements dan expressions |
| 8 | [08_JavaIdentifiers.java](08_JavaIdentifiers.java) | Identifiers dan aturan penamaan |
| 9 | [09_JavaKeywords.java](09_JavaKeywords.java) | Java keywords |
| 10 | [10_CompileAndRun.java](10_CompileAndRun.java) | Kompilasi dan eksekusi program Java |

---

## Penjelasan Setiap Submodul

### 1. 01_HelloWorld.java
- **Tujuan:** Mengenal penulisan program Java pertama dan memahami peran method `main`.
- **Konsep Utama:** Setiap program Java dibungkus dalam class. Method `public static void main(String[] args)` adalah titik masuk (*entry point*) eksekusi oleh JVM.
- **Penjelasan Source Code:** Program mendefinisikan class `HelloWorld` dan mencetak baris salam menggunakan `System.out.println()`.
- **Cara Menjalankan:**
  ```bash
  java 01_HelloWorld.java
  ```
- **Hasil yang Diharapkan:** Teks salam tercetak di konsol.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 01_HelloWorld](output/01_HelloWorld.png)

### 2. 02_JavaProgramStructure.java
- **Tujuan:** Memahami elemen pembentuk struktur program Java.
- **Konsep Utama:** Struktur berurutan terdiri atas deklarasi class, method main, dan blok pernyataan yang diakhiri tanda titik koma.
- **Penjelasan Source Code:** Program menampilkan tiga komponen struktural utama Java ke layar secara berurutan.
- **Cara Menjalankan:**
  ```bash
  java 02_JavaProgramStructure.java
  ```
- **Hasil yang Diharapkan:** Penjelasan struktur program tercetak berurutan.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 02_JavaProgramStructure](output/02_JavaProgramStructure.png)

### 3. 03_JavaComments.java
- **Tujuan:** Mempelajari tiga jenis penulisan komentar di Java.
- **Konsep Utama:** Komentar satu baris `//`, multi-baris `/* ... */`, dan JavaDoc `/** ... */`.
- **Penjelasan Source Code:** Menunjukkan sintaks ketiga bentuk komentar yang tidak memengaruhi eksekusi program.
- **Cara Menjalankan:**
  ```bash
  java 03_JavaComments.java
  ```
- **Hasil yang Diharapkan:** Informasi jenis komentar tercetak di konsol.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 03_JavaComments](output/03_JavaComments.png)

### 4. 04_SystemOutPrint.java
- **Tujuan:** Mengetahui cara kerja `System.out.print()`.
- **Konsep Utama:** Mencetak teks tanpa menyisipkan pemisah baris baru di akhir keluaran.
- **Penjelasan Source Code:** Beberapa pemanggilan `print()` beruntun menghasilkan teks dalam satu baris horizontal.
- **Cara Menjalankan:**
  ```bash
  java 04_SystemOutPrint.java
  ```
- **Hasil yang Diharapkan:** Kata-kata dicetak berdampingan dalam satu baris.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 04_SystemOutPrint](output/04_SystemOutPrint.png)

### 5. 05_SystemOutPrintln.java
- **Tujuan:** Mengetahui cara kerja `System.out.println()`.
- **Konsep Utama:** Mencetak string diikuti karakter baris baru (*newline*).
- **Penjelasan Source Code:** Tiga pemanggilan `println()` menghasilkan tiga baris keluaran berbeda di konsol.
- **Cara Menjalankan:**
  ```bash
  java 05_SystemOutPrintln.java
  ```
- **Hasil yang Diharapkan:** Tiga baris teks tampil berurutan ke bawah.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 05_SystemOutPrintln](output/05_SystemOutPrintln.png)

### 6. 06_SystemOutPrintf.java
- **Tujuan:** Menguasai format pencetakan teks dengan penentu format (*specifier*).
- **Konsep Utama:** Penggunaan format `%s` (string), `%d` (integer), `%.2f` (float presisi 2), dan `%n` (newline portabel).
- **Penjelasan Source Code:** Variabel nama, umur, dan IPK diformat secara terstruktur dalam kolom yang rapi.
- **Cara Menjalankan:**
  ```bash
  java 06_SystemOutPrintf.java
  ```
- **Hasil yang Diharapkan:** Data tercetak rapi dengan format yang telah ditentukan.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 06_SystemOutPrintf](output/06_SystemOutPrintf.png)

### 7. 07_JavaStatements.java
- **Tujuan:** Memahami perbedaan statement dan expression dalam Java.
- **Konsep Utama:** Expression adalah kombinasi nilai yang menghasilkan nilai baru; statement adalah satu unit eksekusi lengkap.
- **Penjelasan Source Code:** Mendemonstrasikan deklarasi variabel, assignment, operasi aritmetika, dan pemanggilan method.
- **Cara Menjalankan:**
  ```bash
  java 07_JavaStatements.java
  ```
- **Hasil yang Diharapkan:** Nilai variabel A, B, dan hasil jumlah tercetak di layar.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 07_JavaStatements](output/07_JavaStatements.png)

### 8. 08_JavaIdentifiers.java
- **Tujuan:** Menerapkan aturan dan konvensi penamaan identifier Java.
- **Konsep Utama:** Identifier valid dapat diawali huruf, underscore `_`, atau simbol `$`, serta menggunakan pola camelCase.
- **Penjelasan Source Code:** Menampilkan deklarasi variabel dengan identifier yang valid dan menjelaskan batasan penamaannya.
- **Cara Menjalankan:**
  ```bash
  java 08_JavaIdentifiers.java
  ```
- **Hasil yang Diharapkan:** Nilai dari berbagai variabel dengan identifier valid ditampilkan.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 08_JavaIdentifiers](output/08_JavaIdentifiers.png)

### 9. 09_JavaKeywords.java
- **Tujuan:** Memahami kata kunci terpesan (*reserved keywords*) di Java.
- **Konsep Utama:** Kata kunci seperti `class`, `public`, `static`, `void`, dan `final` memiliki arti khusus bagi compiler dan tidak boleh dijadikan nama identifier.
- **Penjelasan Source Code:** Mengelompokkan kata kunci Java ke dalam kategori tipe data, kontrol alur, dan modifier.
- **Cara Menjalankan:**
  ```bash
  java 09_JavaKeywords.java
  ```
- **Hasil yang Diharapkan:** Ringkasan kelompok keyword dan nilai variabel status tercetak di layar.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 09_JavaKeywords](output/09_JavaKeywords.png)

### 10. 10_CompileAndRun.java
- **Tujuan:** Memahami siklus kompilasi dan eksekusi pada Java Virtual Machine.
- **Konsep Utama:** Alur eksekusi dari Source Code (.java) -> Javac Compiler -> Bytecode (.class) -> Java Virtual Machine (JVM).
- **Penjelasan Source Code:** Mencetak alur 3 langkah eksekusi program Java dan menampilkan versi runtime aktif.
- **Cara Menjalankan:**
  ```bash
  java 10_CompileAndRun.java
  ```
- **Hasil yang Diharapkan:** Tampilan langkah kompilasi Java dan properti versi runtime.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 10_CompileAndRun](output/10_CompileAndRun.png)

---

## Ringkasan Modul
Modul 1 telah meletakkan pemahaman fundamental tentang cara kerja bahasa Java. Kita telah mempelajari cara menyusun class, menjalankan instruksi di dalam method `main`, mengontrol keluaran konsol dengan `print`/`println`/`printf`, serta memahami aturan penulisan identifier dan alur eksekusi di atas Java Virtual Machine (JVM). Fondasi ini menjadi pijakan utama untuk mempelajari modul selanjutnya tentang variabel dan tipe data.
