package s7_abstract_class_interface.bai_tap.bai2;

import inheritance.thuc_hanh.Square;

public class ColorableSquare extends Square implements Colorable {
    public ColorableSquare() {
    }

    public ColorableSquare(double size) {
        super(size);
    }

    public ColorableSquare(String color, boolean filled, double size) {
        super(color, filled, size);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides");
    }
}
