package strings;

public class builtInMethodsPartTwo {
   public static void main(String[] args) {
        String s = "techtrendy";
       // indexOf
       System.out.println(s.indexOf('t'));
       System.out.println(s.lastIndexOf('t'));
       System.out.println(s.indexOf('z')); // if not match then show -1
       
       // compareTo
       System.out.println("compareTo operations output:");
    //    String a = "abc";
    //    String b = "abc";

    //    String a = "fbc";
    //    String b = "abc";

        //   String a = "abcikh";
        //   String b = "abc";

        String a = "ABC";
       String b = "abc";   // if different subtract by using ascii value
       
       System.out.println(a.compareTo(b));

       String c = "coding is key of success";
       System.out.println(c.contains("fo"));
       System.out.println(c.startsWith("coding"));
       System.out.println(c.endsWith("ess"));
       
    }
}