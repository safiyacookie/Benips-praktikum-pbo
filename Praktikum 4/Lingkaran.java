/*
File : Lingkaran.java
Deskripsi : Program yang berisi class Lingkaran
Pembuat : Shafiyah
Tanggal : 16 Maret 2025
*/
public class Lingkaran extends BangunDatar{
    private double jari;
    
    public Lingkaran(){
        
    }
    
    public Lingkaran(double diameter, String warna, String border){
        super (7, "merah", "tipis")
        this.jari = diameter/2;
    }
    
    public double getJari(){
        return jari;
    }
    
    public void setJari(double jari){
        this.jari = jari;
    }
    
    public double getLuas(){
        return Math.PI *jari*jari;
    }
    
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }
    
    public void printInfo(){
        System.out.println("Jari : " + jari;
        System.out.println("Jumlah Luas : " + getLuas());
        System.out.println("Jumlah keliling : " + getKeliling());
        System.out.println("Jumlah sisi : " + jmlSisi);
    }
    
}
