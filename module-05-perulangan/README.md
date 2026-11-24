# MODUL 5: Perulangan

## Deskripsi Modul
Modul ini membahas konsep iterasi dan perulangan (*looping*) dalam bahasa pemrograman Java. Materi mencakup perulangan `for` konvensional, perulangan berbasis kondisi `while`, perulangan yang dijamin berjalan minimal sekali `do-while`, perulangan bersarang (*nested loops*), kontrol alur dengan pernyataan `break` dan `continue`, serta kontrol lanjutan menggunakan *labeled break* dan *labeled continue*. Modul ini juga mengajarkan *enhanced for loop* (for-each), penggunaan counter dan akumulator, hingga pembuatan program terapan seperti kalkulator deret Gauss, faktorial bilangan, tabel perkalian, dan pencetakan pola matriks visual.

## Tujuan Pembelajaran
Setelah menyelesaikan modul ini, pembelajar diharapkan mampu:
1. Memilih konstruksi perulangan (`for`, `while`, `do-while`) yang tepat sesuai kondisi persoalan.
2. Mengendalikan alur iterasi dengan kata kunci `break` dan `continue`.
3. Mengontrol perulangan multi-tingkat menggunakan *labeled statement*.
4. Menggunakan *enhanced for loop* untuk iterasi data array secara bersih dan elegan.
5. Menerapkan variabel pencacah (*counter*) dan akumulator (*sum*) untuk agregasi data.
6. Menyelesaikan algoritma pola visual dan perhitungan matematika berbasis perulangan.

---

## Daftar Materi dan Submodul

| No | Berkas | Materi Pembelajaran |
|---|---|---|
| 51 | [51_ForLoop.java](51_ForLoop.java) | Perulangan `for` |
| 52 | [52_WhileLoop.java](52_WhileLoop.java) | Perulangan `while` |
| 53 | [53_DoWhileLoop.java](53_DoWhileLoop.java) | Perulangan `do-while` |
| 54 | [54_NestedLoop.java](54_NestedLoop.java) | Nested loop |
| 55 | [55_BreakStatement.java](55_BreakStatement.java) | Pernyataan `break` |
| 56 | [56_ContinueStatement.java](56_ContinueStatement.java) | Pernyataan `continue` |
| 57 | [57_LabeledBreak.java](57_LabeledBreak.java) | Labeled break |
| 58 | [58_LabeledContinue.java](58_LabeledContinue.java) | Labeled continue |
| 59 | [59_EnhancedForLoop.java](59_EnhancedForLoop.java) | Enhanced for loop |
| 60 | [60_LoopCounter.java](60_LoopCounter.java) | Penghitung perulangan |
| 61 | [61_SumNumbers.java](61_SumNumbers.java) | Penjumlahan bilangan |
| 62 | [62_FactorialLoop.java](62_FactorialLoop.java) | Faktorial menggunakan loop |
| 63 | [63_MultiplicationTable.java](63_MultiplicationTable.java) | Tabel perkalian |
| 64 | [64_NumberPatterns.java](64_NumberPatterns.java) | Pola angka dan bintang |

---

## Penjelasan Setiap Submodul

### 51. 51_ForLoop.java
- **Tujuan:** Menguasai perulangan terhitung (*counted loop*) dengan sintaks `for`.
- **Konsep Utama:** Terdiri atas inisialisasi counter, evaluasi kondisi terminasi, dan ekspresi pembaruan (increment/decrement).
- **Penjelasan Source Code:** Menjalankan perulangan maju 1 sampai 5 dan perulangan mundur hitung peluncuran.
- **Cara Menjalankan:**
  ```bash
  java 51_ForLoop.java
  ```
- **Hasil yang Diharapkan:** Teks terulang berurutan dan hitung mundur tampil di konsol.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 51_ForLoop](output/51_ForLoop.png)

### 52. 52_WhileLoop.java
- **Tujuan:** Menjalankan perulangan berbasis kondisi tak terhitung (*uncounted loop*).
- **Konsep Utama:** Kondisi diperiksa di awal (*pre-test*); jika kondisi bernilai false, blok tidak pernah dijalankan.
- **Penjelasan Source Code:** Mensimulasikan penurunan daya baterai hingga habis berdasarkan konsumsi per jam.
- **Cara Menjalankan:**
  ```bash
  java 52_WhileLoop.java
  ```
- **Hasil yang Diharapkan:** Sisa baterai berkurang bertahap hingga bernilai 0%.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 52_WhileLoop](output/52_WhileLoop.png)

### 53. 53_DoWhileLoop.java
- **Tujuan:** Menggunakan perulangan dengan evaluasi kondisi di akhir (*post-test*).
- **Konsep Utama:** Blok pernyataan dijamin dieksekusi minimal satu kali sebelum kondisi diuji.
- **Penjelasan Source Code:** Menjalankan blok perulangan meskipun kondisi awal bernilai false.
- **Cara Menjalankan:**
  ```bash
  java 53_DoWhileLoop.java
  ```
- **Hasil yang Diharapkan:** Blok dieksekusi satu kali lalu perulangan berhenti.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 53_DoWhileLoop](output/53_DoWhileLoop.png)

### 54. 54_NestedLoop.java
- **Tujuan:** Membuat perulangan di dalam perulangan untuk memproses data dua dimensi.
- **Konsep Utama:** Loop dalam menyelesaikan seluruh iterasinya untuk setiap satu iterasi loop luar.
- **Penjelasan Source Code:** Mencetak koordinat sel [baris, kolom] dalam bentuk matriks 3x4.
- **Cara Menjalankan:**
  ```bash
  java 54_NestedLoop.java
  ```
- **Hasil yang Diharapkan:** Grid koordinat tercetak rapi sesuai baris dan kolom.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 54_NestedLoop](output/54_NestedLoop.png)

### 55. 55_BreakStatement.java
- **Tujuan:** Menghentikan loop secara langsung saat suatu kondisi khusus terpenuhi.
- **Konsep Utama:** Pernyataan `break` langsung memindahkan kontrol eksekusi ke luar blok perulangan.
- **Penjelasan Source Code:** Melakukan pencarian angka target; saat angka ditemukan, loop langsung dihentikan.
- **Cara Menjalankan:**
  ```bash
  java 55_BreakStatement.java
  ```
- **Hasil yang Diharapkan:** Iterasi berhenti segera setelah target ditemukan pada angka 7.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 55_BreakStatement](output/55_BreakStatement.png)

### 56. 56_ContinueStatement.java
- **Tujuan:** Melewati sisa instruksi pada iterasi aktif dan langsung melanjutkan ke iterasi berikutnya.
- **Konsep Utama:** `continue` mengabaikan kode di bawahnya dan langsung mengevaluasi step/kondisi berikutnya.
- **Penjelasan Source Code:** Menyaring bilangan ganjil dengan melewati semua bilangan genap menggunakan `continue`.
- **Cara Menjalankan:**
  ```bash
  java 56_ContinueStatement.java
  ```
- **Hasil yang Diharapkan:** Hanya bilangan ganjil yang tercetak di layar.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 56_ContinueStatement](output/56_ContinueStatement.png)

### 57. 57_LabeledBreak.java
- **Tujuan:** Menghentikan perulangan tingkat terluar dari dalam perulangan terdalam.
- **Konsep Utama:** Label ditempatkan sebelum header loop luar dan dirujuk pada pernyataan `break <label>`.
- **Penjelasan Source Code:** Menghentikan loop bersarang secara menyeluruh saat koordinat tertentu tercapai.
- **Cara Menjalankan:**
  ```bash
  java 57_LabeledBreak.java
  ```
- **Hasil yang Diharapkan:** Kedua loop berhenti bersamaan saat kondisi tercapai.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 57_LabeledBreak](output/57_LabeledBreak.png)

### 58. 58_LabeledContinue.java
- **Tujuan:** Melompati iterasi perulangan terluar dari dalam perulangan bersarang.
- **Konsep Utama:** Pernyataan `continue <label>` menginstruksikan loop luar untuk maju ke iterasi berikutnya.
- **Penjelasan Source Code:** Melewati sisa kolom dan langsung beralih ke baris berikutnya pada kondisi tertentu.
- **Cara Menjalankan:**
  ```bash
  java 58_LabeledContinue.java
  ```
- **Hasil yang Diharapkan:** Alur baris melompat langsung saat kolom bernilai 2.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 58_LabeledContinue](output/58_LabeledContinue.png)

### 59. 59_EnhancedForLoop.java
- **Tujuan:** Melakukan perulangan bersih terhadap array tanpa variabel indeks manual.
- **Konsep Utama:** Sintaks `for (Tipe elemen : koleksi)` menyederhanakan penjelajahan data.
- **Penjelasan Source Code:** Menjelajahi array nama bahasa pemrograman dan menjumlahkan array nilai angka.
- **Cara Menjalankan:**
  ```bash
  java 59_EnhancedForLoop.java
  ```
- **Hasil yang Diharapkan:** Seluruh elemen array dan total akumulasi tercetak dengan benar.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 59_EnhancedForLoop](output/59_EnhancedForLoop.png)

### 60. 60_LoopCounter.java
- **Tujuan:** Menggunakan pencacah untuk menghitung frekuensi kejadian dalam kumpulan data.
- **Konsep Utama:** Variabel counter diinkrementasi berdasarkan pemenuhan syarat tertentu.
- **Penjelasan Source Code:** Menghitung jumlah peserta yang lulus dan tidak lulus dari sekumpulan skor ujian.
- **Cara Menjalankan:**
  ```bash
  java 60_LoopCounter.java
  ```
- **Hasil yang Diharapkan:** Statistik total peserta, jumlah lulus, dan tidak lulus ditampilkan.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 60_LoopCounter](output/60_LoopCounter.png)

### 61. 61_SumNumbers.java
- **Tujuan:** Menghitung akumulasi deret bilangan asli secara berulang.
- **Konsep Utama:** Variabel penyimpan akumulasi ditambah secara berkala pada setiap putaran loop.
- **Penjelasan Source Code:** Menjumlahkan angka 1 hingga 100 lalu memvalidasinya dengan rumus deret Gauss.
- **Cara Menjalankan:**
  ```bash
  java 61_SumNumbers.java
  ```
- **Hasil yang Diharapkan:** Nilai akumulasi loop dan hasil rumus Gauss bernilai sama (5050).
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 61_SumNumbers](output/61_SumNumbers.png)

### 62. 62_FactorialLoop.java
- **Tujuan:** Menghitung hasil kali faktorial (N!) menggunakan perulangan.
- **Konsep Utama:** Akumulasi perkalian beruntun dari bilangan n hingga 1.
- **Penjelasan Source Code:** Menghitung dan mencetak rincian perkalian faktorial untuk angka 7.
- **Cara Menjalankan:**
  ```bash
  java 62_FactorialLoop.java
  ```
- **Hasil yang Diharapkan:** Deret perkalian faktorial dan hasil akhir 5040 tercetak rapi.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 62_FactorialLoop](output/62_FactorialLoop.png)

### 63. 63_MultiplicationTable.java
- **Tujuan:** Membangun format tabel perkalian rapi dengan perulangan dua dimensi.
- **Konsep Utama:** Format specifier `%4d` digunakan untuk menyelaraskan kolom angka perkalian.
- **Penjelasan Source Code:** Menghasilkan tabel perkalian angka 1 hingga 5 lengkap dengan header kolom dan baris.
- **Cara Menjalankan:**
  ```bash
  java 63_MultiplicationTable.java
  ```
- **Hasil yang Diharapkan:** Tabel perkalian tampil rapi berstruktur kolom.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 63_MultiplicationTable](output/63_MultiplicationTable.png)

### 64. 64_NumberPatterns.java
- **Tujuan:** Menciptakan visualisasi bentuk geometris menggunakan karakter teks dan angka.
- **Konsep Utama:** Logika hubungan antara nomor baris luar dan batas pengulangan karakter pada loop dalam.
- **Penjelasan Source Code:** Menghasilkan segitiga siku-siku angka bertingkat dan segitiga bintang terbalik.
- **Cara Menjalankan:**
  ```bash
  java 64_NumberPatterns.java
  ```
- **Hasil yang Diharapkan:** Pola susunan angka dan bintang tercetak sempurna di layar konsol.
- **Screenshot Hasil Eksekusi:**
  ![Hasil Eksekusi 64_NumberPatterns](output/64_NumberPatterns.png)

---

## Ringkasan Modul
Modul 5 telah memberikan penguasaan penuh atas semua variasi perulangan dalam Java. Dengan memahami perbedaan `for`, `while`, `do-while`, perulangan bersarang, kendali lompatan `break`/`continue`, dan manipulasi data melalui *counter* serta akumulasi matematika, pembelajar siap beralih ke konsep modularisasi program menggunakan fungsi (*method*) pada modul berikutnya.
