class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahKursi, jumlahMeja;
    private double tarifDepartemen;
    
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jumlahKursi, int jumlahMeja, double tarifDepartemen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        this.tarifDepartemen = tarifDepartemen;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Ruang Dosen " + namaDosen + " - Kode: " + getKode() + ", Biaya Kebersihan: " + hitungBiayaKebersihan(tarifDepartemen));
    }
}
