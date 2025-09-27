// package Basic;

import java.util.Scanner;

// Q take integer x as input and print half of the number.
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");

        int x = sc.nextInt();
        
        double y = (double)x; // typeCasting change int in to a double data type
        System.out.println(y/2);

        sc.close();
    }
}
