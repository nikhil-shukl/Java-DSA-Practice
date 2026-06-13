package basicSorting.sorting_i;

import java.util.Scanner;

public class bubbleSort {
    static void sort(int[] arr){
        int n = arr.length;
       for(int i=n-1;i>=0;i--){
        for(int j=0;j<=i-1;j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);
         System.out.println("Sorted array:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
