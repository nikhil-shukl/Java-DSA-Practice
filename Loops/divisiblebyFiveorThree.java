// package Loops;

import java.util.Scanner;

public class divisiblebyFiveorThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int n = sc.nextInt();

        for(int i=n;i!=0;i--){
            if(i%3==0 ||i%5==0){
                 System.out.print(i+" ");
            }
        }
    }
}
