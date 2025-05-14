public class Main {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Kitty"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Doggy"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Tweety"));

        System.out.println("=== Perilaku Kucing ===");
        ContohMetodeGenerik.tampilkanPerilaku(datumKucing);

        System.out.println("\n=== Perilaku Anjing ===");
        ContohMetodeGenerik.tampilkanPerilaku(datumAnjing);

        System.out.println("\n=== Perilaku Burung ===");
        ContohMetodeGenerik.tampilkanPerilaku(datumBurung);
    }
}
