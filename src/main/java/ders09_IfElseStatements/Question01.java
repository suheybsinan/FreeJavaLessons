package ders09_IfElseStatements;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz ve her uzunluk girisi sonrasi enter'a basiniz.");
        // \n string te yazi alt satırdan devam eder.
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eskenar ucgen.");
        }
        else
            System.out.println("Eskenar ucgen degil.");
    }
}