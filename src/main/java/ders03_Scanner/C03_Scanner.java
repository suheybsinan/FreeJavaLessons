package ders03_Scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Kullanicidan bir kelime isteyip, kelimenin ilk harfini yazdırın.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz.");

        char ilkHarf=scan.next().charAt(0);

        // javada string icerisindeki karakterler index ile tutulur.
        // örenegin kullanıcı Ali yazarsa 0.index te A, 1. index te l 2.index i

        System.out.println("Girilen kelimenin ilk harfi : " + ilkHarf);





    }
}
