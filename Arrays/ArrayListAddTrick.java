package Arrays;
import java.util.*;
public class ArrayListAddTrick {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list+" "+list.size());

        list.add(60);
         System.out.println(list+" "+list.size());

        list.add(70);
         System.out.println(list+" "+list.size());
      
        list.add(80);
         System.out.println(list+" "+list.size());

        list.add(90);
         System.out.println(list+" "+list.size());

        
        list.remove(2);
         System.out.println(list+" "+list.size());
    }
}
