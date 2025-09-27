package Arrays;

public class minValue {
     public static void main(String[] args) {
        int[] arr = {12,23,56,78,44,56,98,67,54,9,98,};
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            min = Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
}
