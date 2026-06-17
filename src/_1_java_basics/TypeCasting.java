package _1_java_basics;

public class TypeCasting {
    public static void main(String[] args) {
        //    implicit type casting
        byte a=45;
        double b;
        b=a;
        System.out.println(a);
        System.out.println(b);

//        explicit type casting
        double c=45.5;
        byte d;
        d=(byte)c;
        System.out.println(c);
        System.out.println(d);
    }
}
