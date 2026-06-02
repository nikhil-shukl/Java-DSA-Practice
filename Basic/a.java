public class a {
    public static void main(String [] args){ 
        int n = 7;

        for(int i = 1;i <= n;i++){
             for(int k = n-i;k >= 1;k--){
                System.out.print(" ");
            }

            for(int j = 0;j < i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 
