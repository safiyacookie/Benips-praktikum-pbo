/*
File : ExceptionOnArray.java
Deskripsi : Program penggunaan eksepsi menggunakan class library java
Pembuat : Shafiyah
Tanggal : 10 Maret 2025
*/
public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[3] = 10; // Indeks diperbaiki dari 4 ke 3
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
