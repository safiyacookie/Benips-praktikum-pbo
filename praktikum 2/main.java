/*Nama File : main.java
/*Deskripsi : berisi implementasi atribut dan method 
/*Pembuat : Shafiyah
/*Tanggal : 2 Maret 2025
*/
public class main{
    public static void main (String[] args){
        Dosen D1 = new Dosen ("123", "Andi", "Informatika");
        mahasiswa M1 = new mahasiswa("1234","citra", "informatika");
        matkul mk1 = new matkul("PAIK601", "PBO", 3);
        kendaraan k1 = new kendaraan("S 123 FY", "mobil");
        M1.addmatkul(new matkul("MK001", "Pemrograman Berorientasi Objek", 3));
        M1.addmatkul(new matkul("MK002", "Struktur Data", 4));
    
        System.out.println("nip dosen = " + D1.getnip());
        System.out.println("nama dosen = " + D1.getnama());
        System.out.println("prodi dosen = " + D1.getprodi());
        System.out.println("id matkul = " + mk1.getidmatkul());
        System.out.println("nama matkul = " + mk1.getnama());
        System.out.println("sks matkul = " + mk1.getsks());
        System.out.println("noplat kendaraan= " + k1.getnoplat());
        System.out.println("jenis kendaraan = " + k1.getjenis());
        System.out.println("jumlah sks mata kuliah = " + M1.getjmlsks());
        System.out.println("jumlah mata kuliah = " + M1.getjumlahmatkul());
        M1.printmhs();
        M1.printdetailmhs();
    }
}
