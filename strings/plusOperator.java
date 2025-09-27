package strings;

public class plusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "pqr";

        s = s + t;
        s += 10;
        System.out.println(s);
        System.out.println("Score is: "+95); // also type of string

        System.out.println("abc"+10+20); //  starting with char due to convert into character
        System.out.println(10+20+"abc"); // starting with int
    }
}
