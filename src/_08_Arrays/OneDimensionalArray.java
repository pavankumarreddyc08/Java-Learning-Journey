package _08_Arrays;

import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int[] a = new int[size];
        for(int i=0;i<a.length;i++){
            a[i]= scan.nextInt();
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
