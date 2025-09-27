package twoDArray;

public class basicDeclaration {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];    // 3 rows and 3 colums 
        //initialize
        grid[0][0] = 10;
        grid[0][1] = 20;
        grid[0][2] = 30;
        grid[1][0] = 40;

        System.out.println(grid[1][2]);
        System.out.println(grid[0][2]);

    }
}
