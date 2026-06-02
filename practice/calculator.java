package practice;
import java.util.*;

public class calculator {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first element");
        int a = sc.nextInt();

        System.out.println("Enter second element");
        int b = sc.nextInt();
        
        System.out.println("Enter option 1 +, 2 -,3 *,4 /");
        int op = sc.nextInt();

        if(op == 1) System.out.println(a + b);
        if(op == 2) System.out.println(a - b);
        if(op == 3) System.out.println(a * b);
        if(op == 4) System.out.println(a / b);
             
    }
}
