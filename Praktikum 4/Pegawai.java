/*
File : Pegawai.java
Deskripsi : Program yang berisi class Pegawai
Pembuat : Shafiyah
Tanggal : 16 Maret 2025
*/

import java.util.Date;

public class Pegawai {
    protected String NIP;
    protected String Nama;
    protected Date TglLahir;
    protected Date TMT;
    protected double GajiPokok;

    public Pegawai(String NIP, String Nama, Date TglLahir, Date TMT, double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TglLahir = TglLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    public int getMasaKerja() {
        Date now = new Date();
        return now.getYear() - TMT.getYear();
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + Nama);
        System.out.println("Tanggal Lahir: " + TglLahir);
        System.out.println("TMT: " + TMT);
        System.out.println("Gaji Pokok: " + GajiPokok);
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
    }
}

