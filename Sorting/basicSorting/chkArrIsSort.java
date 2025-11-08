public class chkArrIsSort {
    public static void main(String[] args) {

        int arr[] = {1,3,7,6,8,9};
        int n = arr.length;

        boolean flag = true;

        for(int i=0;i < n-1;i++){
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }

        if(flag == true){
           System.out.println("array is sorted");
        }else {
            System.out.println("array is not sorted");
        }

    }
}