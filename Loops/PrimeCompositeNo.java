// package Loops;

import java.util.Scanner;

public class PrimeCompositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");

        int n = sc.nextInt();
        
        int x = 0;
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){                                   //i changes and you’ll see clearly that n never changes.
                System.out.println("composite number");
                x = 1;
                break;
            }
        }

        if(n == 1) {
            System.out.println("neither prime nor composite");
        }else if(x == 0){
            System.out.println("prime number");
         
        }
    }
}
