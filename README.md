# 🚗 Sistem Manajemen Parkir Kendaraan 🚗

**Nama** : Nabila Fitriani 

**NIM**  : 2509116063  

**Kelas** : B  

---

## 📌 Deskripsi Singkat Program

Program ini adalah aplikasi berbasis **Java** yang digunakan untuk mengelola sistem parkir kendaraan pada berbagai tempat yang menyediakan area parkir, seperti **coffee shop, mall, kampus, perkantoran, maupun tempat usaha lainnya**.

Program ini membantu petugas dalam mengelola data kendaraan, data petugas, slot parkir, serta transaksi parkir kendaraan. Sistem menyediakan fitur **CRUD (Create, Read, Update, Delete)** sehingga data parkir dapat ditambahkan, dilihat, diperbarui, dihapus, dan dicari berdasarkan ID.
Selain itu, program dapat menghitung biaya parkir berdasarkan **jenis kendaraan dan lama parkir**, serta menampilkan **receipt pembayaran** setelah transaksi parkir selesai.

🔹 Fitur yang tersedia:
- Menambahkan data kendaraan, petugas, slot parkir, dan parkir kendaraan.
- Melihat seluruh data parkir yang tersedia.
- Memperbarui data parkir berdasarkan ID.
- Menghapus data parkir berdasarkan ID.
- Mencari data parkir berdasarkan ID.
- Menghitung biaya parkir berdasarkan jenis kendaraan dan lama parkir.
- Menampilkan _receipt_ pembayaran setelah transaksi parkir.
- Menerapkan Access Modifier, Encapsulation, dan validasi input.

---
## 📂 Struktur Program

Struktur program terdiri dari beberapa package dan class yang memiliki fungsi masing-masing dalam mengelola sistem parkir.

<img width="350" height="217" alt="image" src="https://github.com/user-attachments/assets/6edbcb00-839d-403c-b2a5-68a07bd10c45" />

---
## ⚙️ Penjelasan Alur Program

### 1. Menu Utama

<img width="381" height="377" alt="image" src="https://github.com/user-attachments/assets/837aa9b0-e020-4c15-aa6d-2e61cb883ccb" />

Program menampilkan menu utama yang berisi pilihan untuk menambah, melihat, memperbarui, menghapus, dan mencari data parkir. User dapat memilih menu dengan memasukkan nomor sesuai fitur yang ingin digunakan.

---
### 2. Tambah Kendaraan

<img width="267" height="128" alt="image" src="https://github.com/user-attachments/assets/d730713b-2494-4550-8ec0-31e95a3d07ec" />

User memasukkan data kendaraan berupa ID, nomor plat, jenis kendaraan, merk, dan warna. Setelah data valid, kendaraan akan disimpan ke dalam sistem.

---
### 3. Tambah Petugas

<img width="249" height="126" alt="image" src="https://github.com/user-attachments/assets/e251fbe0-e172-4095-9c29-bdca1889713c" />

User memasukkan data petugas seperti ID, nama, username, password, dan shift. Data petugas kemudian disimpan dan dapat digunakan untuk transaksi parkir.

---
### 4. Tambah Slot Parkir

<img width="227" height="95" alt="image" src="https://github.com/user-attachments/assets/c4f90a3b-8ee1-4bbb-8dde-6dd9ac10d7af" />

User memasukkan ID slot, nomor slot, dan jenis slot yaitu Motor atau Mobil. Setiap slot baru memiliki status Kosong dan dapat digunakan untuk kendaraan yang sesuai dengan jenis slot.

---
### 5. Tambah Data Parkir

<img width="238" height="127" alt="image" src="https://github.com/user-attachments/assets/44dadfb3-bc5b-4d1e-a82f-028cacd72332" />

User memasukkan ID parkir, ID kendaraan, ID petugas, ID slot, dan waktu masuk. Sistem akan melakukan pengecekan terlebih dahulu untuk memastikan data tersedia, slot masih kosong, dan jenis kendaraan sesuai dengan jenis slot. Jika semua sesuai, data parkir berhasil ditambahkan dan status slot berubah menjadi Terisi.

---
### 6. Lihat Data Parkir

<img width="293" height="399" alt="image" src="https://github.com/user-attachments/assets/6f6ac4db-b2ee-495b-b718-c6b131b33175" />

Sistem menampilkan seluruh data parkir yang telah tersimpan. Informasi yang ditampilkan meliputi kendaraan, petugas, slot, waktu masuk, waktu keluar, jumlah pembayaran, metode pembayaran, dan status pembayaran.

---
### 7. Update Data Parkir

<img width="290" height="462" alt="image" src="https://github.com/user-attachments/assets/135d2fda-0aa6-4971-91b1-7a3e79409f44" />

User memasukkan ID parkir yang ingin diperbarui, kemudian mengisi waktu keluar, lama parkir, dan metode pembayaran. Sistem akan menghitung biaya parkir berdasarkan jenis kendaraan dan lama parkir. Setelah pembayaran dilakukan, status parkir menjadi Selesai dan status pembayaran menjadi Lunas.

---
### 8. Hapus Data Parkir

<img width="228" height="62" alt="image" src="https://github.com/user-attachments/assets/feadf328-e9ec-4d97-8613-2f66a62cb43e" />

User memasukkan ID parkir yang ingin dihapus. Jika data ditemukan, sistem akan menghapus data tersebut dan mengubah status slot menjadi Kosong sehingga dapat digunakan kembali.

---
### 9. Cari Data Parkir

<img width="159" height="59" alt="image" src="https://github.com/user-attachments/assets/96566724-7998-4fa9-82d2-59722a796857" />

`Jika terdapat Id Parkir yang dicari`

<img width="300" height="378" alt="image" src="https://github.com/user-attachments/assets/878623f9-9d95-42f2-8c71-dd70714a8d9f" />

User dapat mencari data parkir berdasarkan ID. Jika data ditemukan, sistem akan menampilkan informasi parkir dalam bentuk receipt. Jika tidak ditemukan, sistem akan menampilkan pesan bahwa data tidak tersedia.

---
### 10. Keluar

<img width="519" height="138" alt="image" src="https://github.com/user-attachments/assets/0239ad88-e408-4af7-a4b5-3124d6fe4cfc" />

User memilih menu keluar untuk menghentikan program. Setelah itu sistem menampilkan pesan "Terima kasih!" dan program selesai.

---
## 🔹 Access Modifier

Penerapan Access Modifier pada program ini terdapat pada atribut-atribut di dalam class model seperti Kendaraan, Petugas, SlotParkir, dan Parkir.

Atribut dibuat menggunakan access modifier private, sehingga tidak dapat diakses secara langsung dari luar class.

Contohnya pada class Parkir terdapat atribut:
```js
private int idParkir;
private Kendaraan kendaraan;
private Petugas petugas;
private SlotParkir slot;
private String waktuMasuk;
private String waktuKeluar;
```

Dengan penggunaan private, akses terhadap atribut dapat dibatasi sehingga data di dalam object menjadi lebih terkontrol.

---
## 🔹 Encapsulation

Penerapan Encapsulation dilakukan dengan membungkus data atau atribut di dalam class dan menyediakan getter dan setter untuk mengakses atau mengubah data tersebut.

Pada class Parkir, getter digunakan untuk mengambil nilai atribut, sedangkan setter digunakan untuk mengubah nilai tertentu.

Contohnya:
```js
public int getIdParkir() {
    return idParkir;
}

public void setStatusPembayaran(String statusPembayaran) {
    this.statusPembayaran = statusPembayaran;
}
```

Dengan adanya encapsulation, atribut yang bersifat private tidak diakses secara langsung dari luar class, tetapi melalui method yang telah disediakan.

---
## 🔹 Validasi Input

Penerapan Validasi Input terdapat pada class Main.java.

Program memiliki beberapa method khusus untuk memastikan input yang diberikan user sesuai dengan ketentuan, yaitu:

```js
inputIntPositif() → memastikan input berupa angka dan lebih dari 0.
inputTidakKosong() → memastikan input tidak boleh kosong.
inputJenisKendaraan() → memastikan jenis kendaraan hanya Motor atau Mobil.
inputJenisSlot() → memastikan jenis slot hanya Motor atau Mobil.
inputMetodePembayaran() → memastikan metode pembayaran hanya Cash atau QRIS.
```

Dengan adanya validasi input, kesalahan saat memasukkan data dapat diminimalkan sehingga program lebih aman dan mudah digunakan
