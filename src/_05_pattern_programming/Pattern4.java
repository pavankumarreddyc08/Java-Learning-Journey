package _05_pattern_programming;

public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5 ; j++) {
                if(count<10){
                    System.out.print("0");
                }
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
