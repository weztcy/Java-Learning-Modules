# MODUL 9: OOP Lanjutan

## Deskripsi Modul
Modul ini membahas konsep-konsep lanjutan dari Pemrograman Berorientasi Objek (*Object-Oriented Programming / OOP*) dalam ekosistem bahasa Java. Materi meliputi konsep pewarisan (*Inheritance*) dan variannya (*Single*, *Multilevel*, dan *Hierarchical*), kata kunci `super` untuk pemanggilan constructor dan method induk, mekanisme *method overriding* beserta anotasi `@Override`, polimorfisme saat runtime (*Dynamic Method Dispatch*), perancangan *Abstract Class* dan *Abstract Method*, kontrak arsitektur dengan *Interface* (termasuk *multiple interface implementation*, *default methods*, *static interface methods*, serta *interface inheritance*), perbedaan hubungan keterikatan *Composition* dan *Aggregation*, hingga teknik strukturisasi tingkat lanjut seperti *Nested Classes* (static nested & inner classes) dan *Anonymous Inner Classes*.

## Tujuan Pembelajaran
Setelah menyelesaikan modul ini, pembelajar diharapkan mampu:
1. Menerapkan hubungan pewarisan (*is-a relationship*) secara tepat guna memaksimalkan *code reuse*.
2. Memanfaatkan kata kunci `super` untuk mengakses logika dan inisialisasi class induk.
3. Menerapkan *method overriding* dan polimorfisme runtime untuk menciptakan arsitektur yang mudah diperluas (*extensible*).
4. Merancang class abstrak dan method abstrak sebagai cetak biru parsial bagi subsistem.
5. Membangun kontrak antarmuka (*interface*) dan mengatasi limitasi single inheritance melalui *multiple interfaces*.
6. Membedakan hubungan kepemilikan data erat (*Composition*) dan kepemilikan data longgar (*Aggregation*).
7. Menggunakan *nested classes* dan *anonymous classes* untuk pengkapsulan logika komponen secara lokal.

---

## Daftar Materi dan Submodul

| No | Berkas | Materi Pembelajaran |
|---|---|---|
| 121 | [121_Inheritance.java](121_Inheritance.java) | Inheritance |
| 122 | [122_SingleInheritance.java](122_SingleInheritance.java) | Single inheritance |
| 123 | [123_MultilevelInheritance.java](123_MultilevelInheritance.java) | Multilevel inheritance |
| 124 | [124_HierarchicalInheritance.java](124_HierarchicalInheritance.java) | Hierarchical inheritance |
| 125 | [125_SuperKeyword.java](125_SuperKeyword.java) | Keyword `super` |
| 126 | [126_MethodOverriding.java](126_MethodOverriding.java) | Method overriding |
| 127 | [127_Polymorphism.java](127_Polymorphism.java) | Polymorphism |
| 128 | [128_DynamicMethodDispatch.java](128_DynamicMethodDispatch.java) | Dynamic method dispatch |
| 129 | [129_AbstractClasses.java](129_AbstractClasses.java) | Abstract classes |
| 130 | [130_AbstractMethods.java](130_AbstractMethods.java) | Abstract methods |
| 131 | [131_Interfaces.java](131_Interfaces.java) | Interface |
| 132 | [132_InterfaceImplementation.java](132_InterfaceImplementation.java) | Implementasi interface |
| 133 | [133_MultipleInterfaces.java](133_MultipleInterfaces.java) | Implementasi beberapa interface |
| 134 | [134_DefaultInterfaceMethods.java](134_DefaultInterfaceMethods.java) | Default methods pada interface |
| 135 | [135_StaticInterfaceMethods.java](135_StaticInterfaceMethods.java) | Static methods pada interface |
| 136 | [136_InterfaceInheritance.java](136_InterfaceInheritance.java) | Pewarisan interface |
| 137 | [137_Composition.java](137_Composition.java) | Composition |
| 138 | [138_Aggregation.java](138_Aggregation.java) | Aggregation |
| 139 | [139_NestedClasses.java](139_NestedClasses.java) | Nested classes |
| 140 | [140_AnonymousClasses.java](140_AnonymousClasses.java) | Anonymous classes |

---

## Penjelasan Setiap Submodul

### 121. 121_Inheritance.java
- **Tujuan:** Mengenal mekanisme pewarisan atribut dan method dari superclass ke subclass dengan kata kunci `extends`.
- **Konsep Utama:** Hubungan *is-a* memungkinkan subclass memiliki seluruh kapabilitas publik class induk.
- **Penjelasan Source Code:** Class `KucingPiaraan` mewarisi method `makan()` dari `HewanDasar` dan menambah method `mengeong()`.
- **Cara Menjalankan:** `java 121_Inheritance.java`
- **Hasil yang Diharapkan:** Aksi makan warisan dan suara mengeong tercetak di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 121_Inheritance](output/121_Inheritance.png)

### 122. 122_SingleInheritance.java
- **Tujuan:** Memahami struktur pewarisan tunggal langsung (*single inheritance*).
- **Konsep Utama:** Java membatasi class hanya boleh memiliki satu superclass langsung untuk menghindari kompleksitas *diamond problem*.
- **Penjelasan Source Code:** `MobilSedan` mewarisi satu superclass langsung yaitu `KendaraanBermotor`.
- **Cara Menjalankan:** `java 122_SingleInheritance.java`
- **Hasil yang Diharapkan:** Method hidupkan mesin dan buka bagasi tercetak berurutan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 122_SingleInheritance](output/122_SingleInheritance.png)

### 123. 123_MultilevelInheritance.java
- **Tujuan:** Mengimplementasikan rantai pewarisan bertingkat dari kakek hingga anak.
- **Konsep Utama:** Subclass tingkat terbawah mewarisi akumulasi seluruh atribut dari rantai leluhurnya.
- **Penjelasan Source Code:** `MobilListrik` mewarisi atribut dari `MobilDarat` dan `AlatTransportasi`.
- **Cara Menjalankan:** `java 123_MultilevelInheritance.java`
- **Hasil yang Diharapkan:** Informasi kategori, suara klakson, dan pengisian baterai tampil utuh.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 123_MultilevelInheritance](output/123_MultilevelInheritance.png)

### 124. 124_HierarchicalInheritance.java
- **Tujuan:** Merancang percabangan satu superclass ke banyak subclass terspesialisasi.
- **Konsep Utama:** Berbagai jenis turunan berbagi atribut dasar yang sama namun memiliki keunikan masing-masing.
- **Penjelasan Source Code:** `KaryawanTetap` dan `KaryawanKontrak` sama-sama mewarisi class `KaryawanPerusahaan`.
- **Cara Menjalankan:** `java 124_HierarchicalInheritance.java`
- **Hasil yang Diharapkan:** Rincian penghasilan karyawan tetap dan kontrak ditampilkan sesuai skemanya.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 124_HierarchicalInheritance](output/124_HierarchicalInheritance.png)

### 125. 125_SuperKeyword.java
- **Tujuan:** Menggunakan kata kunci `super` untuk memanggil constructor dan method milik superclass.
- **Konsep Utama:** Panggilan `super(...)` pada baris pertama constructor memastikan inisialisasi induk tuntas sebelum anak.
- **Penjelasan Source Code:** Mengalirkan parameter properti induk melalui `super(properti)` dan memanggil method `super.sapa()`.
- **Cara Menjalankan:** `java 125_SuperKeyword.java`
- **Hasil yang Diharapkan:** Log inisialisasi berurutan dan pemanggilan method induk tercetak.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 125_SuperKeyword](output/125_SuperKeyword.png)

### 126. 126_MethodOverriding.java
- **Tujuan:** Mengganti perilaku method superclass pada subclass menggunakan anotasi `@Override`.
- **Konsep Utama:** Subclass mendefinisikan ulang method dengan nama dan signature persis sama untuk perilaku spesifik.
- **Penjelasan Source Code:** `KucingSuara` dan `AnjingSuara` meng-override method `bersuara()` dari `HewanSuara`.
- **Cara Menjalankan:** `java 126_MethodOverriding.java`
- **Hasil yang Diharapkan:** Suara meong dan guk-guk tercetak sesuai objek konkretnya.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 126_MethodOverriding](output/126_MethodOverriding.png)

### 127. 127_Polymorphism.java
- **Tujuan:** Memperlakukan beragam objek turunan secara seragam melalui tipe referensi superclass.
- **Konsep Utama:** Wadah polimorfik (seperti array superclass) dapat menampung objek turunan apa pun.
- **Penjelasan Source Code:** Menyimpan objek `Persegi` dan `LingkaranPoli` ke dalam array `BangunDatar` untuk menghitung luas.
- **Cara Menjalankan:** `java 127_Polymorphism.java`
- **Hasil yang Diharapkan:** Luas masing-masing bentuk geometri terhitung akurat sesuai rumusnya.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 127_Polymorphism](output/127_Polymorphism.png)

### 128. 128_DynamicMethodDispatch.java
- **Tujuan:** Memahami resolusi method saat runtime (*runtime polymorphism*).
- **Konsep Utama:** JVM memutuskan method mana yang dieksekusi berdasarkan jenis objek aktual di heap, bukan tipe referensinya.
- **Penjelasan Source Code:** Mengalirkan pesan melalui satu variabel referensi yang berganti-ganti objek gateway (Email, SMS, Push).
- **Cara Menjalankan:** `java 128_DynamicMethodDispatch.java`
- **Hasil yang Diharapkan:** Notifikasi terkirim melalui format gateway yang bersesuaian saat runtime.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 128_DynamicMethodDispatch](output/128_DynamicMethodDispatch.png)

### 129. 129_AbstractClasses.java
- **Tujuan:** Merancang abstract class sebagai kerangka parsial yang mencegah instansiasi langsung.
- **Konsep Utama:** Abstract class dapat memiliki method konkret dengan implementasi dan method abstrak tanpa implementasi.
- **Penjelasan Source Code:** Class `DokumenDigital` mewariskan method `bukaFile()` dan mewajibkan subclass mengimplementasikan cetak.
- **Cara Menjalankan:** `java 129_AbstractClasses.java`
- **Hasil yang Diharapkan:** Pesan pembukaan file dan proses cetak PDF ditampilkan di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 129_AbstractClasses](output/129_AbstractClasses.png)

### 130. 130_AbstractMethods.java
- **Tujuan:** Menerapkan pola perancangan *Template Method* menggunakan abstract methods.
- **Konsep Utama:** Kerangka alur didefinisikan pada superclass, sementara detail langkah diserahkan kepada subclass.
- **Penjelasan Source Code:** Class `MesinPabrik` mengatur alur start-kerja-stop untuk robot pengelas dan konveyor barang.
- **Cara Menjalankan:** `java 130_AbstractMethods.java`
- **Hasil yang Diharapkan:** Langkah kerja kedua mesin industri dieksekusi secara teratur.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 130_AbstractMethods](output/130_AbstractMethods.png)

### 131. 131_Interfaces.java
- **Tujuan:** Memahami konsep Interface sebagai kontrak murni spesifikasi perilaku perangkat lunak.
- **Konsep Utama:** Semua variabel dalam interface otomatis bersifat `public static final` dan method berstatus `public abstract`.
- **Penjelasan Source Code:** Mendefinisikan interface `BisaDiisiDaya` dan membaca konstanta standar konektornya.
- **Cara Menjalankan:** `java 131_Interfaces.java`
- **Hasil yang Diharapkan:** Nilai standar protokol konektor dan tegangan maksimal interface tercetak.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 131_Interfaces](output/131_Interfaces.png)

### 132. 132_InterfaceImplementation.java
- **Tujuan:** Mengimplementasikan kontrak interface pada class menggunakan kata kunci `implements`.
- **Konsep Utama:** Class yang mengimplementasikan interface wajib menulis kode untuk seluruh method dalam interface.
- **Penjelasan Source Code:** Class `PembayaranKartuKredit` mengimplementasikan method pembayaran dan pengiriman kuitansi.
- **Cara Menjalankan:** `java 132_InterfaceImplementation.java`
- **Hasil yang Diharapkan:** Proses otorisasi pembayaran dan konfirmasi email tercetak di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 132_InterfaceImplementation](output/132_InterfaceImplementation.png)

### 133. 133_MultipleInterfaces.java
- **Tujuan:** Menerapkan implementasi beberapa interface sekaligus dalam satu class.
- **Konsep Utama:** Solusi resmi Java dalam mengatasi ketiadaan pewarisan ganda (*multiple inheritance of state*).
- **Penjelasan Source Code:** Class `SmartphoneSerbaBisa` mengimplementasikan interface audio, video, dan nirkabel secara bersamaan.
- **Cara Menjalankan:** `java 133_MultipleInterfaces.java`
- **Hasil yang Diharapkan:** Kemampuan pemutaran musik, perekaman video, dan koneksi Wi-Fi berjalan serempak.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 133_MultipleInterfaces](output/133_MultipleInterfaces.png)

### 134. 134_DefaultInterfaceMethods.java
- **Tujuan:** Memanfaatkan *default methods* (Java 8+) untuk evolusi antarmuka tanpa merusak kode lama.
- **Konsep Utama:** Kata kunci `default` memungkinkan penyediaan implementasi bawaan langsung di dalam interface.
- **Penjelasan Source Code:** Memanggil method default `kirimDenganEnkripsi()` dari interface pesan tanpa harus di-override.
- **Cara Menjalankan:** `java 134_DefaultInterfaceMethods.java`
- **Hasil yang Diharapkan:** Pesan teks biasa dan pesan berenkripsi default berhasil dieksekusi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 134_DefaultInterfaceMethods](output/134_DefaultInterfaceMethods.png)

### 135. 135_StaticInterfaceMethods.java
- **Tujuan:** Menggunakan method utilitas statis langsung di dalam deklarasi interface.
- **Konsep Utama:** Method statis interface tidak diwarisi oleh class pengimplementasi dan dipanggil via nama interface.
- **Penjelasan Source Code:** Memanggil fungsi statis `PemeriksaFormat.isValidEmail()` untuk memvalidasi alamat surel.
- **Cara Menjalankan:** `java 135_StaticInterfaceMethods.java`
- **Hasil yang Diharapkan:** Hasil validasi format email valid dan tidak valid ditampilkan di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 135_StaticInterfaceMethods](output/135_StaticInterfaceMethods.png)

### 136. 136_InterfaceInheritance.java
- **Tujuan:** Menggabungkan dan memperluas beberapa interface menggunakan kata kunci `extends`.
- **Konsep Utama:** Sebuah interface diperbolehkan mewarisi lebih dari satu interface induk sekaligus.
- **Penjelasan Source Code:** Interface `KendaraanTempurUdara` mewarisi interface `KendaraanUdara` dan `SenjataMiliter`.
- **Cara Menjalankan:** `java 136_InterfaceInheritance.java`
- **Hasil yang Diharapkan:** Pesawat tempur mampu melakukan aksi terbang dan meluncurkan rudal.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 136_InterfaceInheritance](output/136_InterfaceInheritance.png)

### 137. 137_Composition.java
- **Tujuan:** Menerapkan relasi kepemilikan erat (*strong has-a*) dengan prinsip Komposisi.
- **Konsep Utama:** Objek bagian (*part*) diciptakan dan dihancurkan bersama dengan objek induk (*whole*).
- **Penjelasan Source Code:** Objek `MobilKomposisi` menciptakan dan mengelola siklus hidup objek `MesinMobil`.
- **Cara Menjalankan:** `java 137_Composition.java`
- **Hasil yang Diharapkan:** Informasi mesin menyala dan mobil melaju tercetak di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 137_Composition](output/137_Composition.png)

### 138. 138_Aggregation.java
- **Tujuan:** Menerapkan relasi kepemilikan longgar (*weak has-a*) dengan prinsip Agregasi.
- **Konsep Utama:** Objek bagian memiliki siklus hidup independen dan tetap eksis meskipun objek penampung dihapus.
- **Penjelasan Source Code:** Objek `Dosen` dibuat di luar class `JurusanKampus` lalu didaftarkan ke dalam himpunan.
- **Cara Menjalankan:** `java 138_Aggregation.java`
- **Hasil yang Diharapkan:** Daftar dosen dalam jurusan tercetak dengan penjelasan independensi siklus hidupnya.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 138_Aggregation](output/138_Aggregation.png)

### 139. 139_NestedClasses.java
- **Tujuan:** Mengelompokkan class pembantu secara logis menggunakan Static Nested Class dan Non-static Inner Class.
- **Konsep Utama:** Inner class memiliki akses penuh ke atribut instance luar, sedangkan static nested class berdiri mandiri.
- **Penjelasan Source Code:** Membentuk objek processor (static nested) dan port USB (inner class terikat instance komputer).
- **Cara Menjalankan:** `java 139_NestedClasses.java`
- **Hasil yang Diharapkan:** Cetakan spesifikasi processor dan koneksi perangkat pada port USB komputer.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 139_NestedClasses](output/139_NestedClasses.png)

### 140. 140_AnonymousClasses.java
- **Tujuan:** Membuat class sekali pakai (*on-the-fly*) tanpa memberi nama class secara eksplisit.
- **Konsep Utama:** Deklarasi dan instansiasi langsung di tempat pemanggilan untuk penanganan *event handling*.
- **Penjelasan Source Code:** Menyediakan implementasi antarmuka tombol simpan dan tombol batal secara langsung.
- **Cara Menjalankan:** `java 140_AnonymousClasses.java`
- **Hasil yang Diharapkan:** Aksi anonymous tombol simpan dan batal tercetak di layar.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 140_AnonymousClasses](output/140_AnonymousClasses.png)

---

## Ringkasan Modul
Modul 9 telah memperdalam pemahaman paradigma Berorientasi Objek ke tingkatan arsitektural yang matang. Pembelajar kini menguasai hierarki pewarisan, polimorfisme dinamis, perancangan kontrak antarmuka yang fleksibel, pembedaan relasi komposisi dan agregasi, hingga penyusunan class bersarang dan anonim. Fondasi arsitektur ini mempersiapkan pembelajar untuk mengelola keandalan sistem melalui penanganan kesalahan (*Exception Handling*) pada Modul 10.
