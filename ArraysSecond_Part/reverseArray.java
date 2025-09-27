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
