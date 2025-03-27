import java.util.ArrayList;
public class Maina {
    public static void main(String[] args) {
        ArrayList<Ruang> daftarRuang = new ArrayList<>();
        daftarRuang.add(new RuangKelas("KLS01", 10, 8, 4, 40, 35, 5));
        daftarRuang.add(new Laboratorium("LAB01", 12, 10, 5, 30, "Lab Komputer", 100000));
        daftarRuang.add(new RuangDepartemen("DEP01", 8, 6, 4, 10, 5, 5, 2, 7000));
        daftarRuang.add(new RuangDosen("DSN01", 5, 4, 3, 5, "Dr. Budi", 2, 1, 8000));
        
        for (Ruang r : daftarRuang) {
            r.tampilkanInfo();
        }
    }
}
