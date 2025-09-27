package strings;

import java.util.Scanner;

public class convertIntIntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int:");
        int a = sc.nextInt();
        String s = "";
        s += a;
        System.out.println(s);

         
    }
}
