package day33Varargs_StringBuilder;

public class c05stringbuilder {
    public static void main(String[] args) {

 /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey yazdirmaz
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu yazdirir
        Tamamen ayni ise bize 0 dondurur
        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */

StringBuilder sb1 = new StringBuilder("Ali Can");
StringBuilder sb2 = new StringBuilder("Ali");
String str = "Ali can";
        System.out.println(sb1.compareTo(sb2));


    }
}
