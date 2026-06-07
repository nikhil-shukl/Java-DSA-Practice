package Arrays;

import java.util.Scanner;

import twoDArray.forEach;

public class practiceArr {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        input(arr);
        sum(arr);
        Max(arr);
        mulAndadd(arr);
    }

    static void input(int[] arr) {

        System.out.println("Enter the values:");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void sum(int[] arr) {

        int total = 0;

        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("Sum of array elements is: " + total);
    }

    static void Max(int[] arr){
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("greatest value: "+max);
    }

    static void mulAndadd(int[] arr){

            for (int i = 0; i < arr.length; i++) {
                 if(i % 2 == 0){
                    arr[i] += 10;
                 }else{
                    arr[i] *= 2;
                 }
            }
            
            System.out.println();
            for(int ele : arr){
              System.out.print(ele+" ");
            }
    }
}
