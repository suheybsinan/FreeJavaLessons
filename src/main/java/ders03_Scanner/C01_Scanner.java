package ders03_Scanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


        // Kullanıcıdan ismini alalım.
        // 1.adim scanner objesi olustur.

        Scanner scan= new Scanner(System.in);

        // 2.adim kullanıcıya ne istediğimizi söyleyelim.

        System.out.println("Lutfen isminizi giriniz.");

        // 3.adim scan objesini kullanarak kullanıcıdan bilgiyi alip olusturacagımız uygun bir veriable a kaydedelim.

        String kullaniciIsmi = scan.nextLine();

        // next() sadece ilk space e kadar olan metni alırken nextLine() tüm satiri alir.

        System.out.println("Girilen kullanici ismi : " + kullaniciIsmi);



    }
}
