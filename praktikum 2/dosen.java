/*Nama File : dosen.java
/*Deskripsi : berisi atribut dan method dalam class dosen
/*Pembuat : Shafiyah
/*Tanggal : 2 Maret 2025
*/
public class Dosen {
    private String nip;
    private String nama;
    private String prodi;
    
    //konstruktor tanpa parameter
    public Dosen(){
        this.nip = " ";
        this.nama = " ";
        this.prodi = " ";
    }
    
    //konstruktor dengan parameter
    public Dosen (String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    //selector (getter)
    public String getnip(){
        return nip;
    }
    
    public String getnama(){
        return nama;
    }
    
    public String getprodi(){
        return prodi;
    }
    
    //mutator (setter)
    public void setnip(String nip){
        this.nip = nip;
    }
    public void setnama(String nama){
        this.nama = nama;   
    }
    public void setprodi(String prodi){
        this.prodi = prodi;
    }
}
