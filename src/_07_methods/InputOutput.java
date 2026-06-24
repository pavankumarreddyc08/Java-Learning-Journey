package _07_methods;

class Calculator2{
    int c;
    int add(int a, int b) {
        c = a + b;
        return c;
    }
}



public class InputOutput {
    public static void main(String[] args) {
        Calculator2 calculator2=new Calculator2();
        int n1=50;
        int n2=50;

        int res=calculator2.add(n1,n2);
        System.out.println(res);
    }
}
