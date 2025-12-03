# PERTANYAAN 
## PERCOBAAN 1
1. Apakah fungsi tanpa parameter selalu harus bertipe void?
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu tanpa menggunakan fungsi!
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua perintah penampilan menu langsung di dalam fungsi main.
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main (mulai dari program dijalankan sampai daftar menu tampil di layar).
### Jawaban:
1. Tidak harus bertipe void, asalkan fungsi tersebut mengembalikan nilai.
2. Tidak bisa, karena harus memanggil fungsi Menu() di fungsi main. Mohon maaf bu baru modifikasi pada percobaan 3.
3. Fungsi memiliki kelebihan diantarannya adalah untuk mengurangi duplikasi kode serta mempermudah pemeliharaan program, hal ini cukup efektif karena hanya perlu untuk memanggil fungsi yang sudah ada.
4. Alur program :
- Program menjalankan fungsi main.
- Di dalam fungsi terdapat perintah Menu();.
- Program menjalankan fungsi Menu().
- print di dalam Menu() dieksekusi berurutan.

## PERCOBAAN 2
1. Apakah kegunaan parameter di dalam fungsi?
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter namaPelanggan dan isMember?
3. Apakah parameter sama dengan variabel? Jelaskan.
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa perbedaan output ketika isMember bernilai true dan ketika false?
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter namaPelanggan dan isMember?
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String). Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris perintah pemanggilan fungsi menu yang benar.
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter? Jelaskan alasan Anda.
### Jawaban:
1. Parameter di dalam fungsi berfungsi untuk memanggil nilai dari luar fungsi ke dalam fungsi.
2. Apabila tidak menggunakan parameter, String NamaPelanggan dan isMember harus ditulis manual dalam fungsi
3. Berbeda, parameter adalah variabel khusus yang digunakan untuk menerima nilai diluar fungsi. Sedangkan variabel digunakan di dalam sintaks biasa.
4. Parameter digunakan untuk mengetahui apakah pelanggan adalah member atau bukan. Jika isMember == true, kondisi if akan dijalankan.
5. Akan terjadi error pada program, karena fungsi Menu() harus mengembalikan nilai kepada fungsi main.
6. Sudah saya modifikasi.
7. Sudah saya modifikasi.
8. Iya, bisa digunakan tanpa mengubah isi fungsi dan apabila ingin menambah parameter lain lebih mudah.

## PERCOBAAN 3
1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh dari program kafe pada Percobaan 3 untuk masing-masing kasus.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing parameter dalam konteks program kafe.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3 sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis menu)? 

### Jawaban: 
1. 
- fungsi membutuhkan return value ketika fungsi tersebut dipakai kembali di main. contohnya pada fungsi hitungTotalHarrga mengembalikan nilai hargaTotal.
- fungsi tidak mengembalikan nilai ketika fungsi hanya menampilkan sesuatu dan tidak menghasilkan sebuah nilai. Contohnya pada fungsi Menu hanya menampilkan tampilan Menu.
2. tipe data yang dikembalikan adalah int karena fungsi mengembalikan nilai totalHarga. 
Fungsi pada parameter:
- int pilihanMenu: digunakan untuk mengambil harga di array hargaItems.
- int banyakItem: digunakan untuk menghitung totalHarga
3. Sudah saya modifikasi.
4. Sudahh saya modifikasi.

## PERCOBAAN 4
1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...namaPengunjung!
2. Modifikasi method daftarPengunjung menggunakan for-each loop.
3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen. Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan? Jika tetap berjalan, bagaimana output yang dihasilkan?
### Jawaban: 
1. Karena parameter namaPengunjung memiliki array indeks yang tidak tentu, sehingga jumlah indeksnya tergantung pada fungsi main.
2. Sudah saya modifikasi.
3. Tidak bisa, karena hanya boleh satu varargs. Contoh:
static void contoh(int angka, String...nama)
4. Program tidak error tetapi tidak ada nama yang ditampilkan. Output yang dihasilkan adalah "Daftar Nama Pengunjung: "

## PERCOBAAN 5
1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program dijalankan hingga menampilkan luas persegi panjang dan volume balok!
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur jalannya program sampai output tersebut muncul.
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program tersebut!
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak? Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak? Jelaskan!
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume di Percobaan 5.
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main, hitungLuas, dan hitungVolume.
### Jawaban:
1. - Program menjalankan fungsi main(). Di fungsi main program meminta inputan panjang, lebar dan tinggi. 
- Program memanggil fungsi hitungLuas(p,l). Fungsi hitungLuaas menerima nilai pjg = p, dan lb = l.
- Program menghitung luas = pjg*lb menggunakan nilai tersebut.
- Fungsi hitungLuas mengembalikan nilai luas.
- Program memanggil fungsi hitungVolume(t, p, l). Fungsi hitungVolume memanggil hitungLuas(a, b) untuk mendapatkan nilai luas alas.
- Nilai luas alas dikalikan dengan tinggi sehingga menghaasilkan volume.
- Fungsi hitungVolume mengembalikan volume.
2. panjang =4, lebar =3, tinggi = 5. 
Alur program :
- Menghitung luas menggunakan fungsi hitungLuas(4,3) 
Luas = 4 x 3 = 12
- Setelah itu menghitung volume menggunakan fungsi hitungVolume (5,4,3) 
Volume = 12 x 5 = 60 
- maka diperoleh luas balok tersebut 12 dan volume balok 60.
3. Output = 1234567
alur program:
- program main() memanggil fungsi Jumlah(1,1) dan menjumlahkan angka tersebut sehingga temp=2
- memanggil fungsi TampilJumlah(temp, 5); 
- didalam TampilJumlah memanggil TampilHilangkan(7)
- TampilHilangkan mencetak angka 1 sampai 7.
4. Fungsi memakai parameter ketika fungsi membutuhkan data dari luar untuk diproses. Fungsi harus memiliki nilai kembalian ketika fungsi menghasilkan sebuah nilai yang akan digunakan di luar fungsi tersebut.
5. Pada fungsi hitungLuas(pjg, lb) dan hitungVolume(tinggi, a, b) harus memiliki parameter karena fungsi tersebut membutuhkan b=nilai dari tinggi, panjang, dan lebar. Fungsi diperbolehkan tidak menggunakan parameter ketika sebuah fungsi tersebut sudah memiliki nilai sehingga tidak membutuhkan data dari luar.
6. Fungsi hitungLuas dan hitungVolume memiliki return karena masing-masing dari fungsi tersebut akan mengembalikan nilai ke fungsi main. sedagkan fungsi main tidak mengembalikan nilai karena tugasnya hanya menjalankanalur program.