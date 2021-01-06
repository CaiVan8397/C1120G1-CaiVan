package oop_in_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = this.b*this.b - 4*this.a*this.c;
        return delta;
    }
    public double  getRoot1(){
        double r1 = (-this.b + Math.sqrt(this.b*this.b - 4*this.a*this.c)/(2*this.a));
        return Math.floor(r1 *100)/100;
    }
    public double  getRoot2(){
        double r2 = (-this.b - Math.sqrt(this.b*this.b - 4*this.a*this.c)/(2*this.a));
        return Math.floor(r2 *100)/100;
    }

    public String display(){
        String result="";
        if (getDiscriminant() < 0 ) {
             result = "PT vo nghiem";
        } else if (getDiscriminant() == 0){
            result = "PT co 1 nghiem r = " + getRoot1();
        } else {
            result = "PT co 2 nghiem là: r1 = " + getRoot1() + " ," + "r2 = " + getRoot2();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = input.nextDouble();
        System.out.println("Nhap b: ");
        double b = input.nextDouble();
        System.out.println("Nhap c: ");
        double c = input.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a,b,c);
        System.out.println( pt.display());
    }
}
