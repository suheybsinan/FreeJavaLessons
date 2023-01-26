package ders03_Scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin yerlerini degiştirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz.");
        int sayi1 = scan.nextInt();

        System.out.println("Bir sayi daha giriniz.");
        int sayi2 = scan.nextInt();

        int gecici;

        System.out.println("Sayi1 = "+sayi1+" "+"Sayi2 = "+sayi2);


        gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;
        System.out.println("Sayi1 = "+sayi1+" "+"Sayi2 = "+sayi2);



    }
}
