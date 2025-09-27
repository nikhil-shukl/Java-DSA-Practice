// package Conditions;

import java.util.Scanner;

public class FiveorThree{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number:");

    int n = sc.nextInt();

    if(n%5 == 0 ||n%3 == 0){
        System.out.println("divisible by 5 or 3");
    }else {
        System.out.println("not divisible by 5 or 3");
    }
    
    sc.close();
    }
}