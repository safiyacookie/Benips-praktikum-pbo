/*
File : Dosen.java
Deskripsi : Program yang berisi class Dosen
Pembuat : Shafiyah
Tanggal : 16 Maret 2025
*/
import java.util.Date;
public class Dosen extends Pegawai {
    protected String Fakultas;

    public Dosen(String NIP, String Nama, Date TglLahir, Date TMT, double GajiPokok, String Fakultas) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + Fakultas);
    }
}
