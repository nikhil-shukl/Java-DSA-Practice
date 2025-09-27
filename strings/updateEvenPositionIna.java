package strings;
import java.util.*;
public class updateEvenPositionIna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words:");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if(i % 2 == 0){
                s = s.substring(0,i) + "a" + s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
