// package Pattern_Printing.Special_pattern;

import java.util.Scanner;

public class binaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }



        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
                
        //       if(i%2==1 && j%2==1){
        //          System.out.print(1+" ");
        //       }else if(i%2==0 && j%2==0){
        //         System.out.print(1+" ");
        //       }else{
        //         System.out.print(0+" ");
        //       }
        //     }
        //     System.out.println();
        // }
    }
}
