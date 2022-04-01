package day33Varargs_StringBuilder;

public class practiceQ1Varargs {
    //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
    // input : "m", "e", "r", "v", "e";
    // output : merve

    public static void main(String[] args) {
        String str1 = "m";
        String str2 = "e";
        String str3 = "r";
        String str4 = "v";
        String str5 = "e";
        stringleriToplayanMetod(str1,str2,str3,str4,str5);
    }

    private static void stringleriToplayanMetod(String... str ) {
        String toplananStr="";
        for (String each: str)
        toplananStr+=each;
        {

        }
        System.out.println(toplananStr);
    }
}
