/*
File : Tendik.java
Deskripsi : Program yang berisi class Tendik
Pembuat : Shafiyah
Tanggal : 16 Maret 2025
*/

public class Tendik extends Pegawai {
    private String Bidang;
    private final int BUP = 55;

    public Tendik(String NIP, String Nama, Date TglLahir, Date TMT, double GajiPokok, String Bidang) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok);
        this.Bidang = Bidang;
    }

    public double getTunjangan() {
        return GajiPokok * 0.15;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + Bidang);
        System.out.println("BUP: " + BUP);
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
