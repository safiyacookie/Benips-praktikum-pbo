/*
File : DosenTetap.java
Deskripsi : Program yang berisi class Dosen tetap
Pembuat : Shafiyah
Tanggal : 19 Maret 2025
*/

import java.util.Date;

public class DosenTetap extends Dosen {
    private String NIDN;
    private final int BUP = 65;

    public DosenTetap(String NIP, String Nama, Date TglLahir, Date TMT, double GajiPokok, String Fakultas, String NIDN) {
        super(NIP, Nama, TglLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public double getTunjangan() {
        return GajiPokok * 0.2;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("BUP: " + BUP);
        System.out.println("Tunjangan: " + getTunjangan());
    }
}
