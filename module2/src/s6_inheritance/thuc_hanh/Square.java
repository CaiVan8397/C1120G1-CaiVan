package s6_inheritance.thuc_hanh;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double size) {
        super(size,size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + " which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Square squ = new Square("black", true,10);
        System.out.println(squ);
    }
}
