class RuangDepartemen extends Ruang {
    private int jumlahMeja, jumlahKursi, jumlahLemari;
    private double tarifDepartemen;
    
    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahMeja, int jumlahKursi, int jumlahLemari, double tarifDepartemen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.tarifDepartemen = tarifDepartemen;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Ruang Departemen - Kode: " + getKode() + ", Biaya Kebersihan: " + hitungBiayaKebersihan(tarifDepartemen));
    }
}
