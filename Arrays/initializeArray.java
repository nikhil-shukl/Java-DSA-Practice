package Arrays;

public class initializeArray {
    public static void main(String[] args) {
        int[] arr = {34,56,33,22,78,92,65,12,14,51,91};
        int n = arr.length;

        System.out.println("Length of array is: "+n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
