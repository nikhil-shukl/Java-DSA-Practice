package twoDArray;

public class largestElement {
    public static void main(String[] args) {
        int[][] arr = {{23,34,56},{57,87,43}};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max = Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max);
    }
}
