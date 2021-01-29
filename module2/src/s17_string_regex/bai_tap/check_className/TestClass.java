package s17_string_regex.bai_tap.check_className;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typing your class name: ");
        String className = scanner.nextLine();
        boolean isValidate = ClassCheck.validate(className);
        System.out.println("Class name is " + className + " is validate: " + isValidate);
    }
}
