package ders11_TernaryOperator;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif tam sayi giriniz.");
        int girilenSayi = scan.nextInt();

        System.out.println(girilenSayi % 5 == 0 ? "5'in tam kati." : "5'in tam kati degil.");
    }
}
