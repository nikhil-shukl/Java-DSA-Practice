package strings;

public class interning {
    public static void main(String[] args) {
        String s = "good";
        // s.charAt(0) = 'w';   // error not change one character
        s = "wood";
        String t = s;
        System.out.println(s);  
        
        String r = new String("good");// by new key create new string space
        
    }
}