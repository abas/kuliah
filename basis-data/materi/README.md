Studi Kasus Tahapan Cara Membuat ERD
Berikut ini adalah contoh tahapan dalam membuat ERD pada Sistem Informasi Akademik.
Tahap 1: Penentuan Entities
 
Tahap 2 : Penentuan Atribut
Mahasiswa:
•	nim: nomor induk mahasiswa (integer) PK
•	nama_mhs: nama lengkap mahasiswa (string)
•	alamat_mhs: alamat lengkap mahasiswa (string)
Dosen:
•	nip: nomor induk pegawai (integer) PK
•	nama_dosen: nama lengkap dosen (string)
•	alamat_dosen: alamat lengkap dosen (string)
Mata_kuliah:
•	kode_mk: kode untuk mata kuliah (integer) PK
•	nama_mk: nama lengkap mata kuliah (string)
•	deskripsi_mk: deskripsi singkat mengenai mata kuliah (string)
Ruang:
•	kode_ruang: kode untuk ruang kelas (string) PK
•	lokasi_ruang: deskripsi singkat mengenai lokasi ruang kelas (string)
•	kapasitas_ruang: banyaknya mahasiswa yang dapat ditampung (integer)
 
Tahap 3 : Penentuan Kardinalitas Relasi
 
Hubungan :
a.  ruang digunakan untuk mata_kuliah:
•	Tabel utama: ruang
•	Tabel kedua: mata_kuliah
•	Relationship: One-to-one (1:1)
•	Attribute penghubung: kode_ruang (FK kode_ruang di mata_kuliah)
b.  dosen mengajar mata_kuliah:
•	Tabel utama: dosen
•	Tabel kedua: mata_kuliah
•	Relationship: One-to-many (1:n)
•	Attribute penghubung: nip (FK nip di mata_kuliah)
c.  dosen membimbing mahasiswa:
•	Tabel utama: dosen
•	Tabel kedua: mahasiswa
•	Relationship: One-to-many (1:n)
•	Attribute penghubung: nip (FK nip di mahasiswa)
d.  mahasiswa mengambil mata_kuliah:
•	Tabel utama: mahasiswa, mata_kuliah
•	Tabel kedua: mhs_ambil_mk
•	Relationship: Many-to-many (m:n)
•	Attribute penghubung: nim, kode_mk (FK nim, kode_mk di mhs_ambil_mk)
Tahap 4 : Pembuatan ERD
 
Untuk lebih jelasnya teman-teman bisa mencari informasi yang lebih detail dengan mempelajari buku-buku tentang Perancangan Basis Data, berikut ada beberapa referensi buku yang dapat dijadikan acuan dalam mempelajari Perencangan Basis Data.

