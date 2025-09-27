package twoDArray;

public class productTwoMatrix {
    public static void print(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{1,2,3,4},{5,2,3,1},{3,1,1,2}};
         
        if(a[0].length != b.length){
            System.out.println("Invalid Matrix");
        }
        
        int[][] c = new int[2][4];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                for (int j2 = 0; j2 < b.length; j2++) {
                    c[i][j] += a[i][j2] * b[j2][j];
                }
            }
        }
        print(a);
        print(b);
        print(c);
    }
}
