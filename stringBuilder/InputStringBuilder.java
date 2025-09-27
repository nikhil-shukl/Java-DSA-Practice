package stringBuilder;

import java.util.Scanner;

public class InputStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        System.out.println("you written "+sb);
        
        //modify possible in StringBuilder
        sb.setCharAt(0,'A');
        System.out.println(sb);
    }
}
