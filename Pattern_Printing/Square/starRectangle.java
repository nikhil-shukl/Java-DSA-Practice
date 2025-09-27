// package Pattern_Printing.Square;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the rows and colums:");
          int n = sc.nextInt();
          int m = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
