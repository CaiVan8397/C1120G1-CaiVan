package array_and_method.thuc_hanh;

import java.util.Scanner;

public class CurrencyConservationProgram {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static void main(String[] args) {
        int choice = -1;
        double doF, doC;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap do F");
                    doF = input.nextInt();
                    System.out.println(celsiusToFahrenheit(doF));
                    break;
                case 2:
                    System.out.println("Nhap do C");
                    doC = input.nextInt();
                    System.out.println(fahrenheitToCelsius(doC));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
