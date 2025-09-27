// package Conditions;

import java.util.Scanner;

public class FiveDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if(9999<n && n<100000){
            System.out.println("Yes it is 5 digit number");
        }else{
            System.out.println("it is not 5 digit number");
        }

        sc.close();
    }
}
