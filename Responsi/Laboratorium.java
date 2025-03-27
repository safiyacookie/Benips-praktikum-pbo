class Laboratorium extends Ruang {
    private String namaLab;
    private double hargaSewa;
    private static final double TARIF_FAKULTAS = 5000;
    
    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Laboratorium " + namaLab + " - Kode: " + getKode() + ", Biaya Kebersihan: " + hitungBiayaKebersihan(TARIF_FAKULTAS));
    }
}
