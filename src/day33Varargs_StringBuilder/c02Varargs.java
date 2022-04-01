package day33Varargs_StringBuilder;

public class c02Varargs {
    public static void main(String[] args) {
        //parametre olarak bir int
        // ve istedigimiz kadar String alan
        // en uzun kelimenin harf sayisi ile int
        // parametre degerini carpip sonucu yazdiran bir metod olustur.

        int sayi = 0;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";


        carpim(sayi,str1,str2);
        //bir metotda varargs disinda parametre kullanacaksak once
        // diger parametreleri yazip varargsi en sona yazmaliyiz
        //bu sebeple bir metod'da varargsda birden fazla varargs olmaz.


    }

    private static void carpim(int sayi, String... str ) {
        String enuzun = "";
        for (String each: str
             )
        enuzun=each;
        {
            
        }
        System.out.println(sayi*enuzun.length());
    }
}
