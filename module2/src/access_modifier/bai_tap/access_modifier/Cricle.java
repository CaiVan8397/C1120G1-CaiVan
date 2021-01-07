package access_modifier.bai_tap.access_modifier;

public class Cricle {
    private double radius = 1.0;
    private String color = "red";
    public Cricle(){
    }

    public Cricle(double radius) {
        this.radius = radius;
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
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class  TestCircle {
    public static void main(String[] args) {
        Cricle cr1 = new Cricle(5.0);
        System.out.println("Hinh tron co ban kinh: " + cr1.getRadius());
        System.out.println("Dien tich hinh tron la: " + cr1.area());
    }
}
