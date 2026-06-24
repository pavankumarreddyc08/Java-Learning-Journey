package _07_methods;

class Calculator3{
    int a=10;
    int b=20;
    int c;
    int add(){
        c=a+b;
        return c;
    }
}


public class NoInputOutput {
    public static void main(String[] args) {
        Calculator3 calculator3=new Calculator3();
        int res=calculator3.add();
        System.out.println(res);
    }
}
