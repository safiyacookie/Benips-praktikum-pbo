/*Nama File : MTitik.java
/*Deskripsi : berisi atribut dan method dalam class Titik
/*Pembuat : Shafiyah
/*Tanggal : 23 Februari 2025
*/

public class MTitik{
    public static void main (String[] args){
        Titik T1 = new Titik();
        Titik T2 = new Titik(3,5);
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        
        
        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek Titik = " + T2.getCounterTitik());
        System.out.println("Kuadran Titik = " + T2.getKuadran());
        System.out.println("Refleksi X = " + T2.getRefleksix());
        Titik T3 = T2.getRefleksix();
        T3.printTitik();
        
        System.out.println("Jarak antara T2 dan (0,0) = " + T2.getJarak());
        T2.refleksiY();
        T2.printTitik();
        Titik T4 = T2.getRefleksiY();
        T4.printTitik();
        
    }
}
