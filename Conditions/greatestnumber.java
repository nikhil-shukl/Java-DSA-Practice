// nested If else
// package Conditions;

import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        int a = sc.nextInt();

        System.out.println("Enter 2nd no:");
        int b = sc.nextInt();

        System.out.println("Enter 3rd no:");
        int c = sc.nextInt();
       
        if(a>b){
           if(a>c){
            System.out.println(a+" is greater");
           }else{
            System.out.println(c+" is greater");
           }
        }else{
            if(c>b){
                System.out.println(c+" is greater");
            }else{
                System.out.println(b+" is greater");
            }
        }
        
        sc.close();
    }
}
