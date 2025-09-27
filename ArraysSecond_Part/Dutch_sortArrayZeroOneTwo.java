package ArraysSecond_Part;

public class Dutch_sortArrayZeroOneTwo{
    public static void main(String[] args) {
        int [] arr = {1,0,2,0,2,1,2,1,2,1,0};
        int n = arr.length;
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
     
        // Dutch flag algorithm method
        int mid = 0,high = n-1,low = 0;                 //  mid & low => 1 0 2 0 2 1 2 1 0 1 0 <= high
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++; 
                mid++;
            }else if(arr[mid]==1) mid++;
            else{// arr[mid] == 2
              int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
