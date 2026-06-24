package _07_methods;

class Calculator4{
    int c;
    void add(int a, int b){
        c=a+b;
        System.out.println(c);
    }
}


public class InputNoOutput {
    public static void main(String[] args) {
        int n1=20;
        int n2=30;

        Calculator4 calculator4=new Calculator4();
        calculator4.add(n1, n2);
    }
}
