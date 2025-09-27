package strings;

import java.util.Scanner;

public class countVowels {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter words:");
       String s = sc.nextLine();
        String v = "aeiouAEIOU";
        
        int count = 0;
        for (int i = 0; i < v.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(v.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println("Total no of vowel is: "+count);
    }
}
