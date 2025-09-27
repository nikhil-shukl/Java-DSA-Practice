// package Conditions;

import java.util.Scanner;

public class findprofitorloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost amount:");

        int c = sc.nextInt();

         System.out.println("Enter the selling amount:");
         int s = sc.nextInt();

         if(c>s){
            System.out.println("Loss amount is "+(c-s));
         }else{
            System.out.println("Profit amount is "+(s-c));
         }

         if(c==s) System.out.println("NO profit either loss");

         sc.close();
    }
}
