package praktikum7;
import java.util.*;

interface mahasiswa {
}

public class MahasiswaMap {
    public static void main(String[] args){
        Map<String, String> MahasiswaMap = new HashMap<String, String>();
        MahasiswaMap.put("24060123130071", "Adi");
        MahasiswaMap.put("24060123130072", "Bambang");
        MahasiswaMap.put("24060123130073", "Cici");
        MahasiswaMap.put("24060123130074", "Didi");
        
        MahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
        
    }
}
