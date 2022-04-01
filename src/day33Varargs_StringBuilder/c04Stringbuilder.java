package day33Varargs_StringBuilder;

public class c04Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("yasasin java");
        System.out.println(sb1.indexOf("java"));
        System.out.println(sb1.lastIndexOf("s"));
        System.out.println(sb1.replace(0,7,"ne guzel"));
        System.out.println(sb1);
        System.out.println(sb1.toString().toUpperCase()); // burda string metodu kullanıldıgı icin  veriablemiz immutable degere donusur
        System.out.println(sb1.delete(0,3));
        System.out.println(sb1.deleteCharAt(5));// tek karakteri(harfi) siler
        System.out.println(sb1.deleteCharAt(sb1.indexOf("l"))); //bu sekilde indeksteki harfi silebiliriz



    }
}
