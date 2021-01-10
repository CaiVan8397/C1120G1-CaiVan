package inheritance.bai_tap.class_cricel_clinder;

public class Cricle {
    private double radius;
    private String color;

    public Cricle(){
    }

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return 2*Math.PI*this.radius;
    }
    public double getPerimeter(){
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "Cricle has " +
                "radius = " + getRadius() +
                ", color = '" + getColor() ;
    }

    public static void main(String[] args) {
        Cricle c = new Cricle(10,"pink");
        System.out.println(c);
        System.out.println("Area = " + c.getArea());
        System.out.println("Perimeter = " + c.getPerimeter());
    }
}
