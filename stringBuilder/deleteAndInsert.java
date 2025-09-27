package stringBuilder;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdefbhau");
        sb.deleteCharAt(3);
        System.out.println(sb);

        sb.delete(1,5);
        System.out.println(sb);

        sb.insert(1, " hello ");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
