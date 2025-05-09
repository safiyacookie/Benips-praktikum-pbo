/*Nama File : kendaraan.java
/*Deskripsi : berisi atribut dan method dalam class kendaraan
/*Pembuat : Shafiyah
/*Tanggal : 2 Maret 2025
*/
public class kendaraan{
    private String noplat;
    private String jenis;
    
    //konstruktor tanpa parameter
    public kendaraan(){
        this.noplat = " ";
        this.jenis = " ";
    }
    
    //konstruktor dengan parameter
    public kendaraan(String noplat, String jenis){
        this.noplat = noplat;
        this.jenis = jenis;
    }
    
    //selector(getter)
    public String getnoplat(){
        return noplat;
    }
    
    public String getjenis(){
        return jenis;
    }
    
    //mutator (setter)
    
    public void setnoplat(){
        this.noplat = noplat;
    }
    
    public void setjenis(){
        this.jenis = jenis;
    }
    
}
