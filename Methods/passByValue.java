// package Methods;

public class passByValue {
      public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }

    public static void change(int x){
        x =10;
        // System.out.println(x);   // pass by value passed 10
    }
}
