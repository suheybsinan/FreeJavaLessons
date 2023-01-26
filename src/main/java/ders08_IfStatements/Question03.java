package ders08_IfStatements;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");

        int girilenSayi=scan.nextInt();

        if (girilenSayi % 3==0){
            System.out.println("Girilen sayi 3'e tam bolunebiliyor.");
        }
        if (girilenSayi % 5==0){
            System.out.println("Girilen sayi 5'e tam bolunebiliyor.");
        }
    }
}
