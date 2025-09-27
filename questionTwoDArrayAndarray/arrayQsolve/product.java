package questionTwoDArrayAndarray.arrayQsolve;

public class product {
    public static void main(String[] args) {
        int[] arr = {2,6,3,5};
        int n = arr.length;
        System.out.println("product of all element of array");

        int product = 1;
        for(int i=0;i<n;i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}


