// package Pattern_Printing;

import java.util.Scanner;

public class NIKHILPattern {

    // Print N
    public static void printN(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == j)
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }
           
    // Print I
    public static void printI(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || j == n / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    // Print K
    public static void printK(int n, int i) {
    for (int j = 0; j < n; j++) {
        if (j == 0 || i + j == n/2 || i - j == n/2 )
            System.out.print("*");
        else
            System.out.print(" ");
    }
}


    // Print H
    public static void printH(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || j == n - 1 || i == n / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    // Print L
    public static void printL(int n, int i) {
        for (int j = 0; j < n; j++) {
            if (j == 0 || i == n - 1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    // Space between letters
    public static void space() {
        System.out.print(" "+"  ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern (minimum 5 recommended): ");
        int n = sc.nextInt();

        System.out.println("\nPattern for 'NIKHIL':\n");

        for (int i = 0; i < n; i++) {
            printN(n, i); space();
            printI(n, i); space();
            printK(n, i); space();
            printH(n, i); space();
            printI(n, i); space();
            printL(n, i);
            System.out.println();
        }

        sc.close();
    }
}