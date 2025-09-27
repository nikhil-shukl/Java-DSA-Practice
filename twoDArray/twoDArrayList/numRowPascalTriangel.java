package twoDArray.twoDArrayList;

import java.util.*;

public class numRowPascalTriangel {
    public static int fact(int x){
          int xFact = 1;
        for(int i=x;i>=1;i--){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter RowNo:");
        int n = sc.nextInt();
         ArrayList<ArrayList<Integer>> l = new ArrayList<>();
      
       for (int i = 0; i < n; i++) {
           ArrayList<Integer> x = new ArrayList<>();
           for (int j = 0; j <= i; j++) {
             int iCj =fact(i)/(fact(j)*fact(i-j));
              x.add(iCj);
           }
           l.add(x);

           for (int val : x) {
                System.out.print(val + " ");
            }
            System.out.println();
       }
          sc.close();
    }
}
