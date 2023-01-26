package ders12_SwitchStatements;

import java.util.Scanner;

public class SwitchQ_02 {
    public static void main(String[] args) {
        // Kullanicidan gun numarasi alip hafta ıcı yada hafta sonu oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun numarasi giriniz.");
        int gunNo= scan.nextInt();

        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("Hafta sonu");
                break;
            default :
                System.out.println("Gecersiz gun numarasi girisi.");
        }
    }
}
