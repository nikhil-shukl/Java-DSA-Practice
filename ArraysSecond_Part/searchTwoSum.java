// find the doublet int the Array whose sum is equal to the given value x.(Two sum)

package ArraysSecond_Part;

import java.util.Scanner;

public class searchTwoSum {
    public static void main(String[] args) {
        int[] arr = {7,3,2,9,1,6,10,-3,16,11,5,21,34,58};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int n = sc.nextInt();

        int size = arr.length;

        boolean flag = false;

        for(int i=0;i<size;i++){
            for(int j=(i+1);j<size-i;j++){
                if(arr[i] + arr[j] == n){
                    System.out.println(arr[i]+" + "+arr[j]+" = "+n);
                    flag = true;

                }
            }
        }
        if(flag == false) System.out.println("types of numbers not present which sums is equal to target element");
    }
}
