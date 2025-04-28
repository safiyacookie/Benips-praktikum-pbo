import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Anabul anabul1 = new Kucing("Pus");
        Anabul anabul2 = new Anjing("Doggy");
        Burung anabul3 = new Burung("Birdy");
        Kucing anabul4 = new Kucing("Pus2");

        ArrayList<Anabul> bul = new ArrayList<>();
        bul.add(anabul1);
        bul.add(anabul2);
        bul.add(anabul3);
        bul.add(anabul4);

        for(Anabul bulbul : bul){
            bulbul.tampilData();
            bulbul.Gerak();
            bulbul.Bersuara();
            System.out.println("\n");
        }
    }
}
