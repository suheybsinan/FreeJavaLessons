package ders05_WrapperClasses;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        // Kullanicidan alinan 3 basamakli pozitif bir tamsayinin rakamlar toplamini bulun.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir tamsayi giriniz.");
        int sayi= scan.nextInt();

        int birlerBas=0;
        int rakamlarToplami=0;

        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBas; // rakamlarToplami+=birlerBas da olur.
        sayi=sayi/10; // sayi/=10 da olur.

        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBas;
        sayi=sayi/10;

        birlerBas=sayi%10;
        rakamlarToplami=rakamlarToplami+birlerBas;
        sayi=sayi/10;

        System.out.println("Girilen sayinin rakamları toplami : "+rakamlarToplami);




    }
}
