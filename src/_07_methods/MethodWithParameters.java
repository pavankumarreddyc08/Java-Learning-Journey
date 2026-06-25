package _07_methods;

public class MethodWithParameters {
    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        greet("Pavan");
        greet("John");
    }
}
