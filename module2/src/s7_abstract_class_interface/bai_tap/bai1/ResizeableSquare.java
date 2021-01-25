package s7_abstract_class_interface.bai_tap.bai1;

import s6_inheritance.thuc_hanh.Square;

public class ResizeableSquare extends Square implements Resizeable {
    public ResizeableSquare() {
    }

    public ResizeableSquare(double size) {
        super(size);
    }

    public ResizeableSquare(String color, boolean filled, double size) {
        super(color, filled, size);
    }

    @Override
    public void resize(double percent) {
        System.out.println(this.getArea() + (1 + percent/100 ));
    }
}
