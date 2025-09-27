// package Basic;
import java.util.Scanner;

public class InputVolumeOfSphere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius:");

        double r = sc.nextDouble();
        double V = 1.34 * 3.14 * r*r*r;

        System.out.println("volume of a sphere is "+V);

        sc.close();
    }
}