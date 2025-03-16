/*
File : Persegi.java
Deskripsi : Program yang berisi class Persegi
Pembuat : Shafiyah
Tanggal : 16 Maret 2025
*/
public class Persegi extends BangunDate {
    private double sisi;
    
    public Persegi(){
        setJmlSisi(4);
    }
    
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }
    
    public double getSisi(){
        return sisi;
    }
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    public double getLuas(){
        return sisi * sisi;
    }
    
    public double getKeliling(){
        return sisi * 4;
    }
    
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }
    
    @Override
    public void printInfo(){
        System.out.println("Warna Bangun Datar : " + getWarna());
        System.out.println("Border Bangun Datar : "+getBorder());
        System.out.println("Jumlah Sisi Bangun Datar : "+getJmlSisi());
        System.out.println("sisi : " + sisi);
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("sisi : " + sisi);
    }
}
