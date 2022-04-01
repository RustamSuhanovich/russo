package day33Varargs_StringBuilder;

public class c03Stringbuilder {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder(); //bu sekilde olustur.
        StringBuilder st2 = new StringBuilder("Hello");//bu sekilde olustur.
        StringBuilder st3 = new StringBuilder(10);//bu sekilde olustur.
        System.out.println("st3lenght :" +st3.length()); //0
        System.out.println("st3 capacity : " + st3.capacity()); //10
        System.out.println("st capasity :" + st.capacity());//16 avtomat
        System.out.println("st2 lenght :" + st2.length() );// stringin uzunlugu 5

        // append metodu ile Stringbuilder' a ekleme yapabiliriz

        st.append("java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println(st+" " +st.length());

        st.append(3); //eklemeler concat seklinde olur
        System.out.println(st);
        st.append(true);
        System.out.println(st);
        st.append("tum dersler java olsa");
        System.out.println(st.length());
        System.out.println(st.capacity());

        st.trimToSize();
        System.out.println(st.length());
        System.out.println(st.capacity());




    }
}
