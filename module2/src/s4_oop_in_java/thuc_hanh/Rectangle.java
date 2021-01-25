package s4_oop_in_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    private int width, height; //khai báo 2 thuộc tính của class chiều dài và chiều rộng
    public Rectangle(){
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea(){
        return this.width*this.height;
    }
    public int  getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width:");
        int width = input.nextInt();
        System.out.print("Enter the height:");
        int height = input.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
