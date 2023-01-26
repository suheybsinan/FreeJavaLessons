package ders08_IfStatements;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz.");

        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf=='o' || ilkHarf=='O'){
            System.out.println("Ocak");
        }
        if (ilkHarf=='s' || ilkHarf=='S'){
            System.out.println("Subat");
        }
        if (ilkHarf=='m' || ilkHarf=='M'){
            System.out.println("Mart,Mayıs");
        }
        if (ilkHarf=='n' || ilkHarf=='N'){
            System.out.println("Nisan");
        }
        if (ilkHarf=='h' || ilkHarf=='H'){
            System.out.println("Haziran");
        }
        if (ilkHarf=='t' || ilkHarf=='T'){
            System.out.println("Temmuz");
        }
        if (ilkHarf=='a' || ilkHarf=='A'){
            System.out.println("Agustos,Aralık");
        }
        if (ilkHarf=='e' || ilkHarf=='E'){
            System.out.println("Eylül,Ekim");
        }
        if (ilkHarf=='k' || ilkHarf=='K'){
            System.out.println("Kasim");
        }




    }
}
