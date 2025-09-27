// package Methods;

import java.util.Scanner;

public class findGreatNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int pre = Math.max(a,b);
        int max = Math.max(pre,c);
        System.out.println(max);
    }
}
