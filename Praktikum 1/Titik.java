/*Nama File : Titik.java
/*Deskripsi : berisi atribut dan method dalam class Titik
/*Pembuat : Shafiyah
/*Tanggal : 23 Februari 2025
*/

public class Titik {
    double absis;
    double ordinat;
    static int counterTitik = 0;
    
    Titik (double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    Titik (){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    static int getCounterTitik(){
        return counterTitik;
    }
    
    double getAbsis(){
        return absis;
    }
    
    double getOrdinat(){
        return ordinat;
    }
    
    void setAbsis(double x){
        absis = x;
    }
    
    void setOrdinat(double y){
        ordinat = y;
    }
    
    void geser (double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    double getKuadran(){
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat >= 0){
            return 2;
        } else if (absis < 0 && ordinat < 0){
            return 3;
        } else if (absis >= 0 && ordinat < 0){
            return 4;
        }
        return 0;
    }
    
    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }
    
    double getJarak(){
        double dx = this.absis - getAbsis();
        double dy = this.ordinat - getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    void printTitik(){
        System.out.println("Titik ( " + absis + "," + ordinat +")");
    }
    
    void Refleksix(){
        ordinat = ordinat*-1;
    }
    
    void refleksiY() {
        absis = absis * -1;
    }
    
    Titik getRefleksix(){
        return new Titik(getAbsis(), getOrdinat()*-1);
    }
    
    Titik getRefleksiY() {
        return new Titik(getAbsis() * -1, getOrdinat());
    }
    
    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
}
