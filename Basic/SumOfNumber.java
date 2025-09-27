// package Basic;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int x = sc.nextInt();

        System.out.println("Enter second number:");
        int y = sc.nextInt();

        System.out.println("Sum of two numbers are: "+(x+y));

        sc.close();
    }
}
