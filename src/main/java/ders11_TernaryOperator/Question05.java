package ders11_TernaryOperator;

import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        double sayi = scan.nextDouble();

        System.out.println(sayi<0 ? sayi*-1 : sayi);

        System.out.println(sayi<0 ? sayi+" sayisinin mutlak degeri: "+sayi*-1 : sayi+" sayisinin mutlak degeri: "+sayi);

    }
}
