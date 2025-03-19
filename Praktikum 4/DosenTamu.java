/*
File : DosenTamu.java
Deskripsi : Program yang berisi class Dosen tamu
Pembuat : Shafiyah
Tanggal : 19 Maret 2025
*/
import java.util.Date;

public class DosenTamu extends Dosen {
    private String NIDK;
    private Date TglAkhirKontrak;

    public DosenTamu(String NIP, String Nama, Date TglLahir, Date TMT, double GajiPokok, String Fakultas, String NIDK, Date TglAkhirKontrak) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.TglAkhirKontrak = TglAkhirKontrak;
    }

    public double getTunjangan() {
        return GajiPokok * 0.1;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Tgl Akhir Kontrak: " + TglAkhirKontrak);
        System.out.println("Tunjangan: " + getTunjangan());
    }
}

