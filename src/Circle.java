public class Circle {
    private double radius = 1;
    private String color = "black";

    public Circle(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadius is " + radius + "\nColor is " + color;
    }
}
