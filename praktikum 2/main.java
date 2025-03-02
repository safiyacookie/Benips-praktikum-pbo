public class main{
    public static void main (String[] args){
        Dosen D1 = new Dosen ("123", "Andi", "Informatika");
        mahasiswa M1 = new mahasiswa("1234","citra", "informatika");
    
        System.out.println("nip dosen = " + D1.getnip());
        System.out.println("jumlah mata kuliah = " + M1.getjmlsks());
    }
}
