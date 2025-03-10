/*
File : Asersi2.java
Deskripsi : Program untuk demo asersi, yang akan menolak input jari jari lingkaran yang bernilai nol
Pembuat : Shafiyah
Tanggal : 10 Maret 2025
*/

class Lingkaran {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        
        assert (jariJari > 0) : "jari-jari tidak boleh nol!!!";
        
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
1. Konstruktor Lingkaran tidak melakukan validasi, sehingga objek 
    tetap dibuat meskipun jariJari = 0.
2. jariJari ditetapkan secara hardcoded (jariJari = 0), membuat 
    program tidak fleksibel.
*/
