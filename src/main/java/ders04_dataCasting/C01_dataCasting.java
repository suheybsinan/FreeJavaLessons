package ders04_dataCasting;

public class C01_dataCasting {
    public static void main(String[] args) {

        int a= 134;
        double b= 23.4;
        short c= 34;
        byte d= 14;


        double e= a; // veriable in data turu double > int degerin data turu
        int f= c; // veriable in data turu int > short degerin data turu
        short g= d; // verable in data turu short > byte degerin data turu

        //short h = b; // veriable in data turu short < double degerin data turu


        short l = (short)b;

        System.out.println("double 23,4 un short karsiligi : " +l);  // 23

        // zorla bu sekilde degistirmede eger sigmazsa kendisine göre cevirir. baska derste gorulecek.



    }





}
