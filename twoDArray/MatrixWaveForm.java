package twoDArray;

public class MatrixWaveForm {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{0,4,5}};
         int m = matrix.length-1;
        int n = matrix[0].length-1;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if(i%2 == 0){
                    System.out.print(matrix[i][j]+" ");
                }else{
                    System.out.print(matrix[i][n-j]+" ");
                }
            }
        }


    }
}
