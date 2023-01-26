package ders11_TernaryOperator;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1.sayiyi giriniz.");
        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen 2.sayiyi giriniz.");
        double sayi2 = scan.nextDouble();


        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);

        System.out.println(sayi1<sayi2 ? "Küçük olan sayi "+sayi1 : "Küçük olan sayi "+sayi2);
        System.out.println(sayi1>sayi2 ? "Büyük olan sayi "+sayi1 : "Büyük olan sayi "+sayi2);

        System.out.println(Math.min(sayi1, sayi2));
        System.out.println(Math.max(sayi1, sayi2));
    }
}
