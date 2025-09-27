package strings;

public class builtInMethodsPartThree {
    public static void main(String[] args) {
        String s = "Hello BHAI";
        // s.toLowerCase();  if do this then print no chnage  -> nothing will happen 

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String a = "Nikhil";
        String b = "Shukla";
        System.out.println(a.concat(" "+b));
        System.out.println(a);
        a = a.concat(" "+b);
        System.out.println(a);
      
    }
}
