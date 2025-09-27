package Arrays;

public class rollNumber {
    public static void main(String[] args) {
        int[] arr = {88,90,55,66,23,45,67,32,11};
        int n = arr.length;
        
        System.out.println("Rollno of students less then 35");
        for(int i=0;i<n;i++){
            if(arr[i] < 35) System.out.println(i);
        }
    }
}
