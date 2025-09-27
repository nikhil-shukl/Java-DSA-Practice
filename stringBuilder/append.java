package stringBuilder;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append(" jalwa");
        System.out.println(sb);
        sb.append(9);
        System.out.println(sb);

        char[] ch = {'O','K'};
        sb.append(ch);
        System.out.println(sb);

        // int[] arr = {1,2};
        // sb.append(arr);
        // System.out.println(sb);  // not work print address 


    }
}
