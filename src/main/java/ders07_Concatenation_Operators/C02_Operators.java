package ders07_Concatenation_Operators;

public class C02_Operators {
    public static void main(String[] args) {

        int a= 20;

        // Java da = işareti assignment işaretidir.
        // Java bu işareti gördüğünde önce sagdaki deger bulma islemini yapar
        // sonra bulunan degeri soldaki vaiable a assign eder. (atama yapar)

        int b=20;

        // a ile b eşit mi sorusunda java da == kullanilir.

        System.out.println(a==b); // 30 == 30 yani true

        boolean c = 20==b;
        System.out.println(c); // true

        // != esit degildir demek

        // && and operatoru hem hem anlami tasir. hepsi true ise sonuc true, biri bile false ise sonuc false tur.
        // && carpma islemine benzer ornek: 1*1*1*1*1= 1 yani true ama biri bile 0 olursa sonuc 0 yani false.

        // && ile & arasindaki fark && ilk false gorunce sonucu false yapar.
        // ama & ilk false u gorse bile sona kadar gider islemi tamamlar sonra false sonucunu verir.

        // || OR veya operatoru boolean ifadelerin hepsi false ise false yapar.
        // bunun disindaki her sonucu true yapar.  && ın tersidir. Bir true bile varsa sonuc true dur.






    }
}
