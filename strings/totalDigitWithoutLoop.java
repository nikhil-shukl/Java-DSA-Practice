package strings;

import java.util.Scanner;

public class totalDigitWithoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits: ");
        int a = sc.nextInt();
       // String s = "" + a;
       String s = Integer.toString(a);
        System.out.println(s.length());
    }
}
