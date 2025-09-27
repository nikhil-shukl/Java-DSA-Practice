// package Pattern_Printing.Triangle;

import java.util.Scanner;

public class oddRightangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i*2;j+=2){
    
        //         System.out.print(j+" ");
            
        //     }
        //     System.out.println();
        // }

          


        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<=i;j++){
    
                System.out.print(k+" ");
                k+=2;
            
            }
            System.out.println();
        }
    }
}
