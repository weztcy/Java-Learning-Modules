# Modul 16: Database Programming dengan JDBC

## Deskripsi Modul
Modul 16 membahas pemrograman basis data (*database programming*) dalam bahasa Java menggunakan Java Database Connectivity (JDBC) API. Pembelajar akan mempelajari arsitektur JDBC, siklus hidup koneksi, eksekusi perintah DDL/DML dengan `Statement` dan `PreparedStatement`, pembacaan data dengan `ResultSet`, transaksi ACID (`commit` dan `rollback`), batch processing, metadata inspeksi database, penerapan pola desain Data Access Object (DAO), hingga konsep Connection Pooling untuk efisiensi koneksi tingkat perusahaan.

---

## Daftar Submodul & Panduan Praktikum

### 253. 253_JDBCConnection.java
- **Tujuan:** Membuka dan mengelola siklus hidup koneksi database dengan JDBC API.
- **Konsep Utama:** `DriverManager.getConnection()`, try-with-resources untuk auto-closing koneksi, dan inspeksi status koneksi aktif.
- **Penjelasan Source Code:** Program menghubungkan ke database menggunakan connection string `jdbc:...`, memeriksa nama katalog database, dan memastikan koneksi ditutup secara aman.
- **Cara Menjalankan:** `java 253_JDBCConnection.java`
- **Hasil yang Diharapkan:** Pesan keberhasilan koneksi, katalog database aktif, dan konfirmasi penutupan koneksi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 253_JDBCConnection](output/253_JDBCConnection.png)

### 254. 254_JDBCDriverManager.java
- **Tujuan:** Memahami registrasi dan manajemen driver database menggunakan class `DriverManager`.
- **Konsep Utama:** `DriverManager.registerDriver()`, enumerasi `DriverManager.getDrivers()`, dan pengaturan `loginTimeout`.
- **Penjelasan Source Code:** Mendaftarkan simulasi driver PostgreSQL dan MySQL, memeriksa versi driver yang terdaftar, dan melakukan resolusi driver otomatis berdasarkan prefix protokol URL.
- **Cara Menjalankan:** `java 254_JDBCDriverManager.java`
- **Hasil yang Diharapkan:** Daftar driver yang terpasang di JVM beserta nomor versinya tercetak rapi di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 254_JDBCDriverManager](output/254_JDBCDriverManager.png)

### 255. 255_JDBCStatement.java
- **Tujuan:** Menjalankan perintah SQL statis DDL dan DML menggunakan interface `Statement`.
- **Konsep Utama:** `Statement.execute()` untuk DDL (`CREATE TABLE`) dan `Statement.executeUpdate()` untuk DML (`INSERT`).
- **Penjelasan Source Code:** Membuat tabel mahasiswa dan memasukkan baris baru secara langsung tanpa parameterisasi.
- **Cara Menjalankan:** `java 255_JDBCStatement.java`
- **Hasil yang Diharapkan:** Log pembuatan skema tabel dan laporan jumlah baris terdampak dari eksekusi SQL statis.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 255_JDBCStatement](output/255_JDBCStatement.png)

### 256. 256_JDBCPreparedStatement.java
- **Tujuan:** Menggunakan `PreparedStatement` untuk keamanan kueri terparameterisasi dan pencegahan kerentanan SQL Injection.
- **Konsep Utama:** Placeholder tanda tanya (`?`), setter parameter bertipe data (`setInt`, `setString`, `setDouble`), dan pre-kompilasi perintah SQL.
- **Penjelasan Source Code:** Memasukkan data produk dengan sanitasi otomatis tipe data sehingga aman dari karakter berbahaya.
- **Cara Menjalankan:** `java 256_JDBCPreparedStatement.java`
- **Hasil yang Diharapkan:** Informasi template query, pemetaan parameter 1 sampai 4, dan jumlah baris terpengaruh.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 256_JDBCPreparedStatement](output/256_JDBCPreparedStatement.png)

### 257. 257_JDBCResultSet.java
- **Tujuan:** Membaca dan menavigasi baris data hasil kueri SELECT menggunakan kursor `ResultSet`.
- **Konsep Utama:** Navigasi kursor maju dengan `rs.next()` dan pengambilan nilai kolom dengan `getString`, `getDouble`, dan `getInt`.
- **Penjelasan Source Code:** Menjalankan kueri data mahasiswa dan menampilkan hasilnya dalam bentuk tabel kolom terformat.
- **Cara Menjalankan:** `java 257_JDBCResultSet.java`
- **Hasil yang Diharapkan:** Tabel data mahasiswa dengan kolom NIM, Nama Mahasiswa, IPK, dan Semester.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 257_JDBCResultSet](output/257_JDBCResultSet.png)

### 258. 258_JDBCInsert.java
- **Tujuan:** Menyisipkan data baru dan mengambil Primary Key auto-increment yang di-generate oleh basis data.
- **Konsep Utama:** Konstanta `Statement.RETURN_GENERATED_KEYS` dan method `pstmt.getGeneratedKeys()`.
- **Penjelasan Source Code:** Memasukkan data barang baru dan mencetak ID Primary Key otomatis yang dihasilkan sistem database.
- **Cara Menjalankan:** `java 258_JDBCInsert.java`
- **Hasil yang Diharapkan:** Konfirmasi baris tersimpan dan nilai auto-generated ID (contoh: 501).
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 258_JDBCInsert](output/258_JDBCInsert.png)

### 259. 259_JDBCSelect.java
- **Tujuan:** Melakukan filter kueri terparameterisasi dengan klausa WHERE dan memformat hasil tabel konsol.
- **Konsep Utama:** Parameter filter WHERE pada `PreparedStatement` dan iterasi dinamis `ResultSet`.
- **Penjelasan Source Code:** Menyaring data karyawan pada departemen tertentu dengan batas minimum gaji bulanan.
- **Cara Menjalankan:** `java 259_JDBCSelect.java`
- **Hasil yang Diharapkan:** Daftar karyawan yang memenuhi kriteria lengkap dengan rincian jabatan dan nominal gaji.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 259_JDBCSelect](output/259_JDBCSelect.png)

### 260. 260_JDBCUpdate.java
- **Tujuan:** Memperbarui data yang ada di tabel menggunakan perintah SQL UPDATE secara aman.
- **Konsep Utama:** Klausa `WHERE` pada UPDATE dan pengecekan nilai kembali `executeUpdate()` untuk validasi record.
- **Penjelasan Source Code:** Memperbarui harga jual dan menambah stok produk berdasarkan ID produk target.
- **Cara Menjalankan:** `java 260_JDBCUpdate.java`
- **Hasil yang Diharapkan:** Laporan keberhasilan pembaruan data produk dan jumlah baris terpengaruh.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 260_JDBCUpdate](output/260_JDBCUpdate.png)

### 261. 261_JDBCDelete.java
- **Tujuan:** Menghapus baris record secara kondisional dari tabel basis data.
- **Konsep Utama:** Perintah SQL DELETE dengan filter spesifik untuk menghindari penghapusan data secara tidak sengaja.
- **Penjelasan Source Code:** Menghapus transaksi yang berstatus BATAL untuk pelanggan tertentu.
- **Cara Menjalankan:** `java 261_JDBCDelete.java`
- **Hasil yang Diharapkan:** Jumlah baris yang berhasil dihapus dari tabel transaksi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 261_JDBCDelete](output/261_JDBCDelete.png)

### 262. 262_JDBCTransactions.java
- **Tujuan:** Mengelola transaksi database atomik (*ACID*) menggunakan commit dan rollback manual.
- **Konsep Utama:** `conn.setAutoCommit(false)`, `conn.commit()`, dan `conn.rollback()` dalam blok exception handling.
- **Penjelasan Source Code:** Mensimulasikan transfer saldo rekening bank: debit pengirim dan kredit penerima dalam satu transaksi utuh.
- **Cara Menjalankan:** `java 262_JDBCTransactions.java`
- **Hasil yang Diharapkan:** Alur transaksi bertahap dan konfirmasi commit perubahan data secara permanen.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 262_JDBCTransactions](output/262_JDBCTransactions.png)

### 263. 263_JDBCBatchProcessing.java
- **Tujuan:** Meningkatkan efisiensi jaringan dengan mengelompokkan beberapa kueri SQL dalam satu batch.
- **Konsep Utama:** `pstmt.addBatch()`, `pstmt.executeBatch()`, dan `pstmt.clearBatch()`.
- **Penjelasan Source Code:** Menyiapkan empat data nomor resi pengiriman logistik dalam batch lokal sebelum dikirimkan bersamaan ke basis data.
- **Cara Menjalankan:** `java 263_JDBCBatchProcessing.java`
- **Hasil yang Diharapkan:** Status antrean batch per item, array status eksekusi `[1, 1, 1, 1]`, dan total data yang tereksekusi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 263_JDBCBatchProcessing](output/263_JDBCBatchProcessing.png)

### 264. 264_JDBCMetadata.java
- **Tujuan:** Melakukan introspeksi metadata database dan metadata skema hasil kueri.
- **Konsep Utama:** `DatabaseMetaData` (nama RDBMS, versi, kapabilitas transaksi) dan `ResultSetMetaData` (nama kolom, tipe SQL, nullability).
- **Penjelasan Source Code:** Menginspeksi informasi server database serta mencetak daftar kolom dan tipe data dari tabel produk.
- **Cara Menjalankan:** `java 264_JDBCMetadata.java`
- **Hasil yang Diharapkan:** Rincian metadata database dan tabel struktur kolom yang tercetak rapi.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 264_JDBCMetadata](output/264_JDBCMetadata.png)

### 265. 265_DAODesignPattern.java
- **Tujuan:** Menerapkan pola desain Data Access Object (DAO) untuk memisahkan domain model, antarmuka kontrak, dan implementasi persistensi.
- **Konsep Utama:** Entity class `Mahasiswa`, interface `MahasiswaDAO`, dan implementasi konkret `MahasiswaDAOImpl`.
- **Penjelasan Source Code:** Demonstrasi lengkap operasi CRUD (Create, Read, Update, Delete) yang dipanggil secara elegan melalui interface DAO.
- **Cara Menjalankan:** `java 265_DAODesignPattern.java`
- **Hasil yang Diharapkan:** Alur CRUD data mahasiswa ditampilkan secara berurutan di konsol.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 265_DAODesignPattern](output/265_DAODesignPattern.png)

### 266. 266_ConnectionPooling.java
- **Tujuan:** Memahami arsitektur Connection Pooling untuk mendaur ulang koneksi database tanpa beban overhead koneksi ulang TCP.
- **Konsep Utama:** Menggunakan `BlockingQueue` untuk antrean koneksi, peminjaman `pinjamKoneksi()` dengan batas timeout, dan pelepasan `kembalikanKoneksi()`.
- **Penjelasan Source Code:** Empat worker thread meminjam 3 slot koneksi yang tersedia secara bergantian dan aman secara multithreading.
- **Cara Menjalankan:** `java 266_ConnectionPooling.java`
- **Hasil yang Diharapkan:** Aktivitas antrean worker thread yang saling meminjam dan mengembalikan koneksi pool secara tertib.
- **Screenshot Hasil Eksekusi:** ![Hasil Eksekusi 266_ConnectionPooling](output/266_ConnectionPooling.png)

---

## Ringkasan Modul
Modul 16 memberikan pemahaman mendalam tentang interaksi aplikasi Java dengan sistem basis data relasional. Mulai dari konsep fundamental koneksi, pencegahan SQL Injection dengan PreparedStatement, pembacaan ResultSet terformat, transaksi ACID (Commit/Rollback), efisiensi Batch Processing, hingga pola arsitektur profesional seperti DAO dan Connection Pooling. Penguasaan JDBC ini menjadi fondasi krusial sebelum melanjutkan ke Modul 17: Testing, Build Tools, JVM, dan Keamanan.
