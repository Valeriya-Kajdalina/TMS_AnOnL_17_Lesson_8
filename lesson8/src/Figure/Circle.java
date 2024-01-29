package Figure;

public class Circle extends Figure {
    private static final String NAME = "Circle";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = Math.PI * radius * 2;
        return perimeter;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
