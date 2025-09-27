// package Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class DiamondStar {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            for(int k=n-1;k>=1;k--){
            for(int j=1;j<=n-k;j++){
                System.out.print("  ");
            }
            
            for(int j=1;j<=(k*2)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
