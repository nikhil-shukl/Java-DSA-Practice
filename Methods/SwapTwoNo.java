// package Methods;

import java.util.Scanner;

public class SwapTwoNo {
    public static void swap(int x,int y){
        int sp = x;
        x = y;
        y = sp;
       System.out.print(x+"  "+y);
    
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        swap(a,b);

    }
}
