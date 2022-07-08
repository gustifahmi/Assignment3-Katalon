# Assignment3-Katalon

### Langkah-Langkah
Langkah-langkah yang saya lakukan untuk melakukan mobile testing adalah sebagai berikut:
1. Mengunduh dan meng-install node.js versi terbaru (16.16.0).
2. Mengunduh dan meng-install appium melalui npm dengan memasukkan perintah npm install -g appium.
3. Mengunduh dan meng-install Oracle VM VirtualBox versi terbaru (6.1.34).
4. Mengunduh dan meng-install Genymotion versi terbaru (3.2.1).
5. Menambahkan device baru di Genymotion. Saya memilih Google Pixel 2 dengan OS Android 10, size 1080 x 1920, dan density 420.
6. Menyalakan device dengan klik tombol tiga titik (di paling kanan di baris device tersebut), lalu klik start.
7. Unduh apk yang ingin ditest yang disediakan kode.id
8. Record Mobile untuk merecord langkah-langkah tes yang ingin kita lakukan di mobile. Pilih application file dengan browse ke apk yang sudah kita download. Lalu untuk langkah yang kita lakukan bisa memilih di available actions. Namun, yang saya lakukan adalah langkah alternatif yaitu dengan melakukan spy object, yaitu menyimpan objek-objek dari apk ini, dan selanjutnya baru saya buat test case dengan menggunakan object-object yang sudah saya simpan tadi.

### Test Case
Tes yang dilakukan pada assignment isi antara lain:
1. Add To Cart
   Untuk semua test case, barang yang digunakan sama, yaitu Samsung Galaxy S10 - Black yang ada di halaman Recent.
   1) Invalid Input 0
      Input 0 di number of order
      Verify:
      - Verify Element Not Exist, Object: Text - Item 1 Name (artinya di dalam cart tidak ada barang tersebut)
   2) Invalid Input Greater Than Stock
      Input di number of order lebih dari stock (stock ada 5, yang saya masukkan sebagai input adalah 12)
      Verify:
      - Verify Element Not Exist, Object: Text - Item 1 Name (artinya di dalam cart tidak ada barang tersebut)
   3) Valid
      Input di number order lebih kecil dari jumlah stock (saya masukkan 1 saja)
      Verify:
      - Verify Element Exist, Object: Text - Item 1 Name (artinya di dalam cart tidak ada barang tersebut)

2. Category
   Membuka halaman Category dan terdapat 5 barang di setiap category, selanjutnya memeriksa 5 gambar tersebut ada, lalu menyocokkan nama dan harga dari masing-masing barang tersebut. Secara garis besar untuk semua test case, yang diverifikasi sama, namun untuk verify element text beda di inputnya, disesuaikan dengan nama dan harga masing-masing barang. Verifikasinya adalah sebagai berikut:
   Verify:
   - Verify Element Visible, Object: Image - Item 1
   - Verify Element Visible, Object: Image - Item 2
   - Verify Element Visible, Object: Image - Item 3
   - Verify Element Visible, Object: Image - Item 4
   - Verify Element Visible, Object: Image - Item 5
   - Verify Element Text, Object: Text - Item 1 Name
   - Verify Element Text, Object: Text - Item 1 Price
   - Verify Element Text, Object: Text - Item 2 Name
   - Verify Element Text, Object: Text - Item 2 Price
   - Verify Element Text, Object: Text - Item 3 Name
   - Verify Element Text, Object: Text - Item 3 Price
   - Verify Element Text, Object: Text - Item 4 Name
   - Verify Element Text, Object: Text - Item 4 Price  
   Selanjutnya Scroll To Text dengan Input sama dengan Text - Item 5 Name
   - Verify Element Text, Object: Text - Item 5 Name
   - Verify Element Text, Object: Text - Item 5 Price

   Category-nya adalah sebagai berikut:
   1) Baby Gear
   2) Electronics and Gadgets
   3) Fashions
   4) Health and Sports
   5) Home and Furniture
   6) Office and Industry

3. Edit Profile
   Terdapat 5 test case pada edit profile, yaitu:
   1) Empty Address
      Mengosongkan Address
      Verify:
      - Verify Element Visible, Object: Alert - Invalid Address Input
   2) Empty Email
      Mengosongkan Email
      Verify:
      - Verify Element Visible, Object: Alert - Invalid Email Input
   3) Empty Name
      Mengosongkan Name
      Verify:
      - Verify Element Visible, Object: Alert - Invalid Name Input
   4) Empty Phone Number
      Mengosongkan Phone Number
      Verify:
      - Verify Element Visible, Object: Alert - Invalid Phone Input
   5) Valid
      Mengubah semua isian dan memastikkan datanya tersimpan. Input-nya saya masukkan di variable adalah sebagai berikut:
      name: John Doe
      email: example@gmail.com
      phone_number: +6289911223344
      address: Jalan Sudirman

      Lalu verifikasinya adalah sebagai berikut
      Verify:
      - Verify Element Not Visible, Object: Alert - Invalid Name Input
      - Verify Element Not Visible, Object: Alert - Invalid Email Input
      - Verify Element Not Visible, Object: Alert - Invalid Phone Input
      - Verify Element Not Visible, Object: Alert - Invalid Address Input
      Lalu, back ke halaman sebelumnya untuk melihat data yang tersimpan
      - Verify Element Text, Object: Text - Name, Input: name
      - Verify Element Text, Object: Text - Email, Input: email
      - Verify Element Text, Object: Text - Phone Number, Input: phone_number
      - Verify Element Text, Object: Text - Address, Input: address