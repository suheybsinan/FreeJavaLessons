package ders06_increment_preincrement;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {

        int sayi=10;

        // sayi degerini olusturacagimiz b veriable ina atayalim
        // sonra sayi degerini bir arttiralim.

        int b=sayi;
        sayi++;

        System.out.println(b); // 10
        System.out.println(sayi); // 11

        // bunu tek satirda yapabilir miyiz?
        // sayi degerini olusturacagimiz b veriable ina atayalim sonra sayi degerini bir arttiralim.

        int c=sayi++;
        // önceden arttirma icin ++sayi
        // sonradan arttirma icin sayi++

        System.out.println(c); // 11
        System.out.println(sayi); // 12




    }
}
