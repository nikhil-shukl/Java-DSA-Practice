package twoDArray;

import java.util.Scanner;

public class transposeMarix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of matrix:");
        int m = sc.nextInt();

        System.out.println("Enter col of matrix:");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter element of matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[n][m];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            transpose[i][j] = matrix[j][i];
             System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
