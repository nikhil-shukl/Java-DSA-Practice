// package Conditions;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter point x");
        int x = sc.nextInt();

        System.out.println("Enter point y");
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println("1st Quadrant");
        }else if(x < 0 && y > 0){
            System.out.println("2nd quadrant");
        }else if(x<0 && y<0){
            System.out.println("3rd quadrant");
        }else if(x>0 && y<0){
            System.out.println("4th quadrant");
        }else if(x==0){
            System.out.println("on the axis");
        }else if(y==0){
            System.out.println("on the y axis ");
        }else{
            System.out.println("x and y both 0");
        }

        sc.close();
    }
}
