package ArraysSecond_Part;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {23,45,67,13,46,89,10};
        int n = arr.length-1;

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        // reverse
        // for(int i=0;i<n/2;i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-i];
        //     arr[n-i] = temp;
        // }


        // by using Two pointer
         // int i=1,j=5; // part of array reverse
        int i=0, j=n;
        while(i<=j){
            swap(arr, i, j);
             i++;
             j--;
        }  
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] arr,int i,int j){
         int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
    }
}

// TWO POINTER APPROACH FOR REVERSING ARRAY

// Example:
// arr = [10, 20, 30, 40, 50]

// Step 1:
// Take two pointers
// i = 0  -> first element
// j = arr.length - 1 -> last element

// i=0, j=4

// Step 2:
// Swap arr[i] and arr[j]

// Before Swap:
// [10, 20, 30, 40, 50]

// After Swap:
// [50, 20, 30, 40, 10]

// Move pointers inward
// i++ => 1
// j-- => 3

// Step 3:
// Swap arr[1] and arr[3]

// Before Swap:
// [50, 20, 30, 40, 10]

// After Swap:
// [50, 40, 30, 20, 10]

// Move pointers inward
// i++ => 2
// j-- => 2

// Step 4:
// i=2, j=2
// Both pointers point to same element (30)

// Swapping same element causes no change

// Array remains:
// [50, 40, 30, 20, 10]

// Move pointers
// i++ => 3
// j-- => 1

// Step 5:
// Condition becomes false
// i > j

// Loop stops

// Final Reversed Array:
// [50, 40, 30, 20, 10]

// Why Two Pointer?
// One pointer starts from beginning.
// One pointer starts from end.
// Swap both elements and move toward center.
// Continue until pointers meet or cross.

// Time Complexity: O(n)
// Space Complexity: O(1)

// Interview Definition:
// Two Pointer Technique is an approach in which two indexes
// are used to traverse an array from different directions
// to solve a problem efficiently.
