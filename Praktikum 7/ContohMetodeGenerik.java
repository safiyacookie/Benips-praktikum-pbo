public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> datum) {
        datum.getIsi().gerak();
        datum.getIsi().bersuara();
    }
}
