package strings;

public class equalsUse {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";
        System.out.println(b == s);
        System.out.println(b.equals(c));
    }
}
