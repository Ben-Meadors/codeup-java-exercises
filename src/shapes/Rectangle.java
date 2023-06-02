package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    protected double length;
    protected double width;
    @Override
    public double getPerimeter() {
        return ((2* length) + (2 * width));
    }

    @Override
    public double getArea() {
        return length * width;
    }


    public Rectangle(double length, double width){
        super(length, width);
        this.width = width;
        this.length = length;
    }
}
