package shapes;
import java.util.Scanner;

public class Cube implements Volume_cal {
    double side;
    public void volume() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input side: ");
        side = sc.nextDouble();
        System.out.println("Volume of cube: " + (side * side * side));
    }
}