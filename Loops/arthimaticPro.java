// package Loops;

import java.util.Scanner;

public class arthimaticPro {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the nth term:");
        int n = sc.nextInt();
         
        int j=1;

        for(int i=1;i<=n;i++){
            System.out.print(j+" ");
           j+=2;
        }

        // // formula method
        // for(int i=1;i<=2*n-1;i+=2){
        //    System.out.print(i+" ");
        // }
    }
}

// formula a = a+(n-1)d