/*Nama File : MGaris.java
/*Deskripsi : berisi atribut dan method dalam class Garis
/*Pembuat : Shafiyah
/*Tanggal : 23 Februari 2025
*/

public class MGaris {
    public static void main(String[] args) {
        Titik titik1 = new Titik(-2, 0);
        Titik titik2 = new Titik(0, 4);
        Garis garis1 = new Garis(titik1, titik2);

        garis1.printGaris();
        System.out.println("Panjang garis: " + garis1.getPanjang());
        System.out.println("Gradien garis: " + garis1.getGradien());
        System.out.println("Titik tengah garis: ");
        garis1.getTitikTengah().printTitik();
        System.out.println("Persamaan garis: " + garis1.getPersamaanGaris());

        Titik titik3 = new Titik(1, 2);
        Titik titik4 = new Titik(3, 6);
        Garis garis2 = new Garis(titik3, titik4);

        System.out.println("Apakah garis1 sejajar dengan garis2? " + garis1.isSejajar(garis2));
        System.out.println("Apakah garis1 tegak lurus dengan garis2? " + garis1.isTegakLurus(garis2));

        System.out.println("Jumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}
