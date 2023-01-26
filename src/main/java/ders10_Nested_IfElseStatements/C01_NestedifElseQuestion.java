package ders10_Nested_IfElseStatements;

import java.util.Scanner;

public class C01_NestedifElseQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz.");
        String cinsiyet = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz.");
        int yas = scan.nextInt();

        if (cinsiyet.equalsIgnoreCase("Kadin")){
            if (yas<0 || yas>99) {
                System.out.println("Yas girisi gecersizdir.");
            }else if (yas<60) {
                System.out.println("Emekli olmak icin " + (60 - yas) + " yil daha calismaniz gerekmektedir.");
            }else {
                System.out.println("Emekli olabilirisiniz.");
            }

        }else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            if (yas < 0 || yas > 99) {
                System.out.println("Yas girisi hatalidir.");
            }else if (yas<65) {
                System.out.println("Emekli olmak icin " + (65 - yas) + " yil daha calismaniz gerekmektedir.");
            }else {
                System.out.println("Emekli olabilirsiniz.");
            }
        }else {
            System.out.println("Cinsiyet girisi hatalidir.");
        }
    }

}
