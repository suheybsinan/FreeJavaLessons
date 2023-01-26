package ders09_IfElseStatements;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz.");
        int girilenSayi = scan.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0)
            System.out.println(girilenSayi+" super sayidir.");
        else if (girilenSayi % 3 == 0)
            System.out.println(girilenSayi+" uc ile bolunebilen bir sayidir.");
        else if (girilenSayi % 5 == 0)
            System.out.println(girilenSayi+" bes ile bolunebilen bir sayidir.");
        else System.out.println(girilenSayi+" uce yada bese bolunebilen bir sayi degildir.");
    }
}
