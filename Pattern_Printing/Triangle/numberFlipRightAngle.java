// package Pattern_Printing.Triangle;

import java.util.Scanner;

public class numberFlipRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number");
          int n = sc.nextInt();

          for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
