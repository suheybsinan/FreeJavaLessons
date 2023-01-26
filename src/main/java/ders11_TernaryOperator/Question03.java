package ders11_TernaryOperator;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz.");
        double not = scan.nextDouble();

        System.out.println(not>=50 ? "Sınıfı gectiniz." : "Maalesef sinifta kaldiniz.");
    }
}
