package ders03_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Kullanicidan 3 farkli data türünden deger alip acıklamalarıyla yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("İsminizi giriniz.");
        String isim = scan.nextLine();

        System.out.println("Yasinizi giriniz.");
        int yas = scan.nextInt();

        System.out.println("Boyunuzu giriniz.");
        double boy = scan.nextDouble();

        System.out.println("Kisinin istenilen bilgileri : "+"İsim:" + isim +" Yaş:" + yas +" Boy:"+ boy);





    }}
