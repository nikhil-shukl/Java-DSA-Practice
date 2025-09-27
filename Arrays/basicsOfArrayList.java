package Arrays;
import java.util.ArrayList;
public class basicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        
        System.out.println("size of array is: "+arr.size());
        System.out.println(arr);// for print arrayList not required loop

        System.out.println("0th index "+arr.get(0));  // for output

        arr.set(2,369); // modify
        System.out.println(arr);

        arr.add(70); // push back or add back
         System.out.println("\nsize of array is: "+arr.size());
        System.out.println(arr); 
        
        

        
    }
}
