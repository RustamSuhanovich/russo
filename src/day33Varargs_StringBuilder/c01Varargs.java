package day33Varargs_StringBuilder;

public class c01Varargs {
    public static void main(String[] args) {
        // Kac tane string verilirse verilsin iclerinden en uzun olani yazdiran bir metod olsustur


        String str1 ="Ali";
        String str2 ="Veli";
        String str3 ="Oguzhan";
        String str4 ="Sametlii";
        String str5 ="Turkmenistan";

        enUzunKelime(str1,str2,str3,str4,str5);
    }
    // Yazılan argument sayisi sabit ise her zamanki gibi
    //bir metod olusturabikiris
    //Ancak argument sayisinini degisme ihtimali varsa varargs
    // metodu tercih edilir.
    private static void enUzunKelime(String... str) {
        String enuzunStr =  "";
        for (String each: str)
        if (each.length()>enuzunStr.length()){
            enuzunStr=each;
        }
            {
        }
        System.out.println("en uzun kelime : " +enuzunStr);




    }
}

