/*
File : Main.java
Deskripsi : Program yang mengimplementasi class Tendik, dosentamu, dosentetap, dosen, dan pegawai
Pembuat : Shafiyah
Tanggal : 16 Maret 2025
*/
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap("12345", "Dr. Andi", new Date(80, 5, 10), new Date(110, 7, 15), 8000000, "Teknik", "101010");
        System.out.println("=== Dosen Tetap ===");
        dosenTetap.printInfo();
        System.out.println();

        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu("67890", "Dr. Budi", new Date(85, 3, 20), new Date(115, 9, 1), 6000000, "Ekonomi", "202020", new Date(125, 11, 31));
        System.out.println("=== Dosen Tamu ===");
        dosenTamu.printInfo();
        System.out.println();

        // Membuat objek Tendik
        Tendik tendik = new Tendik("11223", "Siti", new Date(90, 7, 25), new Date(120, 4, 10), 5000000, "Administrasi");
        System.out.println("=== Tendik ===");
        tendik.printInfo();
    }
}
