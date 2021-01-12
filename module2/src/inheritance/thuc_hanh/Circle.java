package inheritance.thuc_hanh;

public class Circle extends Shape {
    private double radius = 0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getAre(){
        return 2*Math.PI*this.radius;
    }
    public double getPerimeter(){
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", which is a subclass of: " + super.toString();
    }


    public static void main(String[] args) {
        Circle cricle = new Circle("blue", false, 5);
        System.out.println(cricle);
    }
}
