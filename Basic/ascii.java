// package Basic;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);
         
        int i = (int)ch;
        System.out.println(i);
        i++;

        char a = (char)i;        // conversion
        System.out.println(a);  
        
        sc.close();

    }
    
}

// Every char have hai int value im = "A"= 65, "a"= 97, "0"= 48
