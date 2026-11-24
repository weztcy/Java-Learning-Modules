# MODUL 12: Generics dan Functional Programming

## Deskripsi Modul
Modul ini membahas paradigma keamanan tipe (*type safety*) menggunakan fitur *Generics* dan paradigma pemrograman deklaratif modern dengan *Functional Programming* di Java. Pembahasan mencakup dasar-dasar Generics, pembuatan generic class, generic methods, parameter batas tipe (*bounded type parameters*), penggunaan kartu bebas (*wildcards* `?`, `? extends`, `? super`), generic interfaces, serta pemahaman mekanisme *Type Erasure* di JVM. Pada aspek pemrograman fungsional, materi mengupas tuntas ekspresi *Lambda*, anotasi `@FunctionalInterface`, 4 antarmuka fungsional standar (`Predicate`, `Function`, `Consumer`, `Supplier`), *Method References* (`::`), hingga pemanfaatan komprehensif *Java Stream API* (pembuatan stream, operasi perantara `filter` dan `map`, operasi reduksi `reduce`, agregasi `collect` dengan `Collectors`, pengurutan `sorted`, pengelompokan `groupingBy` & `partitioningBy`, serta pemrosesan paralel *Parallel Streams*).

## Tujuan Pembelajaran
Setelah menyelesaikan modul ini, pembelajar diharapkan mampu:
1. Memanfaatkan Generics untuk mendeteksi ketidaksesuaian tipe pada waktu kompilasi (*compile-time type safety*).
2. Merancang class, method, dan interface generik yang dapat beroperasi pada berbagai tipe data.
3. Membatasi variasi tipe generik dengan *bounded type parameters* dan *wildcard variance*.
4. Memahami konsekuensi arsitektural dari *Type Erasure* pada runtime JVM.
5. Menulis kode deklaratif ringkas menggunakan ekspresi *Lambda* dan *Method References*.
6. Menerapkan interface fungsional standar Java (`Predicate`, `Function`, `Consumer`, `Supplier`).
7. Membangun pipa pengolahan data (*stream pipeline*) yang efisien menggunakan Stream API.
8. Melakukan agregasi data kompleks (*grouping*, *partitioning*) dan komputasi paralel (*parallel streams*).

---

## Daftar Materi dan Submodul

| No | Berkas | Materi Pembelajaran |
|---|---|---|
| 179 | [179_GenericsBasic.java](179_GenericsBasic.java) | Generics dasar |
| 180 | [180_GenericClasses.java](180_GenericClasses.java) | Generic classes |
| 181 | [181_GenericMethods.java](181_GenericMethods.java) | Generic methods |
| 182 | [182_BoundedTypeParameters.java](182_BoundedTypeParameters.java) | Bounded type parameters |
| 183 | [183_Wildcards.java](183_Wildcards.java) | Wildcards |
| 184 | [184_GenericInterfaces.java](184_GenericInterfaces.java) | Generic interfaces |
| 185 | [185_TypeErasure.java](185_TypeErasure.java) | Type erasure |
| 186 | [186_LambdaExpressions.java](186_LambdaExpressions.java) | Lambda expressions |
| 187 | [187_FunctionalInterfaces.java](187_FunctionalInterfaces.java) | Functional interfaces |
| 188 | [188_PredicateInterface.java](188_PredicateInterface.java) | Interface `Predicate` |
| 189 | [189_FunctionInterface.java](189_FunctionInterface.java) | Interface `Function` |
| 190 | [190_ConsumerInterface.java](190_ConsumerInterface.java) | Interface `Consumer` |
| 191 | [191_SupplierInterface.java](191_SupplierInterface.java) | Interface `Supplier` |
| 192 | [192_MethodReferences.java](192_MethodReferences.java) | Method references |
| 193 | [193_StreamBasic.java](193_StreamBasic.java) | Stream API |
| 194 | [194_StreamFilter.java](194_StreamFilter.java) | `filter()` |
| 195 | [195_StreamMap.java](195_StreamMap.java) | `map()` |
| 196 | [196_StreamReduce.java](196_StreamReduce.java) | `reduce()` |
| 197 | [197_StreamCollect.java](197_StreamCollect.java) | `collect()` |
| 198 | [198_StreamSorting.java](198_StreamSorting.java) | Pengurutan dengan Stream |
| 199 | [199_StreamGrouping.java](199_StreamGrouping.java) | Grouping dan partitioning |
| 200 | [200_ParallelStreams.java](200_ParallelStreams.java) | Parallel streams |

---

## Penjelasan Setiap Submodul

### 179. 179_GenericsBasic.java
- **Tujuan:** Memahami keuntungan utama generics dalam menjamin keamanan tipe (*type safety*).
- **Konsep Utama:** Memindahkan pendeteksian kesalahan tipe data dari waktu eksekusi (*runtime*) ke waktu kompilasi (*compile-time*).
- **Penjelasan Source Code:** Membaca data list string tanpa memerlukan casting manual dan terbebas dari ClassCastException.
- **Cara Menjalankan:** `java 179_GenericsBasic.java`
- **Hasil yang Diharapkan:** Elemen kota terbaca aman dan penjelasan nilai edukatif tipe generik ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 179_GenericsBasic](output/179_GenericsBasic.png)

### 180. 180_GenericClasses.java
- **Tujuan:** Membuat class yang dapat menerima parameter tipe fleksibel `<T>`.
- **Konsep Utama:** Menjadikan class sebagai wadah penampung serbaguna untuk berbagai jenis objek data.
- **Penjelasan Source Code:** Membentuk objek `KotakGenerik` untuk menampung teks string dan angka integer.
- **Cara Menjalankan:** `java 180_GenericClasses.java`
- **Hasil yang Diharapkan:** Isi kotak teks dan kotak angka ditampilkan dengan tepat.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 180_GenericClasses](output/180_GenericClasses.png)

### 181. 181_GenericMethods.java
- **Tujuan:** Merancang method generik mandiri tanpa harus menjadikan seluruh class generik.
- **Konsep Utama:** Tipe parameter ditempatkan tepat sebelum tipe nilai kembali method: `<E> void ...`.
- **Penjelasan Source Code:** Method `cetakElemenArray()` mampu mencetak array bertipe Integer, String, maupun Double.
- **Cara Menjalankan:** `java 181_GenericMethods.java`
- **Hasil yang Diharapkan:** Seluruh elemen array dari ketiga tipe berbeda tercetak rapi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 181_GenericMethods](output/181_GenericMethods.png)

### 182. 182_BoundedTypeParameters.java
- **Tujuan:** Membatasi variasi tipe generik hanya pada hierarki class tertentu menggunakan kata kunci `extends`.
- **Konsep Utama:** Sintaks `<T extends Number>` memastikan tipe data memiliki method operasi angka seperti `doubleValue()`.
- **Penjelasan Source Code:** Menghitung rata-rata nilai dari kumpulan angka Integer dan Double secara aman.
- **Cara Menjalankan:** `java 182_BoundedTypeParameters.java`
- **Hasil yang Diharapkan:** Rata-rata dari data integer dan double terhitung dengan presisi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 182_BoundedTypeParameters](output/182_BoundedTypeParameters.png)

### 183. 183_Wildcards.java
- **Tujuan:** Menggunakan wildcard `?` untuk fleksibilitas penerimaan parameter koleksi.
- **Konsep Utama:** *Unbounded wildcard* `List<?>` dan *upper-bounded wildcard* `List<? extends Number>`.
- **Penjelasan Source Code:** Menampilkan list sembarang tipe dan mengakumulasikan seluruh variasi list turunan angka.
- **Cara Menjalankan:** `java 183_Wildcards.java`
- **Hasil yang Diharapkan:** Elemen list dicetak dan hasil akumulasi angka int serta double ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 183_Wildcards](output/183_Wildcards.png)

### 184. 184_GenericInterfaces.java
- **Tujuan:** Merancang kontrak generic interface untuk abstraksi repository data.
- **Konsep Utama:** Interface dengan parameter pasangan `<K, V>` diimplementasikan oleh class penyimpanan.
- **Penjelasan Source Code:** Mengimplementasikan interface `RepositoriData` menggunakan `HashMap` untuk data nama dan usia.
- **Cara Menjalankan:** `java 184_GenericInterfaces.java`
- **Hasil yang Diharapkan:** Data berhasil disimpan dan diambil kembali berdasarkan kuncinya.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 184_GenericInterfaces](output/184_GenericInterfaces.png)

### 185. 185_TypeErasure.java
- **Tujuan:** Memahami cara kerja internal Java Virtual Machine dalam menangani tipe generik.
- **Konsep Utama:** Informasi tipe generik dihapus (*erased*) oleh compiler menjadi tipe mentah (*raw type*) pada bytecode.
- **Penjelasan Source Code:** Membuktikan bahwa class runtime dari `List<String>` dan `List<Integer>` adalah sama.
- **Cara Menjalankan:** `java 185_TypeErasure.java`
- **Hasil yang Diharapkan:** Perbandingan tipe runtime membuktikan kesamaan class mentah di JVM.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 185_TypeErasure](output/185_TypeErasure.png)

### 186. 186_LambdaExpressions.java
- **Tujuan:** Menuliskan implementasi fungsi anonim ringkas menggunakan operator panah `->`.
- **Konsep Utama:** Menyingkat penulisan anonymous inner class menjadi ekspresi fungsional satu baris.
- **Penjelasan Source Code:** Mengimplementasikan operasi matematika penjumlahan dan perkalian menggunakan sintaks lambda.
- **Cara Menjalankan:** `java 186_LambdaExpressions.java`
- **Hasil yang Diharapkan:** Hasil operasi penjumlahan dan perkalian tercetak tepat.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 186_LambdaExpressions](output/186_LambdaExpressions.png)

### 187. 187_FunctionalInterfaces.java
- **Tujuan:** Mendefinisikan antarmuka fungsional kustom dengan anotasi `@FunctionalInterface`.
- **Konsep Utama:** Kontrak antarmuka yang tepat memiliki satu abstract method (*Single Abstract Method / SAM*).
- **Penjelasan Source Code:** Mengubah teks menjadi huruf kapital dan menyisipkan tanda kurung menggunakan lambda.
- **Cara Menjalankan:** `java 187_FunctionalInterfaces.java`
- **Hasil yang Diharapkan:** Hasil transformasi teks fungsional tercetak di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 187_FunctionalInterfaces](output/187_FunctionalInterfaces.png)

### 188. 188_PredicateInterface.java
- **Tujuan:** Memanfaatkan interface standar `java.util.function.Predicate` untuk evaluasi kondisi boolean.
- **Konsep Utama:** Fungsi `test(T)` menghasilkan boolean dan dapat digabungkan dengan method `.and()`, `.or()`.
- **Penjelasan Source Code:** Menguji apakah suatu bilangan tergolong genap dan bernilai positif.
- **Cara Menjalankan:** `java 188_PredicateInterface.java`
- **Hasil yang Diharapkan:** Hasil evaluasi predicate tunggal dan predicate gabungan ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 188_PredicateInterface](output/188_PredicateInterface.png)

### 189. 189_FunctionInterface.java
- **Tujuan:** Melakukan transformasi nilai masukan menjadi nilai keluaran baru dengan `Function<T, R>`.
- **Konsep Utama:** Method `apply(T)` menerima argumen tipe T dan mengembalikan tipe R.
- **Penjelasan Source Code:** Menghitung panjang karakter string dan memformat angka nominal menjadi format mata uang.
- **Cara Menjalankan:** `java 189_FunctionInterface.java`
- **Hasil yang Diharapkan:** Panjang kata dan hasil pemformatan mata uang tercetak di layar.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 189_FunctionInterface](output/189_FunctionInterface.png)

### 190. 190_ConsumerInterface.java
- **Tujuan:** Menjalankan aksi terhadap data tanpa menghasilkan nilai balik menggunakan `Consumer<T>`.
- **Konsep Utama:** Method `accept(T)` mengeksekusi efek samping (*side-effect*) dan mendukung perantaian `.andThen()`.
- **Penjelasan Source Code:** Mencetak elemen list modul menggunakan dua format dekorasi berantai.
- **Cara Menjalankan:** `java 190_ConsumerInterface.java`
- **Hasil yang Diharapkan:** Elemen list tercetak berurutan dengan dekorasi bintang dan panah.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 190_ConsumerInterface](output/190_ConsumerInterface.png)

### 191. 191_SupplierInterface.java
- **Tujuan:** Memproduksi atau menyediakan data secara malas (*lazy supplier*) dengan `Supplier<T>`.
- **Konsep Utama:** Method `get()` tidak menerima parameter namun selalu mengembalikan objek tipe T.
- **Penjelasan Source Code:** Menyediakan tanggal waktu saat ini dan membangkitkan bilangan bulat acak.
- **Cara Menjalankan:** `java 191_SupplierInterface.java`
- **Hasil yang Diharapkan:** Timestamp waktu terkini dan angka acak yang dibangkitkan ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 191_SupplierInterface](output/191_SupplierInterface.png)

### 192. 192_MethodReferences.java
- **Tujuan:** Menyederhanakan penulisan lambda dengan mereferensikan method yang sudah ada (`::`).
- **Konsep Utama:** Penulisan `String::toUpperCase` menggantikan `s -> s.toUpperCase()` secara elegan.
- **Penjelasan Source Code:** Mengonversi daftar nama bahasa ke huruf kapital dan mencetaknya via `System.out::println`.
- **Cara Menjalankan:** `java 192_MethodReferences.java`
- **Hasil yang Diharapkan:** Daftar string kapital tercetak rapi ke konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 192_MethodReferences](output/192_MethodReferences.png)

### 193. 193_StreamBasic.java
- **Tujuan:** Mengenal dasar-dasar pemrosesan aliran data fungsional dengan Stream API.
- **Konsep Utama:** Stream tidak menyimpan data sendiri, melainkan mengalirkan data dari koleksi melalui tahapan operasi.
- **Penjelasan Source Code:** Membuat stream dari koleksi teknologi dan menghitung jumlah elemen pada stream nilai.
- **Cara Menjalankan:** `java 193_StreamBasic.java`
- **Hasil yang Diharapkan:** Daftar teknologi dan jumlah total elemen stream tercetak di layar.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 193_StreamBasic](output/193_StreamBasic.png)

### 194. 194_StreamFilter.java
- **Tujuan:** Menyaring elemen stream menggunakan operasi perantara `.filter()`.
- **Konsep Utama:** Elemen yang tidak memenuhi kondisi predicate langsung dieliminasi dari aliran.
- **Penjelasan Source Code:** Menyaring kumpulan bilangan genap yang nilainya lebih besar dari 20.
- **Cara Menjalankan:** `java 194_StreamFilter.java`
- **Hasil yang Diharapkan:** Hanya angka genap bernilai di atas 20 yang lolos ke dalam list hasil.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 194_StreamFilter](output/194_StreamFilter.png)

### 195. 195_StreamMap.java
- **Tujuan:** Mengubah nilai atau tipe elemen stream menggunakan operasi perantara `.map()`.
- **Konsep Utama:** Memetakan setiap elemen masukan ke elemen baru satu-satu (*one-to-one transformation*).
- **Penjelasan Source Code:** Mengubah daftar nama menjadi huruf kapital dan mengekstrak panjang karakter masing-masing nama.
- **Cara Menjalankan:** `java 195_StreamMap.java`
- **Hasil yang Diharapkan:** Hasil transformasi huruf kapital dan angka panjang karakter ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 195_StreamMap](output/195_StreamMap.png)

### 196. 196_StreamReduce.java
- **Tujuan:** Menggabungkan seluruh elemen aliran menjadi satu nilai akhir menggunakan `.reduce()`.
- **Konsep Utama:** Menggunakan nilai identitas awal dan fungsi akumulator bertahap.
- **Penjelasan Source Code:** Menghitung hasil perkalian kumulatif (faktorial deret) dan penjumlahan total angka.
- **Cara Menjalankan:** `java 196_StreamReduce.java`
- **Hasil yang Diharapkan:** Hasil akumulasi perkalian dan penjumlahan terhitung akurat.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 196_StreamReduce](output/196_StreamReduce.png)

### 197. 197_StreamCollect.java
- **Tujuan:** Mengumpulkan elemen hasil stream ke dalam wadah koleksi menggunakan `Collectors`.
- **Konsep Utama:** Penggunaan `Collectors.toSet()` untuk deduplikasi dan `Collectors.joining()` untuk perangkaian string.
- **Penjelasan Source Code:** Menampung bahasa unik ke dalam Set dan menyambungkan nama bahasa dengan pemisah panah.
- **Cara Menjalankan:** `java 197_StreamCollect.java`
- **Hasil yang Diharapkan:** Himpunan set unik dan kalimat terformat hasil joining ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 197_StreamCollect](output/197_StreamCollect.png)

### 198. 198_StreamSorting.java
- **Tujuan:** Mengurutkan aliran elemen secara langsung pada pipeline stream menggunakan `.sorted()`.
- **Konsep Utama:** Menggabungkan stream dengan antarmuka Comparator untuk kriteria pengurutan kustom.
- **Penjelasan Source Code:** Mengurutkan nama kota secara alfabetis dan mengurutkan berdasarkan panjang karakter terbalik.
- **Cara Menjalankan:** `java 198_StreamSorting.java`
- **Hasil yang Diharapkan:** Daftar kota terurut abjad dan terurut panjang karakter tampil di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 198_StreamSorting](output/198_StreamSorting.png)

### 199. 199_StreamGrouping.java
- **Tujuan:** Mengelompokkan data berdasarkan kategori (*groupingBy*) dan kondisi boolean (*partitioningBy*).
- **Konsep Utama:** Pengelompokan data mirip klausa `GROUP BY` pada SQL langsung di dalam memori aplikasi.
- **Penjelasan Source Code:** Mengelompokkan pegawai berdasarkan nama departemen dan membagi dua kelompok usia >= 30 tahun.
- **Cara Menjalankan:** `java 199_StreamGrouping.java`
- **Hasil yang Diharapkan:** Map hasil pengelompokan departemen dan partisi usia tercetak rapi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 199_StreamGrouping](output/199_StreamGrouping.png)

### 200. 200_ParallelStreams.java
- **Tujuan:** Memanfaatkan seluruh core CPU secara otomatis menggunakan pemrosesan paralel `parallelStream()`.
- **Konsep Utama:** Menggunakan pool thread `ForkJoinPool.commonPool()` untuk memecah komputasi secara paralel.
- **Penjelasan Source Code:** Memproses elemen list secara bersamaan di berbagai thread dan menghitung jumlah totalnya.
- **Cara Menjalankan:** `java 200_ParallelStreams.java`
- **Hasil yang Diharapkan:** Log nama-nama worker thread yang bekerja paralel dan hasil jumlah total ditampilkan.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 200_ParallelStreams](output/200_ParallelStreams.png)

---

## Ringkasan Modul
Modul 12 telah membawa kemampuan pemrograman Java ke standar modern kelas industri. Dengan menguasai Generics (class, method, bound, wildcard), functional interfaces (Predicate, Function, Consumer, Supplier), ekspresi Lambda, Method References, serta keandalan Stream API (filter, map, reduce, grouping, parallel processing), pembelajar kini mampu menulis kode yang ringkas, deklaratif, ekspresif, dan berkinerja tinggi. Selanjutnya, pada Modul 13 kita akan mengeksplorasi pengelolaan berkas fisik (*File Handling dan I/O*).
