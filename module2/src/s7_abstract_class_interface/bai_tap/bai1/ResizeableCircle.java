package s7_abstract_class_interface.bai_tap.bai1;

import s6_inheritance.thuc_hanh.Circle;

public class ResizeableCircle extends Circle implements Resizeable{
    public ResizeableCircle() {
    }

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public ResizeableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public void resize(double percent) {
        System.out.println(this.getAre() * (1 + percent/100 ));
    }
}
