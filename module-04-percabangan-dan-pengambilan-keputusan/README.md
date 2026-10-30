# MODUL 4: Percabangan dan Pengambilan Keputusan

## Deskripsi Modul
Modul ini membahas struktur kendali alur eksekusi keputusan (*conditional branching*) dalam pemrograman Java. Materi mencakup pernyataan `if` tunggal, alternatif `if-else`, tangga keputusan `else-if`, percabangan bersarang (*nested if*), pernyataan `switch` tradisional dengan `break`, *switch expression* modern (Java 14+) berbasis ekspresi panah, *nested switch*, serta studi kasus nyata seperti penghitungan nilai mahasiswa, pemeriksa bilangan genap/ganjil, penentu tahun kabisat, validasi login, dan kalkulator diskon belanja.

## Tujuan Pembelajaran
Setelah menyelesaikan modul ini, pembelajar diharapkan mampu:
1. Mengontrol alur program dengan pernyataan `if`, `if-else`, dan `else-if`.
2. Menyusun logika bertingkat dengan *nested if* dan *nested switch*.
3. Menggunakan pernyataan `switch` tradisional serta memahami fungsi kata kunci `break` dan `default`.
4. Mengimplementasikan *switch expression* modern yang lebih ringkas dan aman dari bug *fall-through*.
5. Menyelesaikan studi kasus pemecahan masalah algoritma dunia nyata menggunakan kombinasi struktur percabangan.

---

## Daftar Materi dan Submodul

| No | Berkas | Materi Pembelajaran |
|---|---|---|
| 39 | [39_IfStatement.java](39_IfStatement.java) | Percabangan `if` |
| 40 | [40_IfElseStatement.java](40_IfElseStatement.java) | Percabangan `if-else` |
| 41 | [41_ElseIfStatement.java](41_ElseIfStatement.java) | Percabangan `else-if` |
| 42 | [42_NestedIf.java](42_NestedIf.java) | Nested if |
| 43 | [43_SwitchStatement.java](43_SwitchStatement.java) | Percabangan `switch` |
| 44 | [44_SwitchExpression.java](44_SwitchExpression.java) | Switch expression |
| 45 | [45_NestedSwitch.java](45_NestedSwitch.java) | Nested switch |
| 46 | [46_GradeCalculator.java](46_GradeCalculator.java) | Program penentuan nilai |
| 47 | [47_EvenOddChecker.java](47_EvenOddChecker.java) | Pemeriksaan bilangan genap dan ganjil |
| 48 | [48_LeapYearChecker.java](48_LeapYearChecker.java) | Pemeriksaan tahun kabisat |
| 49 | [49_LoginValidation.java](49_LoginValidation.java) | Validasi login sederhana |
| 50 | [50_DiscountCalculator.java](50_DiscountCalculator.java) | Kalkulator diskon |

---

## Penjelasan Setiap Submodul

### 39. 39_IfStatement.java
- **Tujuan:** Memahami eksekusi kondisional dasar menggunakan pernyataan `if`.
- **Konsep Utama:** Blok pernyataan hanya dijalankan jika evaluasi kondisi menghasilkan nilai `true`.
- **Penjelasan Source Code:** Memeriksa kelulusan mahasiswa berdasarkan nilai ujian.
- **Cara Menjalankan:**
  ```bash
  java 39_IfStatement.java
  ```
- **Hasil yang Diharapkan:** Pesan kelulusan tampil jika nilai memenuhi kriteria minimum.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 39_IfStatement](output/39_IfStatement.png)

### 40. 40_IfElseStatement.java
- **Tujuan:** Menangani dua jalur alternatif dengan `if-else`.
- **Konsep Utama:** Jalur `else` dieksekusi ketika kondisi utama pada `if` tidak terpenuhi.
- **Penjelasan Source Code:** Memeriksa batas minimal belanja untuk mendapatkan promo gratis ongkos kirim.
- **Cara Menjalankan:**
  ```bash
  java 40_IfElseStatement.java
  ```
- **Hasil yang Diharapkan:** Informasi promo atau sisa belanja yang dibutuhkan ditampilkan.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 40_IfElseStatement](output/40_IfElseStatement.png)

### 41. 41_ElseIfStatement.java
- **Tujuan:** Menyeleksi lebih dari dua kondisi bertingkat secara runtut.
- **Konsep Utama:** Tangga keputusan dievaluasi secara berurutan hingga menemukan kecocokan pertama.
- **Penjelasan Source Code:** Mengonversi skor angka menjadi predikat huruf (A, B, C, D, E).
- **Cara Menjalankan:**
  ```bash
  java 41_ElseIfStatement.java
  ```
- **Hasil yang Diharapkan:** Predikat huruf tercetak sesuai skor yang ditentukan.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 41_ElseIfStatement](output/41_ElseIfStatement.png)

### 42. 42_NestedIf.java
- **Tujuan:** Menyusun percabangan bersarang untuk memeriksa kriteria multi-tahap.
- **Konsep Utama:** Kondisi sekunder diuji hanya setelah kondisi primer terpenuhi.
- **Penjelasan Source Code:** Memeriksa kelayakan mengemudi bertahap: pertama batas usia, kemudian status kepemilikan SIM.
- **Cara Menjalankan:**
  ```bash
  java 42_NestedIf.java
  ```
- **Hasil yang Diharapkan:** Analisis bertahap persyaratan mengemudi tercetak di layar.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 42_NestedIf](output/42_NestedIf.png)

### 43. 43_SwitchStatement.java
- **Tujuan:** Menyeleksi nilai diskret dengan sintaks `switch` tradisional.
- **Konsep Utama:** Pencocokan label `case`, penggunaan `break` untuk mencegah fall-through, dan penanganan `default`.
- **Penjelasan Source Code:** Menentukan nama hari berdasarkan angka 1 sampai 7.
- **Cara Menjalankan:**
  ```bash
  java 43_SwitchStatement.java
  ```
- **Hasil yang Diharapkan:** Nama hari yang sesuai dicetak ke konsol.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 43_SwitchStatement](output/43_SwitchStatement.png)

### 44. 44_SwitchExpression.java
- **Tujuan:** Menguasai fitur modern switch expression dengan panah `->`.
- **Konsep Utama:** Evaluasi langsung mengembalikan nilai tanpa membutuhkan pernyataan `break`.
- **Penjelasan Source Code:** Memetakan kode kategori produk ke nama lengkap kategori secara ringkas dan aman.
- **Cara Menjalankan:**
  ```bash
  java 44_SwitchExpression.java
  ```
- **Hasil yang Diharapkan:** Kode dan nama kategori tercetak di konsol.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 44_SwitchExpression](output/44_SwitchExpression.png)

### 45. 45_NestedSwitch.java
- **Tujuan:** Menggabungkan pernyataan `switch` di dalam `case` dari `switch` lainnya.
- **Konsep Utama:** Menentukan pilihan berdasarkan dua variabel diskret bertingkat.
- **Penjelasan Source Code:** Memilih daftar mata kuliah berdasarkan tingkat semester dan kode peminatan studi.
- **Cara Menjalankan:**
  ```bash
  java 45_NestedSwitch.java
  ```
- **Hasil yang Diharapkan:** Mata kuliah sesuai kombinasi tingkat dan peminatan ditampilkan.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 45_NestedSwitch](output/45_NestedSwitch.png)

### 46. 46_GradeCalculator.java
- **Tujuan:** Membuat program perhitungan nilai akademik berbasis bobot persentase.
- **Konsep Utama:** Kombinasi kalkulasi aritmetika bobot komponen dan tangga keputusan penentuan grade.
- **Penjelasan Source Code:** Mengolah nilai Tugas, UTS, dan UAS menjadi nilai akhir serta menentukan indeks huruf dan status.
- **Cara Menjalankan:**
  ```bash
  java 46_GradeCalculator.java
  ```
- **Hasil yang Diharapkan:** Rincian nilai komponen, nilai akhir terbobot, grade, dan status kelulusan ditampilkan.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 46_GradeCalculator](output/46_GradeCalculator.png)

### 47. 47_EvenOddChecker.java
- **Tujuan:** Mengklasifikasikan bilangan bulat ke dalam kategori genap atau ganjil.
- **Konsep Utama:** Penggunaan operator modulus `% 2` untuk mendeteksi pembagian habis.
- **Penjelasan Source Code:** Memeriksa array sejumlah bilangan dan mencetak kategori masing-masing.
- **Cara Menjalankan:**
  ```bash
  java 47_EvenOddChecker.java
  ```
- **Hasil yang Diharapkan:** Klasifikasi GENAP atau GANJIL untuk setiap bilangan ditampilkan.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 47_EvenOddChecker](output/47_EvenOddChecker.png)

### 48. 48_LeapYearChecker.java
- **Tujuan:** Menguji logika boolean majemuk dalam penentuan tahun kabisat.
- **Konsep Utama:** Aturan kelipatan 400 atau kelipatan 4 yang bukan kelipatan 100.
- **Penjelasan Source Code:** Menguji daftar tahun bersejarah dan menampilkan jumlah hari di bulan Februari.
- **Cara Menjalankan:**
  ```bash
  java 48_LeapYearChecker.java
  ```
- **Hasil yang Diharapkan:** Status kabisat beserta jumlah hari tercetak untuk setiap tahun uji.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 48_LeapYearChecker](output/48_LeapYearChecker.png)

### 49. 49_LoginValidation.java
- **Tujuan:** Mengimplementasikan alur validasi otentikasi login.
- **Konsep Utama:** Validasi kekosongan string dengan `.isEmpty()`, kesamaan isi string dengan `.equals()`, dan penanganan kegagalan terperinci.
- **Penjelasan Source Code:** Memvalidasi kombinasi input nama pengguna dan kata sandi terhadap data akun sistem.
- **Cara Menjalankan:**
  ```bash
  java 49_LoginValidation.java
  ```
- **Hasil yang Diharapkan:** Status keberhasilan atau rincian kegagalan login ditampilkan di konsol.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 49_LoginValidation](output/49_LoginValidation.png)

### 50. 50_DiscountCalculator.java
- **Tujuan:** Membuat program perhitungan potongan harga berbasis tier belanja dan status keanggotaan.
- **Konsep Utama:** Penentuan persentase diskon bertingkat ditambah bonus diskon loyalitas kartu member.
- **Penjelasan Source Code:** Menghitung total belanja, diskon bertingkat, tambahan diskon member, dan total tagihan akhir.
- **Cara Menjalankan:**
  ```bash
  java 50_DiscountCalculator.java
  ```
- **Hasil yang Diharapkan:** Tagihan belanja awal, nominal diskon, dan total bayar akhir diformat rapi.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 50_DiscountCalculator](output/50_DiscountCalculator.png)

---

## Ringkasan Modul
Modul 4 telah membekali pembelajar dengan pemahaman logika pengambilan keputusan dalam berbagai tingkatan kompleksitas. Dari seleksi kondisi tunggal hingga *switch expression* modern dan pemecahan kasus praktis perbankan serta e-commerce, penguasaan materi ini menjadi landasan kokoh sebelum mempelajari konsep iterasi dan perulangan pada modul berikutnya.
