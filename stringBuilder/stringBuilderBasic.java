package stringBuilder;

public class stringBuilderBasic {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
         System.out.println(sb.capacity()); // capacity of StringBuilder bydefault 16 if extra char add then increase

         StringBuilder sb2 = new StringBuilder("abcd");
         System.out.println(sb2.capacity());
         
          StringBuilder sb3 = new StringBuilder(5);
         System.out.println(sb3.capacity()); 

    }
}   