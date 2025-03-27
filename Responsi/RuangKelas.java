class RuangKelas extends Ruang {
    private int jumlahKursi, kursiRusak;
    private static final double TARIF_FAKULTAS = 5000;
    
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahKursi, int kursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursi = jumlahKursi;
        this.kursiRusak = kursiRusak;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Ruang Kelas - Kode: " + getKode() + ", Biaya Kebersihan: " + hitungBiayaKebersihan(TARIF_FAKULTAS));
    }
}
