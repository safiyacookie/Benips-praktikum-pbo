/*
 * =============================================================
 * 2. MANFAAT POLIMORFISME PADA KASUS INI
 * -------------------------------------------------------------
 * • Koleksi Seragam →  ArrayList<Pegawai> dapat menampung semua
 *   objek turunan Pegawai (Programmer, Manajer, dst.) tanpa perlu
 *   koleksi terpisah.
 *
 * • Dynamic Dispatch  →  Saat emp.tampilData() dipanggil, JVM
 *   otomatis memilih versi method milik subclass (bonus/tunjangan)
 *   sehingga kita cukup satu baris kode.
 *
 * • Mudah Diperluas   →  Menambah subclass baru (mis. Designer)
 *   tidak mengubah kode di main; cukup extends Pegawai dan tambahkan
 *   ke list.
 *
 * • Kode Lebih Rapi   →  Tidak ada if‑else/switch instanceof untuk
 *   memeriksa tipe objek, sehingga lebih pendek, jelas, dan minim
 *   bug.
 *
 * =============================================================
 * 3. MASALAH JIKA MENAMBAH pegawai4 & pegawai5 TANPA POLIMORFISME
 * -------------------------------------------------------------
 * • Duplikasi Variabel
 *   ────────────────
 *   Kita harus membuat variabel terpisah per tipe:
 *     Programmer p1, p4;  Manajer m1, m2, m5; ...
 *   Kode cepat menjadi panjang & sulit dibaca.
 *
 * • Koleksi Tidak Seragam
 *   ─────────────────────
 *   ArrayList<Programmer> tidak dapat menampung Manajer, sehingga
 *   perlu beberapa list atau pengolahan manual.
 *
 * • Loop Rumit
 *   ──────────
 *   Tanpa list seragam, kita harus memanggil tampilData() satu‑satu
 *   atau menggunakan if (obj instanceof ...), menambah kompleksitas
 *   dan risiko kesalahan ketika tipe baru ditambah.
 *
 * • Sulit Dikembangkan
 *   ──────────────────
 *   Ketika kelas baru dibuat, semua bagian program yang mem‑handle
 *   list/instanceof harus diubah → melanggar prinsip Open‑Closed.
 *
 * Dengan polimorfisme, cukup:
 *     ArrayList<Pegawai> emps = new ArrayList<>();
 *     emps.add(new Programmer("Sari"));   // pegawai4
 *     emps.add(new Manajer("Budi"));      // pegawai5
 *   tanpa menyentuh logika loop maupun struktur data lainnya.
 * =============================================================
 */
