package stringBuilder;

public class stringBuilderFunction {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("NIKHIL");
        StringBuilder tb = new StringBuilder("madhav");

        System.out.println(sb.compareTo(tb));
        System.out.println(sb.reverse());
    }
}
