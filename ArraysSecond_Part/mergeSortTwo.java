package ArraysSecond_Part;

public class mergeSortTwo {
    public static void main(String[] args) {
        int [] arr = {21,34,56,78};
        int[] arr2 = {15,40,66,84,90};
        int n = arr.length;
        int m = arr2.length;

        int x = n+m;
        int[] Tarr = new int[x];

        int i=0,j=0,k=0;
        while(i < x){
            if(j < n && k < m){
                if(arr[j] < arr2[k]){ Tarr[i] = arr[j]; j++;}
                else { Tarr[i] = arr2[k]; k++;}
            }
            else if(j == n){  Tarr[i] = arr2[k]; k++;}
            else if(k == m){ Tarr[i] = arr[j]; j++;}
            i++;
        }
        System.out.println();
        for(int ele:Tarr){
            System.out.print(ele+" ");
        }
    }
}
