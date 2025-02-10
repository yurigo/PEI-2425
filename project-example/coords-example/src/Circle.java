public class Circle {
    private double radius = 5.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void printCircle() {
        System.out.println("Radius: " + radius);
    }
}
