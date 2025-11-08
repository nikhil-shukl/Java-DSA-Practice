package Arrays;

import java.util.Arrays;

public class builtInMethods {
    public static void main(String[] args) {
        int[] arr = {30,10,46,74,25,94};
        // for each loop
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);    // built in method of array
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
