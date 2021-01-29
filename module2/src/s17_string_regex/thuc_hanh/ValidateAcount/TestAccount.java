package s17_string_regex.thuc_hanh.ValidateAcount;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typing your account: ");
        String inputAccount = scanner.nextLine();
        boolean isvalid = AccountCheck.validate(inputAccount);
        System.out.println("Account is " + inputAccount +" is valid: "+ isvalid);
    }
}
