package ders03_Scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // Kullanicidan ismini soyismini yasini iste alt alta yazdir en altta Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);

        System.out.println("İsminizi giriniz.");
        String isim = scan.nextLine();

        System.out.println("Soyisminizi giriniz.");
        String soyisim = scan.nextLine();

        System.out.println("Yasinizi giriniz.");
        int yas = scan.nextInt();

        System.out.println("Isminiz : "+isim);
        System.out.println("Soyisminiz : "+soyisim);
        System.out.println("Yasiniz : "+yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");






    }
}
