package twoDArray;
import java.util.*;
public class ArrayListTwoD {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);

        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);

        // System.out.print(a); // direct print list
        // for (int i = 0; i < a.size(); i++) {
        //        System.out.print(a.get(i)+" ");
        // }
        
        //print direct array list
        // for (int i = 0; i < l.size(); i++) {
        //     System.out.println(l.get(i));
        // }

        // System.out.println(l.get(0).get(1));   // for access 2dArrayList
         
        for (int i = 0; i < l.size(); i++) {
            List<Integer> x = l.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
    }
}