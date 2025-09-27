package twoDArray;

import java.util.Scanner;

public class outputPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        int m = arr.length; //number if rows
        int n = arr[0].length; // print colum of zeroth rows 
        
        System.out.println("Enter the number:");
        //input
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
