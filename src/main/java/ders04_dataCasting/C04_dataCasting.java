package ders04_dataCasting;

import java.util.Scanner;

public class C04_dataCasting {
    public static void main(String[] args) {

        // Kullanicidan iki tam sayi alip, bunlari birbirine bolun
        // sonucu double olarak yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolunecek tamsayiyi girin.");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen bolecek tamsayiyi girin.");
        int sayi2 = scan.nextInt();

        System.out.println("sayi1/sayi2 nin degeri = " + sayi1/sayi2);  // int int verir.
        System.out.println("sayi1/sayi2 nin degeri = " + (double) sayi1/sayi2); // int double verir.

        double sonuc= (double)sayi1/sayi2;
        System.out.println("sayi1/sayi2 nin degeri = "+ sonuc);







    }
}
