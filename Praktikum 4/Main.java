/*
File : Main.java
Deskripsi : Program yang mengimplementasi class Tendik, dosentamu, dosentetap, dosen, dan pegawai
Pembuat : Shafiyah
Tanggal : 16 Maret 2025
*/
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Pegawai
        Pegawai pegawai1 = new Pegawai("12345", "Budi Santoso", new Date(85, 5, 20), new Date(110, 1, 1), 5000000);
        pegawai1.printInfo();
        System.out.println();

        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("67890", "Ani Susanti", new Date(80, 10, 15), new Date(105, 3, 1), 7000000, "Teknik");
        dosen1.printInfo();
        System.out.println();

        // Membuat objek DosenTetap
        DosenTetap dosenTetap1 = new DosenTetap("11223", "Siti Rahma", new Date(78, 2, 25), new Date(100, 6, 15), 8000000, "Ekonomi", "123456789");
        dosenTetap1.printInfo();
        System.out.println();

        // Membuat objek DosenTamu
        DosenTamu dosenTamu1 = new DosenTamu("44556", "Joko Widodo", new Date(82, 8, 30), new Date(108, 11, 1), 6000000, "Sastra", "987654321", new Date(125, 5, 30));
        dosenTamu1.printInfo();
        System.out.println();

        // Membuat objek Tendik
        Tendik tendik1 = new Tendik("77889", "Dewi Lestari", new Date(90, 3, 10), new Date(115, 7, 1), 4500000, "Administrasi");
        tendik1.printInfo();
    }
}

}




