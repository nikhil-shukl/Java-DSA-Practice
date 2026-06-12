package Recursion;

public class reverseArray {
   
    static void revArray(int[] nums){

        int n = nums.length - 1;
        int p1 = 0;
        int p2 = n;
        while(p1 < p2){
            int temp = nums[p1];
            nums[p1] = nums[p2];
            nums[p2] = temp;
            p1++;
            p2--;
        }
        
    }



    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        revArray(nums);

        for(int elem : nums){
            System.out.print(elem+" ");
        }
    }
}
