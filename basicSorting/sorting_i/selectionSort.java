package basicSorting.sorting_i;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<=n-2;i++){
            int min = i;
            for(int j=i;j<=n-1;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
             int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }

        System.out.println("Sorted array:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
