package _03_conditionalstatements;

public class TernaryOperatorDemo {
    public static void main(String[] args) {

        int number = 15;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);
    }
}
