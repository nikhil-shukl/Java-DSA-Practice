package Arrays;

import java.util.Scanner;

public class outputAndInputByLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        //inut loop
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        
         for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
