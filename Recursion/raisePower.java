package Recursion;

import java.util.Scanner;

public class raisePower {

    public static int pow(int a,int b){
        if(b == 1) return a;
        b--;
        return a * pow(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value a:");
        int a = sc.nextInt();

        System.out.println("enter value b power of a:");
        int b = sc.nextInt();

       System.out.println(pow(a,b));

        sc.close();
    }
}
