package ders10_Nested_IfElseStatements;

import java.util.Scanner;

public class C01_NestedifElseQuestionYas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz.");
        String cinsiyet = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz.");
        int yas = scan.nextInt();


        if (yas<0 || yas>99) {
            System.out.println("Yas girisi gecersizdir.");
        }else if (yas<60) {
            if (cinsiyet.equalsIgnoreCase("Kadin")) {
                System.out.println("Emekli olmabilmeniz icin " + (60 - yas) + " yil daha calismaniz gerekmektedir.");
            }else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olabilmeniz icin "+(65-yas)+" yil daha calismanz gerekmektedir.");
            }else {
                System.out.println("Cinsiyet girisi gecersizdir.");
            }

        }else if (yas<65) {
            if (cinsiyet.equalsIgnoreCase("Kadin")){
                System.out.println("Emekli olabilirsiniz.");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olabilmeniz icin "+(65-yas)+" yil daha calismaniz gerekmektedir.");
            }else {
                System.out.println("Cinsiyet girisi gecersizdir.");
            }

        }else{
            if (cinsiyet.equalsIgnoreCase("Kadin")){
                System.out.println("Emekli olabilirsiniz.");
            }else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olabilirsiniz.");
            }else {
                System.out.println("Cinsiyet girisi gecersizdir.");
            }

        }
    }
}
