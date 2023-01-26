package ders08_IfStatements;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz.");

        int girilenSayi = scan.nextInt();

        if (girilenSayi % 5 == 0) {
            System.out.println("Girilen sayi 5'in tam kati");
        }
        // if kullanıldıktan sonra { süslü parantez kullanırsak parantez içindekileri baz alır.
        // { kullanilmazsa ilk ; e kadar kismi alir ve geri kalanini if cumlesi olarak algilamaz.
        // ne kod varsa onu yerine getirir.


    }
}
