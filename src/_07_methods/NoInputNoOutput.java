package _07_methods;

class Calculator1{
    int a=40;
    int b=50;

    void add(){
        int c=a+b;
        System.out.println(c);
    }
}


public class NoInputNoOutput {
    public static void main(String[] args) {
        Calculator1 calculator1 = new Calculator1();
        calculator1.add();
    }
}
