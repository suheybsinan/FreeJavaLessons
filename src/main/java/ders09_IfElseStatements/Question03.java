package ders09_IfElseStatements;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen agirliginizi kilo olarak giriniz.");
        double agirlik = scan.nextDouble();

        System.out.println("Lutfen boyunuzu cm olarak giriniz.");
        double boy = scan.nextDouble();

        double vke = (agirlik*10000) / (boy*boy);
        System.out.println("Vucut kitle endeksiniz : "+vke);

        if (vke >=30) System.out.println("Obez");
        else if (vke>=25) System.out.println("Kilolu");
        else if (vke>=20) System.out.println("Normal");
        else System.out.println("Zayıf");
    }
}
