package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input in = new Input();
        do {
            System.out.println("Please enter radius to solve for area and circumference");
            double radius = in.getDouble();
            Circle cir = new Circle(radius);
            System.out.println("This is area: " + cir.getArea());
            System.out.println("This is circumference: " + cir.getCircumference());
            System.out.println("Would you like to continue?");
            in.getString();
        } while (in.yesNo());
    }
}