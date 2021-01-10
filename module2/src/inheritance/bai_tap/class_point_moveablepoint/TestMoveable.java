package inheritance.bai_tap.class_point_moveablepoint;

public class TestMoveable {
    public static void main(String[] args) {
        Point p = new Point(10,12);
        MoveablePoint m = new MoveablePoint(5,8);
        System.out.println(m);
        System.out.println(m.move());
        System.out.println(m.move());
    }
}
