/*
File : mailBD.java
Deskripsi : Program yang berisi implementasi class BangunDatar, persegi, dan lingkaran
Pembuat : Shafiyah
Tanggal : 16 Maret 2025
*/

public class mainBD{
    public static void main(String[] args){
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5, "Biru", "Tebal");
        System.out.println("===== PERSEGI =====");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(10, "Merah", "Tipis");
        System.out.println("===== LINGKARAN =====");
        lingkaran.printInfo();
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
        System.out.println();

        // Menampilkan jumlah objek BangunDatar yang telah dibuat
        BangunDatar.printCounterBangunDatar();
    }
}

/*
1. Menambahkan final pada kelas BangunDatar
-> Maka kelas Persegi dan Lingkaran yang sebelumnya merupakan subclass dari BangunDatar akan mengalami error, karena kelas final tidak dapat diwarisi (inherited).
2. Menambahkan final pada method printInfo() dalam BangunDatar
-> Method printInfo() di kelas Persegi dan Lingkaran akan error jika mencoba override.
-> final pada method berarti method tidak bisa diubah (di-override) oleh subclass.
*/
