// package Loops;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int a=0, b=0;

        while(n!=0){
            a = n%10;
            b = b+a;
            n = n/10;
        }
        System.out.println(b);
    }
}
