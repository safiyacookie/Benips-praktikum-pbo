/*
File : AngkaSial.java
Deskripsi : Program penggunaan exception buatan sendiri
            pengenalan klausa 'throw' dan 'throws'
*/
public class AngkaSial {
  
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException(); // Melempar exception jika angka 13
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();

        try {
            as.cobaAngka(10);
            as.cobaAngka(13); // Ini akan melempar exception
            as.cobaAngka(12); // Tidak akan dieksekusi
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage()); // Menampilkan pesan exception
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}

/*
1. Apakah baris 12 dieksekusi?
    *Jika angka == 13, maka eksepsi AngkaSialException akan dilempar (throw new AngkaSialException(); pada baris 10).
    *Begitu eksepsi dilempar, eksekusi langsung keluar dari metode cobaAngka(int angka), sehingga baris 12 tidak akan dijalankan.
    *Jika angka bukan 13, baris 12 akan dieksekusi seperti biasa.

2. Apakah baris 21 dieksekusi?
    * Dalam blok try, program akan mencoba mengeksekusi as.cobaAngka(10), as.cobaAngka(13), dan as.cobaAngka(12).
    * Ketika as.cobaAngka(13) melempar eksepsi, eksekusi langsung pindah ke blok catch (baris 22).
    * Semua kode setelah baris yang menyebabkan eksepsi di dalam blok try (termasuk baris 21) tidak akan dijalankan.
*/
