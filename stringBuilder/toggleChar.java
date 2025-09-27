package stringBuilder;

import java.util.*;

public class toggleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        StringBuilder s = new StringBuilder(sc.nextLine());

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
             int k = (int)a;
            if(k >=65 && k<=90){
              k += 32;
              char p = (char)k;
               s.setCharAt(i,p);
            }else if(k >= 97 && k <= 122){
                 k -= 32;
              char p = (char)k;
              s.setCharAt(i,p);
            }
        }
        System.out.println(s);
    }
}
