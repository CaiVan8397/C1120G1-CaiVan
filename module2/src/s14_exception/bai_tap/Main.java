package s14_exception.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first edge: ");
        int a = input.nextInt();
        System.out.println("Input second edge: ");
        int b = input.nextInt();
        System.out.println("Input third edge: ");
        int c = input.nextInt();
        IllegalTriangle illegalTriangle = null;
        try {
            illegalTriangle = new IllegalTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
        System.out.println("End program");
    }
}
