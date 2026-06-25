package _07_methods;

public class MethodWithReturnType {
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int result = square(5);

        System.out.println("Square = " + result);
    }
}
