// package Pattern_Printing.Square;

import java.util.Scanner;

public class squareNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the n:");
          int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        
        // for(int i=1;i<=n;i++){                    // for odd number square
        //     for(int j=1;j<=n;j++){
        //         System.out.print(2*j-1+" ");
        //     }
        //     System.out.println();
        // }

    }
}
