package Arrays;

import java.util.Scanner;

public class sumOfElement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");

        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0;i<=n-1;i++){
            sum += arr[i];
        }
        System.out.println("sum of element is: "+sum);
    }
}
