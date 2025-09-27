// package Conditions;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side:");
        int a = sc.nextInt();

        System.out.println("Enter 2st side:");
        int b = sc.nextInt();

        System.out.println("Enter 3st side:");
        int c = sc.nextInt();

        if(a+b>c && a+c>b && b+c>a){       // logic for triangle side
            System.out.println("it is valid triangle");
        }else{
            System.out.println("it is not valid triangle");
        }

        sc.close();
    }
}
