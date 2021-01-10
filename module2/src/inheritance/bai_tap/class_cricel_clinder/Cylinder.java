package inheritance.bai_tap.class_cricel_clinder;

public class Cylinder extends  Cricle{
    private double hight;

    public Cylinder(){
    }

    public Cylinder(double hight) {
        this.hight = hight;
    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getV(){
        return this.hight*Math.PI*super.getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder has hight = " + getHight() + " and radius = " + super.getRadius() + " and coler is " + super.getColor();
    }

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(10,"white",20);
        System.out.println(cy);
    }
}
