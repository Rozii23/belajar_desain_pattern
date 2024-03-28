# Analisa Duck

---
* Menerapkan Strategy Pattern memungkinkan kita untuk memisahkan perilaku bersuara dan terbang menjadi objek terpisah.
* Pada Interface QuackBehavior untuk mendefinisikan method quack yang menentukan suara bebek. 
* Kemudian pada Interface FlyBehavior untuk mendefinisikan method fly yang akan menentukan kemampuan terbang bebek.
* Kelas abstrak Duck yang menjadi dasar untuk semua bebek. Ia memiliki referensi ke objek QuackBehavior dan FlyBehavior, didalanya terdapat method untuk berenang, method untuk menjalankan perilaku, serta method untuk mengubah perilaku bebek.