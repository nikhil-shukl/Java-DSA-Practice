package twoDArray;

public class SpiralForm {
    public static void print(int[][] matrix){
       for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
       }
       System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix = {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
        print(matrix);
        int m = matrix.length;  int n = matrix[0].length;
        int minr = 0,maxr = m-1,minc = 0,maxc = n-1;
         
        System.out.println("Spiral wave form:");
        while(minr<=maxr && minc<=maxc){
            // left to right
            for (int j = minc; j <= maxc; j++) {
                System.out.print(matrix[minr][j]+" ");
            }
            minr++;

            //top to bottom
            if(minr>maxr || minc>maxc) break;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(matrix[i][maxc]+" ");
            }
            maxc--;

            //right to left
            if(minr>maxr || minc>maxc) break;
            for (int j = maxc; j >= minc; j--) {
                System.out.print(matrix[maxr][j]+" ");
            }
            maxr--;

            //bottom to top
            if(minr>maxr || minc>maxc) break;
            for (int i = maxr; i >= minr; i--) {
                System.out.print(matrix[i][minc]+" ");
            }
            minc++;
        }

    }
}
