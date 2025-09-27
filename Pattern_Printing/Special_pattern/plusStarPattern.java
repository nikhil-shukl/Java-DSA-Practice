// package Pattern_Printing.Special_pattern;

import java.util.Scanner;

public class plusStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if((n/2 + 1) == i){
                for(int j=1;j<=n;j++){
                    System.out.print("*"+" ");
                }
            }else{
                for(int j=1;j<=n/2;j++){
                    System.out.print(" "+" ");
                }
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
