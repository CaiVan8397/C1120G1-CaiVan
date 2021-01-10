package inheritance.bai_tap.class_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        double x, y, z;
        String color;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat cua tam giac");
        x = input.nextDouble();
        System.out.println("Nhap canh thu 2 cua tam giac");
        y = input.nextDouble();
        System.out.println("Nhap canh thu 3 cua tam giac");
        z= input.nextDouble();
        System.out.println("Nhap mau cua tam giac");
        color = input.next();
        System.out.println("Trang thai cua hinh");
        Triangle tri = new Triangle(color,true,x,y,z);
        System.out.println(tri);
    }
}
