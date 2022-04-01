package day33Varargs_StringBuilder;

public class practiceQ2varargs {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
        int sayi1=2;
        int sayi2=5;
        int sayi3=10;
        int sayi4=15;
        toplayipCarpan(sayi1,sayi2,sayi3,sayi4);


    }

    private static void toplayipCarpan(int... sayi) {
        int toplanan=0;
        for (int w:sayi)
        toplanan+=w;
              {

        }
        System.out.println((toplanan-sayi[0])*sayi[0]);
        }




    }

