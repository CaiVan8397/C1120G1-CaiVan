package loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhap chieu dai");
                    int cd = sc.nextInt();
                    System.out.println("Nhap chieu rong");
                    int cr = sc.nextInt();
                    for (int i=1; i <=cr; i++) {
                        for (int j = 1; j <= cd; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 7; i++) {
                        for (int j = 7; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 1; i <= 7; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 3:
                    for (int i = 1; i <=15; i ++){
                        for (int j = 1; j <=i; j ++){
                            System.out.print(" ");
                        }
                        for (int m = 15; m >= i; m--){
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
            }
        }
    }
}
