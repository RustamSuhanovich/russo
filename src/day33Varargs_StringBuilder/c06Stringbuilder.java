package day33Varargs_StringBuilder;

public class c06Stringbuilder {
    public static void main(String[] args) {
        String  str = "Ali can";
        StringBuilder sb1 = new StringBuilder("prize dikkat ");
        System.out.println(sb1.insert(12,"edin."));//insert metodu verilen indeksten
        // sonrasyna istedigimiz eklemeyi yapar

        System.out.println(sb1.reverse()); //reverse metodu stringi soldan saga degil,
        // sagdan sola dogru yazdirir.

      //  if (str==sb1) satirin altı kızarır
        System.out.println(sb1.substring(3,5));






    }
}
