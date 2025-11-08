public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,3,8,6,7,9};
        int n = arr.length;

        boolean flag = true;

        for(int x = 0;x < n-1;x++){
            for (int i = 0; i < arr.length-1-x; i++) {
                if(arr[i+1] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    flag = false;
                }
            }
            if(flag == true) break;
        }

        for(int ele : arr){
            System.out.print(" "+ele);
        }
    }
}
