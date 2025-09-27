// package Conditions;

import java.util.Scanner;

public class ReactanglrAreaGreat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of reactangle:");
    int L = sc.nextInt();

     System.out.println("Enter the width of reactangle:");
    int B = sc.nextInt();

    int A,P;
    

    A = (L*B);
    P = (2*L) + (2*B);

    if(A > P) System.out.println("area of reactangle is: "+A+" greater then parameter: "+P);
    if(P > A) System.out.println("parameter of reactangle is: "+P+" which is greater then area of reactangle: "+A);
    if (A==P) System.out.println("Both are same");
    
    sc.close();
  }    
}
