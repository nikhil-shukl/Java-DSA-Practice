// package Conditions;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        
        int n = sc.nextInt();
        //condition ? true:false;

        System.out.println((n%2 == 0 ? "even":"odd"));

        sc.close();
    }
}
