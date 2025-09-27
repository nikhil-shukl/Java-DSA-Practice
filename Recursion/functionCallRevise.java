package Recursion;

public class functionCallRevise {
     // Recursion is function calling itself
    public static void mango(){
        System.out.println("Hi I am in mango");
    }
    public static void banana(){
        mango();
        System.out.println("Hi i am in banana");
    }
    public static void apple(){
       banana();
       System.out.println("I am in apple");
       mango();
    }
    public static void main(String[] args) {
       System.out.println("Hii i am in main");
       apple();

    }

}
