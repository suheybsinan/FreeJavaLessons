package ders04_dataCasting;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int a= 135;

        byte b= (byte) a;

        System.out.println("int 135 in byte karsiligi : " + b );   // -121

        // byte -128 ile 127 arasinda oldugu icin 0 dan 128 e gider sonra -128 den 0 a doğru gider
        // ve bu dongu bu sekilde devam eder.
        // yani kovayi doldur bosalt doldur bosalt en sonunda kovaya sigan ne kaliyorsa o nu yazar.






    }
}
