package Arrays;

public class basicSyntax {
    public static void main(String[] args) {
        int[] arr = new int[5];
       // initializing individual elements

        // devide
        int[] nums;      // declaration
        nums = new int[4];   // memory allocation

        arr[0] = 10;
        arr[1] = 20;     
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
       // this boxes are index numbers

        System.out.println( arr[3]);

        arr[3] = 99;
         System.out.println(arr[3]);

        arr[3]++;
         System.out.println(arr[3]);

        arr[3] += 50;
         System.out.println(arr[3]);

        
    }
}
