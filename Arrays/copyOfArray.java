package Arrays;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {45,67,23,75,13,84};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int[] nums = arr; // shallow copy means only change name of array new copied array not created
        nums[0] = 90;
        System.out.println(arr[0]+" "+nums[0]);   //changed value of arr[0] because nums and arr same only names are diff

        // deep copy 
        int[] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 2;
        System.out.println(arr[0]+" "+brr[0]); // now also 70 means new brr copied array created
        
        //created new copied array using logic
        int[] crr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            crr[i] = arr[i];
        }

        crr[0] = 100;
        System.out.println(arr[0]+" "+crr[0]);
    }
}
