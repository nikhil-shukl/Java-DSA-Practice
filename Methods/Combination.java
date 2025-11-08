// package Methods;

import java.util.Scanner;

public class Combination {

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

         System.out.println("Enter r");
         int r = sc.nextInt();

         int nFact = fact(n);
         int rFact = fact(r);
         int n_rFact = fact(n-r);

         int nCr = nFact / (rFact * n_rFact);
         System.out.println("Combination of given n and r is: "+nCr);

         sc.close();
    }
}

// formula for Combination nCr = n!/r!(n-r)!
// permutation nPr = n!/(n-r)!