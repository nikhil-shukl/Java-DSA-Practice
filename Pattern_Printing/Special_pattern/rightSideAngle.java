// package Pattern_Printing.Special_pattern;

import java.util.Scanner;

public class rightSideAngle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){               // double loop use means composite pattern
        //         System.out.print("  ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

       for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j > n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
