import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        swap();
    }

    static void swap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();

        System.out.println("Enter b value: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("now a = "+a+" and b = "+b);
    }
}
