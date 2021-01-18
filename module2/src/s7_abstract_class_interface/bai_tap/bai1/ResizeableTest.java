package s7_abstract_class_interface.bai_tap.bai1;

import inheritance.thuc_hanh.Shape;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new ResizeableCircle(3.0);
        shapes[1] = new ResizeableRectangle(5,6);
        shapes[2] = new ResizeableSquare(5.0);

        for (Shape shape : shapes){
            System.out.println("Before resize: ");
            // tạo biến  resizeableShape = null; nhận kiểu dữ liệu interface Resizeable
            Resizeable resizeableShape = null;

            if (shape instanceof ResizeableCircle){
                resizeableShape = (ResizeableCircle) (shape); // biến resizeableShape là đối tượng của shape có kiểu dữ liệu là ResizeableCircle
                System.out.println(((ResizeableCircle) shape).getAre());
            } else if (shape instanceof ResizeableRectangle){
                resizeableShape = (ResizeableRectangle) (shape);
                System.out.println(((ResizeableRectangle) shape).getArea());
            } else if (shape instanceof ResizeableSquare){
                resizeableShape = (ResizeableSquare) (shape);
                System.out.println(((ResizeableSquare) shape).getArea());
            }
            Random random = new Random();
            // random.nextInt() tạo random 1 số int từ 0 -> bế hơn 99, nên cần +1
            int percent = random.nextInt(99) +1;
            System.out.println("Percent : "+percent+" %");
            System.out.print("After resize : ");

            resizeableShape.resize(percent);
            System.out.println(resizeableShape+"\n");
            System.out.println(((ResizeableCircle)shapes[0]).getAre());

        }
    }
}
