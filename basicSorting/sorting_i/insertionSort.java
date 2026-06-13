package basicSorting.sorting_i;

public class insertionSort {

    public int[] InsertionSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;

            // Shift greater elements to the right
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // Insert key at correct position
            nums[j + 1] = key;
        }

        return nums;
    }
}

class Main {
    public static void main(String[] args) {

        // Create object of insertionSort class
        insertionSort solution = new insertionSort();

        int[] nums = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Using Insertion Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Function Call
        nums = solution.InsertionSort(nums);

        System.out.println("After Using Insertion Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
