// package Conditions;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        int x = sc.nextInt();

        if(x % 2 == 0) System.out.println("even");
         if(x % 2 != 0) System.out.println("odd");
         
       sc.close();
    }
}
