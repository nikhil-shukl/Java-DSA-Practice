package ArraysSecond_Part;

public class sortArrayZeroOneTwo {
    public static void main(String[] args) {
       int [] arr = {1,0,2,0,2,1,2,1,2,1,0};
        int n = arr.length;

        int o = 0;
        int l = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                o++;
            }else if(arr[i] == 1){
                l++;
            }
        }
        int k = o+l;
        for(int i=0;i<n;i++){
            if(i < o){
              arr[i] = 0;
            }else if(i >= o && i < k){
                arr[i] = 1;
            }else{
                arr[i] = 2;
            }
        }

        System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
