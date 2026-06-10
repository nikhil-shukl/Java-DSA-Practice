package ArraysSecond_Part;

import java.util.Scanner;

public class rotateArrayKstep {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 13, 46, 89, 10};
        int n = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of steps to rotate (k): ");
        int k = sc.nextInt();
        k = k % n; // to handle if k > n

        int[] rotated = new int[n];
    
        // Rotation using extra array
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        // Optional: copy rotated array back to original array if needed
        for (int i = 0; i < n; i++) {
            arr[i] = rotated[i];
        }

        System.out.println("Array after rotating " + k + " steps:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
