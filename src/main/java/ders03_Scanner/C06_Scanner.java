package ders03_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan bir double bir int alıp bir toplam birde çarpım yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir double sayı giriniz.");
        double sayi1 = scan.nextDouble();

        System.out.println("Bir sayı giriniz.");
        int sayi2 = scan.nextInt();

        System.out.println("İki sayının toplamı= " + (sayi1+sayi2));
        System.out.println("İki sayının çarpımı:= " + (sayi1*sayi2));




    }}
