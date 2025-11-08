// package Loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term:");
        int n = sc.nextInt();

        int a = 0,b = 1;

        //  if(n >= 1){
        //     System.out.print(a+" ");
        //    } 
        // if(n >= 2){
        //       System.out.print(b+" ");
        //    }
           
        // for (int i = 3; i <= n; i++) {
        //     int f = a + b;
        //     System.out.print(f+" ");
        //       a = b;
        //       b = f;
        // } 

        for(int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        } 

        sc.close();
    }
}