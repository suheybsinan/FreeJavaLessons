package ders03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Kullanicidan isim soyisim ve yas alip.
        // ismin ilk harfi, soyisim ve yaş şeklinde yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz.");

        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim = scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();

        System.out.println("Girilen bilgiler : " + isim.charAt(0) +" "+ soyisim +" "+ yas);




    }
}
