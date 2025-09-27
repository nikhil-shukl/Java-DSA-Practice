// package Pattern_Printing.Composite_Pattern;

import java.util.Scanner;

public class numberBridge {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        
        for(int k=1;k<=(n*2)-1;k++){
                System.out.print(k+" ");
                
            }
            System.out.println();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=n-i;j++){
                System.out.print((n+i+j-1)+" ");
            }
            System.out.println();
        }
    }
}
