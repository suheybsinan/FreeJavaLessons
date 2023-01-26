package ders12_SwitchStatements;

import java.util.Scanner;

public class SwitchQ_07 {
    public static void main(String[] args) {

        // Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ISTQB kisaltmasindan acilimini istediginiz harfi giriniz.");
        char harf = scan.next().charAt(0);

        switch (harf){
            case 'I' :
            case 'i' :
                System.out.println("International");
                break;
            case 'S' :
            case 's' :
                System.out.println("Software");
                break;
            case 'T' :
            case 't' :
                System.out.println("Testing");
                break;
            case 'Q' :
            case 'q' :
                System.out.println("Qualifications");
                break;
            case 'B' :
            case 'b' :
                System.out.println("Board");
                break;
            default :
                System.out.println("Kisaltmada yer almayan bir harf girdiniz.");

        }

    }
}
