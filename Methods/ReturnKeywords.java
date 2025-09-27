// package Methods;

public class ReturnKeywords {

    public static void greet(int x){
      
        if(x>10) return;                            // return work if x is 12 no print return act as break;
        System.out.println("one digit number");
    }
    public static void main(String[] args) {
        greet(5);
    }
}
