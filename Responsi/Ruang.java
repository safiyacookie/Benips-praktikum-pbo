abstract class Ruang {
    private String kode;
    private double panjang, lebar, tinggi;
    private int kapasitas;
    
    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }
    
    public double hitungBiayaKebersihan(double tarif) {
        return panjang * lebar * tarif;
    }
    
    public String getKode() {
        return kode;
    }
    
    public abstract void tampilkanInfo();
}
