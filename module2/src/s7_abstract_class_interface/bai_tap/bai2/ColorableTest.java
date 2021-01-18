package s7_abstract_class_interface.bai_tap.bai2;

import inheritance.thuc_hanh.Circle;
import inheritance.thuc_hanh.Rectangle;
import inheritance.thuc_hanh.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Circle(5.0);
        shape[1] = new Rectangle("pink", true, 7.0, 10);
        shape[2] = new ColorableSquare("yellow", true, 6.0);
        shape[3] = new ColorableSquare("black", false, 8);
        for (Shape shapes : shape){
                System.out.println(shapes);
                if (shapes instanceof ColorableSquare) {
                    ((Colorable) (shapes)).howToColor();
                }
        }
    }
}
