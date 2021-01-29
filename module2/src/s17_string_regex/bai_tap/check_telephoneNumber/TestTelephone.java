package s17_string_regex.bai_tap.check_telephoneNumber;

import s17_string_regex.bai_tap.check_className.ClassCheck;

import java.util.Scanner;

public class TestTelephone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typing your telephone number: ");
        String telephone = scanner.nextLine();
        boolean isValidate = TelephoneCheck.validate(telephone);
        System.out.println("Your telephone number is " + telephone + " is validate: " + isValidate);
    }
}
