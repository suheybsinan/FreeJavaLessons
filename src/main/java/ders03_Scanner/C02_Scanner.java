package ders03_Scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // kullanicidan dairenin yari çapini alıp, alani hesaplayin ve yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dairenin yaricapini giriniz.");

        double yaricap = scan.nextDouble();

    // alanini hasaplayin yazdirin.

    double daireAlani = 3.14 * yaricap*yaricap;

        System.out.println("Dairenin Alani : " + daireAlani);






    }
}
