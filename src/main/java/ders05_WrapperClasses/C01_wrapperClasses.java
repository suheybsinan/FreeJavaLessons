package ders05_WrapperClasses;

public class C01_wrapperClasses {
    public static void main(String[] args) {

        String str = "Java";

        System.out.println(str.toUpperCase());

        int sayiP= 20;
        // primitive data turlerinin hazir metotlari yoktur, saedce deger icerirler.

        // Wrapper class lar primitive data turleri ile ayni degerleri barindirirken
        // degerleri yaninda hazir metotlarda kullanmamiza imkan veren class lardır.

        Integer sayiW=30;

        System.out.println(Integer.MAX_VALUE); // 2147483647

        System.out.println(Integer.MIN_VALUE); // -2147483647

        char karekP='a';
        Character karakW='b';

        System.out.println(Character.isDigit(karekP)); // false
        System.out.println(Character.isLowerCase(karekP)); // true



        String str2= "1234";
        String str3= "1000";
        System.out.println(str2+str3); // 12341000

        System.out.println(Integer.valueOf(str2)+ Integer.valueOf(str3)); // 2234


    }
}
