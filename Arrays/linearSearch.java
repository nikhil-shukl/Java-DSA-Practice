package Arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");

        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        
        boolean flag = false;
         for(int i=0;i<=n-1;i++){
            if(arr[i] == x){
                flag = true;
                break;
            }
        }

        if(flag == true) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
