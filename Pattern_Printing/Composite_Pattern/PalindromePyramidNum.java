// package Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class PalindromePyramidNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

      
        for(int i=1;i<=n;i++){
            
            int cond = (i*2)-1;

            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            
            for(int j=1;j<=cond/2;j++){
                System.out.print(j+" ");
            }

            for(int j=(cond/2 + 1);j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
