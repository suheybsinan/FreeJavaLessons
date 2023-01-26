package ders09_IfElseStatements;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz.");
        double not= scan.nextDouble();

        if (not>100 || not<0){
            System.out.println("Gecersiz not girisi.");
        }else if (not>=85){
            System.out.println("AA ile gectiniz.");
        }else if (not>=65){
            System.out.println("BB ile gectiniz.");
        }else if (not>=50){
            System.out.println("CC ile gectiniz.");
        }else {
            System.out.println("Maalesef DD ile kaldiniz.");
        }
    }
}
