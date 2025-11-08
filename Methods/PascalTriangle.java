// package Methods;

import java.util.Scanner;

public class PascalTriangle {
     public static int fact(int x){
        int xFact = 1;
        for(int i=x;i>=1;i--){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=0;j<=i;j++){
                int iCj =fact(i)/(fact(j)*fact(i-j));
                System.out.print(iCj+"   ");
            }
            System.out.println();
        }

        sc.close();
    }
}
