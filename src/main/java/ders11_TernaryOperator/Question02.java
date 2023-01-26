package ders11_TernaryOperator;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz.");
        char harf = scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? (char) (harf-32) : harf);
    }
}
