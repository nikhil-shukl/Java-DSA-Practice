package twoDArray;

import java.util.Scanner;

public class storeMarkandRollno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] stud = new int[4][2];

        System.out.println("Enter Rollno and  of four students:");
        for (int i = 0; i < stud.length; i++) {
            for (int j = 0; j < stud[0].length; j++) {
                stud[i][j] = sc.nextInt();
            }
        }

         for (int i = 0; i < stud.length; i++) {
            for (int j = 0; j < stud[0].length; j++) {
                System.out.print(stud[i][j]+" ");
            }
            System.out.println();
        }
    }
}
