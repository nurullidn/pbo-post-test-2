# pbo-post-test-2
**Toko Furniture**

A. STUDI KASUS

program toko furniture adalah contoh penggunaan pemrograman Java untuk mengimplementasikan fungsi dasar dalam konteks bisnis toko furniture. Program ini dirancang untuk mengelola daftar barang, memungkinkan pengguna untuk menambahkan, melihat, menghapus, dan mengedit barang dalam daftar.

B. TUJUAN

Tujuan utama dari program ini adalah memungkinkan pemilik atau pegawai toko furniture untuk mengelola inventaris barang dengan cara yang mudah dan efisien.Program ini akan membantu pemilik atau pegawai toko furniture untuk menjalankan bisnis dengan lebih terstruktur, memantau inventaris barang, dan menghindari kesalahan dalam pengelolaan data barang.

C. FITUR
  1. Tambah Barang (Menu 1): Program memungkinkan pengguna untuk menambahkan barang ke dalam daftar. Pengguna diminta untuk memasukkan nama dan harga barang. setiap barang       diberikan kode unik secara otomatis karena atribut tersebut bersifat final (tidak dapat diubah). Hal ini memudahkan pemantauan stok barang.
  2. Tampilkan Data Barang (Menu 2): Program memungkinkan pengguna untuk melihat daftar semua barang yang tersedia di toko. Ini memberikan visibilitas terhadap barang-           barang yang ada.
  3. Hapus Barang (Menu 3): Pengguna dapat menghapus barang dari daftar dengan memasukkan nama barang yang ingin dihapus. Ini membantu dalam mengelola barang yang sudah          tidak tersedia lagi di toko.
  4. Edit Barang (Menu 4): Program memungkinkan pengguna untuk mengedit informasi barang, seperti mengubah nama atau harga barang. Ini berguna jika terdapat perubahan            informasi atau koreksi yang diperlukan.
  5. Keluar (Menu 5): Pengguna dapat mengakhiri program dengan memilih opsi ini.

D. PENJELASAN BAGIAN-BAGIAN SOURCE CODE
  1. Package dan import



     <img width="246" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/98888c54-f6be-45c8-b6d2-d3f89967ae24">




     a. Tampilan awal Program dimulai dengan mendefinisikan package dan mengimpor beberapa class yang akan digunakan dalam program.
     b. ArrayList digunakan untuk menyimpan daftar barang.
     c. Scanner digunakan untuk menerima input dari pengguna.
     d. Barang adalah class yang digunakan dalam program ini (entitas barang).

2. Class TokoFurniture















   <img width="199" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/c3f2cafb-8e60-459d-b13b-d3bf42809ea5">











   Ini adalah deklarasi class utama dalam program.
  
3. Property class








   <img width="212" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/821371cb-a528-4dba-88d5-ad32a70143d7">









    Properti kodeBarang digunakan untuk memberikan kode unik pada setiap barang yang ditambahkan ke daftar. Properti ini diinisialisasi dengan nilai awal 1.

4. perulangan/while





    <img width="114" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/ceeb5ba7-55d6-4402-b7b9-3ea6db73a57e">







    Program mengunakan loop while yang akan berjalan selama isRunning bernilai true. Ini memungkinkan program terus berjalan sampai pengguna memilih untuk keluar.

5. Switch


   <img width="105" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/81eb94c3-d253-41f6-8937-b1dafdb84336">



   Program menggunakan pernyataan switch untuk memproses pilihan pengguna. Setiap pilihan menu mengarah ke salah satu case dalam pernyataan switch.

6. konstruktor








   <img width="353" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/8e16ca2b-e894-43fc-890c-b48edd8ad8cd">











    Ini adalah konstruktor yang digunakan untuk membuat objek Barang dengan kodeBarang, nama, dan harga yang diinisialisasi pada saat objek dibuat.

7. Get


  <img width="202" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/b1b31481-3155-493e-bdd0-e13178b68b3e">



    Ini adalah metode getter yang mengembalikan nilai dari properti kodeBarang.




   <img width="165" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/9204597e-0956-4197-8615-d70a1b65cc5c">




     Ini adalah metode getter yang mengembalikan nilai dari properti nama.





   <img width="210" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/f6259a1d-9374-474e-b4e0-5f63557679c2">






      Ini adalah metode setter yang digunakan untuk mengubah nilai properti nama.
















   <img width="273" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/1552a8c3-d883-416d-936e-21190aec9136">

















      Ini adalah metode setter yang digunakan untuk mengubah nilai properti harga.

  8. Array

      <img width="315" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/d10f0076-82dc-4265-940a-2c6a538f4f21">

      Arraylist digunakan untuk menyimpan daftar barang.

E. ALUR PROGRAM
  1. tampilan awal program menampilkan menu pilihan yang dapat di pilih oleh pengguna. pengguna memiliki 5 pilihan yaitu, 1. tambah barang, 2. lihat data barang, 3. edit barang, 4. hapus barang dan 5. keluar. jika pengguna memilih 1, maka pengguna memilih untuk menambahkan barang, pengguna diminta untuk memasukkan nama barang dan harga barang.

     <img width="179" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/aeb63d92-13a3-48b3-8f5d-43513220b4f1">





  2. jika pengguna memilih 2, maka tampilan data barang yang tadi kita inputkan akan ditampilkan

     <img width="178" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/0b1b0d0d-1829-4751-9658-c3373c96eda5">




  3. jika pengguna memilih 4, maka pengguna memilih untuk menghapus data barang, pengguna diminta untuk memasukkan nama barang yang ingin di hapus.

     <img width="285" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/d5043279-c795-4a73-903f-e8ba92a9b260">



  4. jika pengguna memilih 3, maka pengguna memilih untuk mengupdate data barang seperti nama atau harga barang, pengguna akan diminta untuk memasukkan nama barang yang ingin diubah, lalu pengguna diminta memasukkan nama baru barang dan harga terbaru barang.

     <img width="275" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/cdeb7f3d-9c03-445a-baf3-f05885c3c8c2">



  5. jika pengguna memilih 5, maka pengguna memilih untuk keluar dan program akan berhenti.

      <img width="444" alt="image" src="https://github.com/nurullidn/pbo-post-test-2/assets/127465143/157599ea-36f9-4881-b2f5-6aacffeac869">


F. KESIMPULAN
    
Studi kasus ini adalah contoh bagaimana pemrograman Java dapat digunakan dalam konteks bisnis untuk mengelola inventaris barang dalam toko furniture. Ini adalah langkah pertama dalam membangun aplikasi yang lebih canggih untuk bisnis sejenis.

      




   

   


   



  


   

    

  

   
 
   



