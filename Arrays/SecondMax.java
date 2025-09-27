package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {12,23,56,78,44,56,67,54,9,98,};
        int n = arr.length;

        int mx = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > mx) mx = arr[i];
        }
        System.out.println(mx);
        
        int smx = arr[0];
        for(int i=1;i<n;i++){
            if( arr[i] > smx && mx > arr[i]) smx = arr[i];
        }
        System.out.println(smx);
    }
}
