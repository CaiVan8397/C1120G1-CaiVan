package s7_abstract_class_interface.thuc_hanh.interface_comparator;

import s6_inheritance.thuc_hanh.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(5.0);
        circles[1] = new Circle(3.6);
        circles[2] = new Circle("Pink", true,4.0);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles){
            System.out.println(circle);
        }
        Comparator circleComparator = new CricleComparator();
        Arrays.sort(circles, circleComparator);
        System.out.println("After-sorted:");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
