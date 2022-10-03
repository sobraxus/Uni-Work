package Group_Exercise;
import java.util.Scanner;
public class Area {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       double radii;
        System.out.println("Enter Radius of circle"); radii = Math.sqrt(input.nextDouble());
        double circumference = Math.PI * radii;       System.out.println("Circumference: " + circumference);
    }
}
