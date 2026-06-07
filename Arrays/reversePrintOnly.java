package Arrays;

import java.util.Scanner;

public class reversePrintOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("reverse order of array");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[array.length-1-i]+" ");
        }
    }
}
