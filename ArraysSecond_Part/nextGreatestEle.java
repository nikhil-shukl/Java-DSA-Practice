package ArraysSecond_Part;

public class nextGreatestEle {
    public static void main(String[] args) {
        int[] arr = {12,8,60,28,49,21,41,16,13,30};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;

        int nge = arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i] = nge;
            nge = Math.max(nge,arr[i]);
        }
        
         System.out.println();
        for(int ele:arr){
            System.out.print(ele+" ");
        }

         System.out.println();
        for(int ele:ans){
            System.out.print(ele+" ");
        }
 
    }
}
