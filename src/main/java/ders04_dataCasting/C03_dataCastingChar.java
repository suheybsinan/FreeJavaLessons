package ders04_dataCasting;

import java.util.Scanner;

public class C03_dataCastingChar {
    public static void main(String[] args) {

        int a= 'a'+'b';
        System.out.println(a);  // 97+97=195

        System.out.println('a'+'b');  // 195

        System.out.println(""+'a'+'b');  // ab

        // Kullanicidan bir karakter alin
        // ascii tablosunda bu karakterden sonraki 3 karakteri yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz.");
        char girilenKarakter= scan.next().charAt(0);

        System.out.println("Girilen karakter : " + girilenKarakter);

        System.out.println("Girilen karakterin bir sonrasi : " + (char)(girilenKarakter+1));
        System.out.println("Girilen karakterin iki sonrasi : " + (char)(girilenKarakter+2));
        System.out.println("Girilen karakterin uc sonrasi : " + (char)(girilenKarakter+3));







    }
}
